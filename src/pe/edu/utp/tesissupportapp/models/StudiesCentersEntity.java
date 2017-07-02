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
        super(connection,"studiescenters");

    }
    public StudiesCentersEntity () {super ();}

    List<StudyCenter> findAll(){
        return findByCriteria("");
    }

    public StudyCenter findById (int id) {

        String criteria = "studiescenters = " +
                String.valueOf(id);
        return findByCriteria(criteria).get(0);
    }
    public List<StudyCenter> findAllOrderedByName(){
        String criteria ="true ORDER BY studies_center_name";
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
                        .setId(resultSet.getInt("studies_center_id"))
                        .setName(resultSet.getString("studies_center_name"))
                        .setDescription(resultSet.getString("studies_center_description"))
                        .setStreet(resultSet.getString("studies_center_street"))
                        .setCity(resultSet.getString("studies_center_city"))
                        .setCountry(resultSet.getString("studies_center_country"))
                        .setPhone(resultSet.getString("studies_center_phone"))
                        .setPhotoPath(resultSet.getString("studies_center_photo"))

                );




            }
            return StudiesCenters;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


    public boolean add(StudyCenter studyCenter){
        String sql = "INSERT INTO studiescenters(studies_center_id, studies_center_name, studies_center_description) " +
                "VALUES(" + studyCenter.getIdAsString() + ", " +
                studyCenter.getNameAsValue() + ")";
        return change(sql);

    }
    public boolean delete(StudyCenter studyCenter) {
        String sql = "DELETE FROM studiescenters WHERE studies_center_id = " + studyCenter.getIdAsString();
        return change(sql);
    }
    public boolean delete(String name) {
        return change("DELETE FROM studiescenters WHERE studies_center_name = " +
                "'" + name + "'");
    }

    public boolean update(StudyCenter studyCenter) {
        String sql = "UPDATE studiescenters SET studies_center_name = " + studyCenter.getNameAsValue() +
                " WHERE studies_center_id = " + studyCenter.getIdAsString();
        return change(sql);
    }







}
