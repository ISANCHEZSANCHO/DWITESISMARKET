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


    public boolean add(Language language){
        String sql = "INSERT INTO languages(language_id, language_name, language_description) " +
                "VALUES(" + language.getIdAsString() + ", " +
                language.getNameAsValue() + ")";
        return change(sql);

    }
    public boolean delete(Language language) {
        String sql = "DELETE FROM languages WHERE language_id = " + language.getIdAsString();
        return change(sql);
    }
    public boolean delete(String name) {
        return change("DELETE FROM language WHERE language_name = " +
                "'" + name + "'");
    }

    public boolean update(Language language) {
        String sql = "UPDATE languages SET language_name = " + language.getNameAsValue() +
                " WHERE language_id = " + language.getIdAsString();
        return change(sql);
    }






}
