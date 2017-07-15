package pe.edu.utp.tesissupportapp.viewcontrollers;

import pe.edu.utp.tesissupportapp.services.TAService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by USER on 14/07/2017.
 */
@WebServlet(name = "Login")
public class Login extends HttpServlet {

    TAService service =new TAService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String email = request.getParameter("email");
        String password = request.getParameter("password");
        if (service.getThesisAssessorByEmail(email, password) == true) {
            RequestDispatcher dispatcher = request.getRequestDispatcher("index2.jsp");
            dispatcher.forward(request, response);
        } else {
            RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
            dispatcher.include(request, response);
        }
    }


    }


