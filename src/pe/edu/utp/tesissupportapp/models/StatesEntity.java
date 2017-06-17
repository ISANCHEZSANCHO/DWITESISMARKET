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
        super(connection,"states");

}
    public StatesEntity () {super ();}

    List<State> findAll(){
        return findByCriteria("");
    }

    public State findById (int id) {

        String criteria = "level_id = " +
                String.valueOf(id);
        return findByCriteria(criteria).get(0);
    }
    public List<State> findAllOrderedByName(){
        String criteria ="true ORDER BY states_name";
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
        String sql = "INSERT INTO states(state_id, state_name, state_description) " +
                "VALUES(" + state.getIdAsString() + ", " +
                state.getNameAsValue() + ")";
        return change(sql);

    }
    public boolean delete(State state) {
        String sql = "DELETE FROM states WHERE state_id = " + state.getIdAsString();
        return change(sql);
    }
    public boolean delete(String name) {
        return change("DELETE FROM state WHERE state_name = " +
                "'" + name + "'");
    }

    public boolean update(State state) {
        String sql = "UPDATE levels SET state_name = " + state.getNameAsValue() +
                " WHERE state_id = " + state.getIdAsString();
        return change(sql);
    }









}
