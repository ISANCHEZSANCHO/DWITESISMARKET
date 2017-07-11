package pe.edu.utp.tesissupportapp.models;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by KEVIN on 1/07/2017.
 */
        public class Student {
            private int id;
            private String username;
            private String password;
            private String lastName;
            private String firstName;
            private String email;
            private String photoPath;
            private int phoneNumber1;
            private int phoneNumber2;
            private String gender;
            private String degreeDocument;
            private String street;
            private String city;
            private String country;

            public Student() {
            }

            public Student(int id, String username, String password, String lastName, String firstName, String email, String photoPath, int phoneNumber1, int phoneNumber2, String gender, String degreeDocument, String street, String city, String country) {
                this.id = id;
                this.username = username;
                this.password = password;
        this.lastName = lastName;
        this.firstName = firstName;
        this.email = email;
        this.photoPath = photoPath;
        this.phoneNumber1 = phoneNumber1;
        this.phoneNumber2 = phoneNumber2;
        this.gender = gender;
        this.degreeDocument = degreeDocument;
        this.street = street;
        this.city = city;
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public String getIdAsString(int id){
        return String.valueOf(id);
    }

    public Student setId(int id) {
        this.id = id;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public Student setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public Student setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Student setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public Student setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Student setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPhotoPath() {
        return photoPath;
    }

    public Student setPhotoPath(String photoPath) {
        this.photoPath = photoPath;
        return this;
    }

    public int getPhoneNumber1() {
        return phoneNumber1;
    }

    public Student setPhoneNumber1(int phoneNumber1) {
        this.phoneNumber1 = phoneNumber1;
        return this;
    }

    public int getPhoneNumber2() {
        return phoneNumber2;
    }

    public Student setPhoneNumber2(int phoneNumber2) {
        this.phoneNumber2 = phoneNumber2;
        return this;
    }

    public String getGender() {
        return gender;
    }

    public Student setGender(String gender) {
        this.gender = gender;
        return this;
    }

    public String getDegreeDocument() {
        return degreeDocument;
    }

    public Student setDegreeDocument(String degreeDocument) {
        this.degreeDocument = degreeDocument;
        return this;
    }

    public String getStreet() {
        return street;
    }

    public Student setStreet(String street) {
        this.street = street;
        return this;
    }

    public String getCity() {
        return city;
    }

    public Student setCity(String city) {
        this.city = city;
        return this;
    }

    public String getCountry() {
        return country;
    }

    public Student setCountry(String country) {
        this.country = country;
        return this;
    }

    public static Student build(ResultSet resultSet) {
        try {
            return (new Student())
                    .setId(resultSet.getInt("id"))
                    .setUsername(resultSet.getString("username"))
                    .setPassword(resultSet.getString("password"))
                    .setLastName(resultSet.getString("last_name"))
                    .setFirstName(resultSet.getString("first_name"))
                    .setEmail(resultSet.getString("email"))
                    .setPhotoPath(resultSet.getString("photo_path"))
                    .setPhoneNumber1(resultSet.getInt("phone_number1"))
                    .setPhoneNumber2(resultSet.getInt("phone_number2"))
                    .setGender(resultSet.getString("gender"))
                    .setDegreeDocument(resultSet.getString("degree_document"))
                    .setStreet(resultSet.getString("street"))
                    .setCity(resultSet.getString("city"))
                    .setCountry(resultSet.getString("country"));

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }




}
