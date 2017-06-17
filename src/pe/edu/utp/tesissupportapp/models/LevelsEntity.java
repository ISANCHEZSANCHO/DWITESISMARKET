package pe.edu.utp.tesissupportapp.models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 * Created by George on 17/06/2017.
 */
public class LevelsEntity extends BaseEntity {


    public LevelsEntity (Connection connection){
        super(connection,"levels");

    }
    public LevelsEntity () {super ();}

    List<Level> findAll(){
        return findByCriteria("");
    }

    public Level findById (int id) {

        String criteria = "level_id = " +
                String.valueOf(id);
        return findByCriteria(criteria).get(0);
    }
    public List<Level> findAllOrderedByName(){
        String criteria ="true ORDER BY level_name";
        return findByCriteria(criteria);
    }

    public List<Level> findByCriteria(String criteria){
        String sql = getDefaultQuery() +
                criteria == "" ? "" : " WHERE " + criteria;
        List <Level> levels = new ArrayList<>();
        try{
            ResultSet resultSet = getConnection()
                    .createStatement()
                    .executeQuery(sql);
            if (resultSet==null) return null;
            while (resultSet.next()){
                levels.add((new Level())
                        .setId(resultSet.getInt("level_id"))
                        .setName(resultSet.getString("level_name"))
                        .setName(resultSet.getString("level_description"))

                );




            }
            return levels;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


    public boolean add(Level level){
        String sql = "INSERT INTO levels(level_id, level_name, level_description) " +
                "VALUES(" + level.getIdAsString() + ", " +
                level.getNameAsValue() + ")";
        return change(sql);

    }
    public boolean delete(Level level) {
        String sql = "DELETE FROM levels WHERE level_id = " + level.getIdAsString();
        return change(sql);
    }
    public boolean delete(String name) {
        return change("DELETE FROM level WHERE level_name = " +
                "'" + name + "'");
    }

    public boolean update(Level level) {
        String sql = "UPDATE levels SET level_name = " + level.getNameAsValue() +
                " WHERE level_id = " + level.getIdAsString();
        return change(sql);
    }





}
