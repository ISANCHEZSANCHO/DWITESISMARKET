package pe.edu.utp.tesissupportapp.models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by George on 17/06/2017.
 */
public class StatusEntity extends BaseEntity {

    public StatusEntity(Connection connection){
        super(connection,"statuses");

}
    public StatusEntity() {super ();}

    List<Status> findAll(){
        return findByCriteria("");
    }

    public Status findById (int id) {

        String criteria = "id = " +
                String.valueOf(id);
        return findByCriteria(criteria).get(0);
    }
    public List<Status> findAllOrderedByName(){
        String criteria ="true ORDER BY name";
        return findByCriteria(criteria);
    }

    public List<Status> findByCriteria(String criteria){
        String sql = getDefaultQuery() +
                criteria == "" ? "" : " WHERE " + criteria;
        List <Status> statuses = new ArrayList<>();
        try{
            ResultSet resultSet = getConnection()
                    .createStatement()
                    .executeQuery(sql);
            if (resultSet==null) return null;
            while (resultSet.next()){
                statuses.add((new Status())
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


    public boolean add(Status status){
        String sql = "INSERT INTO status(id, name, description) " +
                "VALUES(" + status.getIdAsString() + ", " +
                status.getNameAsValue() +
                status.getDescriptionAsValue() + ")";
        return change(sql);

    }
    public boolean delete(Status status) {
        String sql = "DELETE FROM status WHERE id = " + status.getIdAsString();
        return change(sql);
    }
    public boolean delete(String name) {
        return change("DELETE FROM status WHERE name = " +
                "'" + name + "'");
    }

    public boolean update(Status status) {
        String sql = "UPDATE levels SET " +
                "name = " + status.getNameAsValue() + ", " +
                "description = " + status.getDescriptionAsValue() + ", " +
                " WHERE id = " + status.getIdAsString();
        return change(sql);
    }









}

