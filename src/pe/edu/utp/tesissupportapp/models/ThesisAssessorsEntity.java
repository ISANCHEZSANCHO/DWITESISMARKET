package pe.edu.utp.tesissupportapp.models;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by KEVIN on 1/07/2017.
 */
public class ThesisAssessorsEntity extends BaseEntity {

    public ThesisAssessorsEntity(Connection connection) {
        super(connection, "thesis_assessors");
    }

    public ThesisAssessorsEntity() {
        super();
    }

    List<ThesisAssessor> findAll() {
        return findByCriteria("");
    }

    public ThesisAssessor findById(int id) {
        String criteria = " id = " +
                String.valueOf(id);
        return findByCriteria(criteria).get(0);
    }

    public ThesisAssessor findByName(String name) {
        String criteria = " username = '" +
                name + "'";
        return findByCriteria(criteria).get(0);
    }

    public ThesisAssessor findByIdByEmailPassword(String email, String password) {
        String criteria= " email = '"+email+"' and password = '"+password+"'";
        return findByCriteria(criteria).get(0);
    }


    public List<ThesisAssessor> findAllOrderedByName() {
        String criteria = "true ORDER BY first_name";
        return findByCriteria(criteria);
    }


    public List<ThesisAssessor> findByCriteria(String criteria) {
        String sql = getDefaultQuery() + (criteria.equalsIgnoreCase("") ? "" : " WHERE " + criteria);
        List<ThesisAssessor> thesisAssessors = new ArrayList<>();
        try {
            ResultSet resultSet = getConnection().createStatement().executeQuery(sql);
            if (resultSet == null) return null;
            while (resultSet.next()) {
                thesisAssessors.add((new ThesisAssessor())
                        .setId(resultSet.getInt("id"))
                        .setUsername(resultSet.getString("username"))
                        .setPassword(resultSet.getString("password"))
                        .setLastName(resultSet.getString("last_name"))
                        .setFirstName(resultSet.getString("first_name"))
                        .setEmail(resultSet.getString("email"))
                        .setPhotoPath(resultSet.getString("photo_path"))
                        .setPhoneNumber(resultSet.getInt("phone_number"))
                        .setGender(resultSet.getString("gender"))
                        .setDegreeDocument(resultSet.getString("degree_document"))
                        .setStreet(resultSet.getString("country"))
                        .setCity(resultSet.getString("city"))
                        .setCountry(resultSet.getString("street"))
                        .setCvPath(resultSet.getString("cv_path")));
            }
            return thesisAssessors;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean add(ThesisAssessor thesisAssessor) {
        String sql = "INSERT INTO thesis_assessors(id, username, password, last_name, first_name, email, photo_path, phone_number, gender, degree_document, country, city, street, cv_path) " +
                "VALUES(" +
                thesisAssessor.getId() + ", " +
                "'" + thesisAssessor.getUsername() + "'" + ", " +
                "'" + thesisAssessor.getPassword() + "'" + ", " +
                "'" + thesisAssessor.getLastName() + "'" + ", " +
                "'" + thesisAssessor.getFirstName() + "'" + ", " +
                "'" + thesisAssessor.getEmail() + "'" + ", " +
                "'" + thesisAssessor.getPhotoPath() + "'" + ", " +
                thesisAssessor.getPhoneNumberAsString() + ", " +
                "'" + thesisAssessor.getGender() + "'" + ", " +
                "'" + thesisAssessor.getDegreeDocument() + "'" + ", " +
                "'" + thesisAssessor.getCountry() + "'" + ", " +
                "'" + thesisAssessor.getCity() + "'" + ", " +
                "'" + thesisAssessor.getStreet() + "'" + ", " +
                "'" + thesisAssessor.getCvPath() + "'" + ")";
        return change(sql);
    }

    public boolean delete(ThesisAssessor thesisAssessor) {
        String sql = "DELETE FROM thesis_assessors WHERE id = " + thesisAssessor.getIdAsValue();
        return change(sql);
    }

    public boolean delete(String name) {
        return change("DELETE FROM thesis_assessors WHERE username = " + "'" + name + "'");
    }

    public boolean update(ThesisAssessor thesisAssessor) {
        String sql = "UPDATE thesis_assessors SET " +
                "id = " + thesisAssessor.getId() +
                "username = " + "'" + thesisAssessor.getUsername() + "'" +
                "password = " + "'" + thesisAssessor.getPassword() + "'" +
                "last_name = " + "'" + thesisAssessor.getLastName() + "'" +
                "first_name = " + "'" + thesisAssessor.getFirstName() + "'" +
                "email = " + "'" + thesisAssessor.getEmail() + "'" +
                "photo_path = " + "'" + thesisAssessor.getPhotoPath() + "'" +
                "phone_number = " + thesisAssessor.getPhoneNumber() +
                "gender = " + "'" + thesisAssessor.getGender() + "'" +
                "degree_document = " + "'" + thesisAssessor.getDegreeDocument() + "'" +
                "country = " + "'" + thesisAssessor.getCountry() + "'" +
                "city = " + "'" + thesisAssessor.getCity() + "'" +
                "street = " + "'" + thesisAssessor.getStreet() + "'" +
                "cv_path = " + "'" + thesisAssessor.getCvPath() + "'" + ")";
        return change(sql);
    }

       public ThesisAssessor findByEmailAndPassword(String email, String password) {
        return findIdByEmailPassword(email,password).get(0);
    }

    public List<ThesisAssessor> findIdByEmailPassword(String email, String password) {
        String sql ="select id,username,password,last_name,first_name,email,photo_path,phone_number,gender,degree_document,country,city,street,cv_path from thesis_assessors where email='"+ email+"' and password ='"+password+"'";
        List<ThesisAssessor> thesisAssessors = new ArrayList<>();
        try {
            ResultSet rs = getConnection().createStatement().executeQuery(sql);
            if(rs == null) return null;
            while(rs.next()) thesisAssessors.add(ThesisAssessor.build(rs));
            return thesisAssessors;
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return thesisAssessors;
    }


   /*  private Connection conn = null;
   private Statement st = null;
    private ResultSet rs = null;

    public boolean validar(String email ,
                           String password ){
        boolean encontrado = false;
        try {
            conn = this.getConnection();
            st = conn.createStatement();
            rs=st.executeQuery("select * from" +
                    " thesisassessorsbd.thesis_assessors where email = '"+email+"' and password = '"+password+"'");
            if (rs.next()){
                encontrado=true;
            }
            this.closesConnection();
        }catch (Exception e){

        }
        return encontrado;
    }*/


}

