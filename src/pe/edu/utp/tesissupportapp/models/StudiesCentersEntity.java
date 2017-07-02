package pe.edu.utp.tesissupportapp.models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by George on 17/06/2017.
 */
public class StudiesCentersEntity extends BaseEntity {


    public StudiesCentersEntity (Connection connection){
        super(connection,"studies_centers");

    }
    public StudiesCentersEntity () {super ();}

    List<StudyCenter> findAll(){
        return findByCriteria("");
    }

    public StudyCenter findById (int id) {

        String criteria = "id = " +
                String.valueOf(id);
        return findByCriteria(criteria).get(0);
    }
    public List<StudyCenter> findAllOrderedByName(){
        String criteria ="true ORDER BY name";
        return findByCriteria(criteria);
    }

    public List<StudyCenter> findByCriteria(String criteria){
        String sql = getDefaultQuery() +
                criteria == "" ? "" : " WHERE " + criteria;
        List <StudyCenter> StudiesCenters = new ArrayList<>();
        try{
            ResultSet resultSet = getConnection()
                    .createStatement()
                    .executeQuery(sql);
            if (resultSet==null) return null;
            while (resultSet.next()){
                StudiesCenters.add((new StudyCenter())
                        .setId(resultSet.getInt("id"))
                        .setName(resultSet.getString("name"))
                        .setDescription(resultSet.getString("description"))
                        .setStreet(resultSet.getString("street"))
                        .setCity(resultSet.getString("city"))
                        .setCountry(resultSet.getString("country"))
                        .setPhone(resultSet.getString("phone"))
                        .setPhotoPath(resultSet.getString("photo_path"))

                );




            }
            return StudiesCenters;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


    public boolean add(StudyCenter studyCenter){
        String sql = "INSERT INTO studies_centers(id, name, description, street, city, country, phone, photo_path) " +
                "VALUES(" + studyCenter.getIdAsString() + ", " +
                studyCenter.getNameAsValue() +
                studyCenter.getDescriptionAsValue() +
                studyCenter.getStreetAsValue() +
                studyCenter.getCityAsValue() +
                studyCenter.getCountryAsValue() +
                studyCenter.getPhoneAsValue() +
                studyCenter.getPhotoPathAsValue() + ")";
        return change(sql);

    }
    public boolean delete(StudyCenter studyCenter) {
        String sql = "DELETE FROM studies_centers WHERE id = " + studyCenter.getIdAsString();
        return change(sql);
    }
    public boolean delete(String name) {
        return change("DELETE FROM studies_centers WHERE name = " +
                "'" + name + "'");
    }

    public boolean update(StudyCenter studyCenter) {
        String sql = "UPDATE studies_centers SET " +
                "name = " + studyCenter.getNameAsValue() + ", " +
                "description = " + studyCenter.getDescriptionAsValue() + ", " +
                "street = " + studyCenter.getStreetAsValue() + ", " +
                "city = " + studyCenter.getCityAsValue() + ", " +
                "country = " + studyCenter.getCountryAsValue() + ", " +
                "phone = " + studyCenter.getPhoneAsValue() + ", " +
                "photo_path = " + studyCenter.getPhotoPathAsValue() + ", " +
                " WHERE id = " + studyCenter.getIdAsString();
        return change(sql);
    }







}
