package pe.edu.utp.tesissupportapp.models;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by USER on 16/06/2017.
 */
public class StudyCenter {

    private int id;
    private String name;
    private String description;
    private String street;
    private String city;
    private String country;
    private String phone;
    private String photo;

    public StudyCenter(int id, String name, String description, String street, String city, String country, String phone, String photo) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.street = street;
        this.city = city;
        this.country = country;
        this.phone = phone;
        this.photo = photo;
    }

    public StudyCenter() {

    }


    public int getId() {
        return id;
    }

    public String getIdAsString() {
        return String.valueOf(getId());
    }

    public StudyCenter setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public StudyCenter setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public StudyCenter setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getStreet() {
        return street;
    }

    public StudyCenter setStreet(String street) {
        this.street = street;
        return this;
    }

    public String getCity() {
        return city;
    }

    public StudyCenter setCity(String city) {
        this.city = city;
        return this;
    }

    public String getCountry() {
        return country;
    }

    public StudyCenter setCountry(String country) {
        this.country = country;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public StudyCenter setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getPhoto() {
        return photo;
    }

    public StudyCenter setPhoto(String photo) {
        this.photo = photo;
        return this;
    }

    public static StudyCenter build(ResultSet resultSet) {
        try {
            return (new StudyCenter())
                    .setId(resultSet.getInt("studies_center_id"))
                    .setName(resultSet.getString("studies_center_name"))
                    .setDescription(resultSet.getString("studies_center_description"))
                    .setStreet(resultSet.getString("studies_center_street"))
                    .setCity(resultSet.getString("studies_center_city"))
                    .setCountry(resultSet.getString("studies_center_country"))
                    .setPhone(resultSet.getString("studies_center_phone"))
                    .setPhoto(resultSet.getString("studies_center_photo"));

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
