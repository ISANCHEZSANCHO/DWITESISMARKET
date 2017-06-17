package pe.edu.utp.tesissupportapp.models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by George on 17/06/2017.
 */
public class StatesEntity extends BaseEntity {

    public StatesEntity (Connection connection){
        super(connection,"statuses");

}
    public StatesEntity () {super ();}

    List<State> findAll(){
        return findByCriteria("");
    }

    public State findById (int id) {

        String criteria = "status_id = " +
                String.valueOf(id);
        return findByCriteria(criteria).get(0);
    }
    public List<State> findAllOrderedByName(){
        String criteria ="true ORDER BY status_name";
        return findByCriteria(criteria);
    }

    public List<State> findByCriteria(String criteria){
        String sql = getDefaultQuery() +
                criteria == "" ? "" : " WHERE " + criteria;
        List <State> states = new ArrayList<>();
        try{
            ResultSet resultSet = getConnection()
                    .createStatement()
                    .executeQuery(sql);
            if (resultSet==null) return null;
            while (resultSet.next()){
                states.add((new State())
                        .setId(resultSet.getInt("status_id"))
                        .setName(resultSet.getString("status_name"))
                        .setName(resultSet.getString("status_description"))

                );




            }
            return states;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


    public boolean add(State state){
        String sql = "INSERT INTO state(status_id, status_name, status_description) " +
                "VALUES(" + state.getIdAsString() + ", " +
                state.getNameAsValue() + ")";
        return change(sql);

    }
    public boolean delete(State state) {
        String sql = "DELETE FROM status WHERE status_id = " + state.getIdAsString();
        return change(sql);
    }
    public boolean delete(String name) {
        return change("DELETE FROM status WHERE status_name = " +
                "'" + name + "'");
    }

    public boolean update(State state) {
        String sql = "UPDATE status SET status_name = " + state.getNameAsValue() +
                " WHERE status_id = " + state.getIdAsString();
        return change(sql);
    }









}

