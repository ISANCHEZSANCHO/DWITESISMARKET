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

        String criteria = "id = " +
                String.valueOf(id);
        return findByCriteria(criteria).get(0);
    }
    public List<Statuses> findAllOrderedByName(){
        String criteria ="true ORDER BY name";
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
                        .setId(resultSet.getInt("id"))
                        .setName(resultSet.getString("sname"))
                        .setDescription(resultSet.getString("description"))

                );




            }
            return statuses;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


    public boolean add(Statuses statuses){
        String sql = "INSERT INTO statuses(id, name, description) " +
                "VALUES(" + statuses.getIdAsString() + ", " +
                statuses.getNameAsValue() +
                statuses.getDescriptionAsValue() + ")";
        return change(sql);

    }
    public boolean delete(Statuses statuses) {
        String sql = "DELETE FROM status WHERE id = " + statuses.getIdAsString();
        return change(sql);
    }
    public boolean delete(String name) {
        return change("DELETE FROM status WHERE name = " +
                "'" + name + "'");
    }

    public boolean update(Statuses statuses) {
        String sql = "UPDATE levels SET " +
                "name = " + statuses.getNameAsValue() + ", " +
                "description = " + statuses.getDescriptionAsValue() + ", " +
                " WHERE id = " + statuses.getIdAsString();
        return change(sql);
    }









}

