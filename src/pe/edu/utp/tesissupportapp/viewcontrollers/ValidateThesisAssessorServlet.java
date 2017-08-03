package pe.edu.utp.tesissupportapp.viewcontrollers;

import pe.edu.utp.tesissupportapp.models.ThesisAssessor;
import pe.edu.utp.tesissupportapp.models.ThesisAssessorsEntity;
import pe.edu.utp.tesissupportapp.services.TAService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by USER on 3/08/2017.
 */
@WebServlet(name = "ValidateThesisAssessorServlet", urlPatterns = "/validateThesisAssessor")
public class ValidateThesisAssessorServlet extends HttpServlet {

    TAService service = new TAService();
    public static String THESISASSESSOR_EDIT_URI = "/Profile.jsp";
    public static String THESISASSESSOR_INDEX_URI = "/login.jsp";
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String email = request.getParameter("email");
        String usuario = "";
        String password = request.getParameter("password");
        ThesisAssessorsEntity t = new ThesisAssessorsEntity();

        if (!request.getParameter("email").equalsIgnoreCase("") && !request.getParameter("password").equalsIgnoreCase("")) {
            try {
                ThesisAssessor thesisAssessor = service.getIdByThesisAssessor(email, password);
                request.setAttribute("thesisAssessor", thesisAssessor);
                RequestDispatcher dispatcher = request.getRequestDispatcher(THESISASSESSOR_EDIT_URI);
                dispatcher.forward(request, response);
                log("INGRESO CORRECTAMENTE THESISASSESSOR");
            } catch (Exception a ) {

                RequestDispatcher dispatcher = request.getRequestDispatcher(THESISASSESSOR_INDEX_URI);
                dispatcher.forward(request, response);
                log("DATOS INGRESADOS INCORRECTAMENTE");
            }

            }

       /* else {


            if (t.validar(email, password) == false) {

                RequestDispatcher dispatcher = request.getRequestDispatcher(THESISASSESSOR_INDEX_URI);
                dispatcher.forward(request, response);
                log("NO HAY DATOS 1");
            }


        }*/


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
