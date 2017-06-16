package pe.edu.utp.tesissupportapp.models;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by USER on 16/06/2017.
 */
public class User {

    private int id;
    private String user;
    private String password;
private String lastName;
    private String firstName;
    private String email;
    private String userPhoto;
    private int phoneNumber1;
    private int phoneNumber2;
    private String gender;
    private String documentDegree;
    private String userStreet;
    private String userCity;
    private String userCountry;

    public User(int id, String user, String password, String lastName, String firstName, String email, String userPhoto, int phoneNumber1, int phoneNumber2, String gender, String documentDegree, String userStreet, String userCity, String userCountrycountry) {
        this.id = id;
        this.user = user;
        this.password = password;
        this.lastName = lastName;
        this.firstName = firstName;
        this.email = email;
        this.userPhoto = userPhoto;
        this.phoneNumber1 = phoneNumber1;
        this.phoneNumber2 = phoneNumber2;
        this.gender = gender;
        this.documentDegree = documentDegree;
        this.userStreet = userStreet;
        this.userCity = userCity;
        this.userCountry = userCountry;
    }

    public User() {

    }


    public int getId() {
        return id;
    }

    public String getIdAsString() {
        return String.valueOf(getId());
    }

        public User setId(int id) {
        this.id = id;
        return this;
    }

    public String getUser() {
        return user;
    }

    public User setUser(String user) {
        this.user = user;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public User setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public User setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getUserPhoto() {
        return userPhoto;
    }

    public User setUserPhoto(String userPhoto) {
        this.userPhoto = userPhoto;
        return this;
    }

    public int getPhoneNumber1() {
        return phoneNumber1;
    }

    public User setPhoneNumber1(int phoneNumber1) {
        this.phoneNumber1 = phoneNumber1;
        return this;
    }

    public int getPhoneNumber2() {
        return phoneNumber2;
    }

    public User setPhoneNumber2(int phoneNumber2) {
        this.phoneNumber2 = phoneNumber2;
        return this;
    }

    public String getGender() {
        return gender;
    }

    public User setGender(String gender) {
        this.gender = gender;
        return this;
    }

    public String getDocumentDegree() {
        return documentDegree;
    }

    public User setDocumentDegree(String documentDegree) {
        this.documentDegree = documentDegree;
        return this;
    }

    public String getUserStreet() {
        return userStreet;
    }

    public User setUserStreet(String userStreet) {
        this.userStreet = userStreet;
        return this;
    }

    public String getUserCity() {
        return userCity;
    }

    public User setUserCity(String userCity) {
        this.userCity = userCity;
        return this;
    }

    public String getUserCountry() {
        return userCountry;
    }

    public User setUserCountry(String country) {
        this.userCountry = userCountry;
        return this;
    }


    public static User build(ResultSet resultSet) {
        try {
            return (new User())
                    .setId(resultSet.getInt("user_id"))
                    .setUser(resultSet.getString("user"))
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
                    .setUserCountry(resultSet.getString("user_country")
                                               
                    );

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
