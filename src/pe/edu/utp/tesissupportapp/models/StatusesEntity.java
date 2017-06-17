package pe.edu.utp.tesissupportapp.models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by George on 17/06/2017.
 */
public class StatusesEntity extends BaseEntity {

    public StatusesEntity(Connection connection){
        super(connection,"statuses");

}
    public StatusesEntity() {super ();}

    List<Statuses> findAll(){
        return findByCriteria("");
    }

    public Statuses findById (int id) {

        String criteria = "status_id = " +
                String.valueOf(id);
        return findByCriteria(criteria).get(0);
    }
    public List<Statuses> findAllOrderedByName(){
        String criteria ="true ORDER BY status_name";
        return findByCriteria(criteria);
    }

    public List<Statuses> findByCriteria(String criteria){
        String sql = getDefaultQuery() +
                criteria == "" ? "" : " WHERE " + criteria;
        List <Statuses> statuses = new ArrayList<>();
        try{
            ResultSet resultSet = getConnection()
                    .createStatement()
                    .executeQuery(sql);
            if (resultSet==null) return null;
            while (resultSet.next()){
                statuses.add((new Statuses())
                        .setId(resultSet.getInt("status_id"))
                        .setName(resultSet.getString("status_name"))
                        .setDescription(resultSet.getString("status_description"))

                );




            }
            return statuses;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


    public boolean add(Statuses statuses){
        String sql = "INSERT INTO statuses(status_id, status_name, status_description) " +
                "VALUES(" + statuses.getIdAsString() + ", " +
                statuses.getNameAsValue() + ")";
        return change(sql);

    }
    public boolean delete(Statuses statuses) {
        String sql = "DELETE FROM status WHERE status_id = " + statuses.getIdAsString();
        return change(sql);
    }
    public boolean delete(String name) {
        return change("DELETE FROM status WHERE status_name = " +
                "'" + name + "'");
    }

    public boolean update(Statuses statuses) {
        String sql = "UPDATE status SET status_name = " + statuses.getNameAsValue() +
                " WHERE status_id = " + statuses.getIdAsString();
        return change(sql);
    }









}

