package pe.edu.utp.tesissupportapp.models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by George on 17/06/2017.
 */
public class UsersEntity extends BaseEntity {




    public UsersEntity(Connection connection){
        super(connection,"users");

    }
    public UsersEntity() {super ();}

    List<User> findAll(){
        return findByCriteria("");
    }

    public User findById (int id) {

        String criteria = "user_name = " +
                String.valueOf(id);
        return findByCriteria(criteria).get(0);
    }
    public List<User> findAllOrderedByName(){
        String criteria ="true ORDER BY user_id";
        return findByCriteria(criteria);
    }

    public List<User> findByCriteria(String criteria){
        String sql = getDefaultQuery() +
                criteria == "" ? "" : " WHERE " + criteria;
        List <User> Users = new ArrayList<>();
        try{
            ResultSet resultSet = getConnection()
                    .createStatement()
                    .executeQuery(sql);
            if (resultSet==null) return null;
            while (resultSet.next()){
                Users.add((new User())
                        .setId(resultSet.getInt("user_id"))
                        .setUser(resultSet.getString("user_name"))
                        .setPassword(resultSet.getString("password"))
                        .setLastName(resultSet.getString("last_name"))
                        .setFirstName(resultSet.getString("first_name"))
                        .setEmail(resultSet.getString("email"))
                        .setUserPhoto(resultSet.getString("user_photo"))
                        .setPhoneNumber1(resultSet.getInt("phone_number1"))
                        .setPhoneNumber2(resultSet.getInt("phone number2"))
                        .setGender(resultSet.getString("gender"))
                        .setDocumentDegree(resultSet.getString("document_degree"))
                        .setUserStreet(resultSet.getString("user_street"))
                        .setUserCity(resultSet.getString("user_city"))
                        .setUserCountry(resultSet.getString("user_country"))

                );




            }
            return Users;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


    public boolean add(User user){
        String sql = "INSERT INTO users(user_id, user_name, password) " +
                "VALUES(" + user.getIdAsString() + ", " +
                user.getNameAsValue() + ")";
        return change(sql);

    }
    public boolean delete(User user) {
        String sql = "DELETE FROM users WHERE user_id = " + user.getIdAsString();
        return change(sql);
    }
    public boolean delete(String name) {
        return change("DELETE FROM users WHERE user_name = " +
                "'" + name + "'");
    }

    public boolean update(User user) {
        String sql = "UPDATE users SET user_name = " + user.getNameAsValue() +
                " WHERE user_id = " + user.getIdAsString();
        return change(sql);
    }








}
