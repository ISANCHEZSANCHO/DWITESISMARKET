package pe.edu.utp.tesissupportapp.models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 * Created by George on 17/06/2017.
 */
public class LanguagesEntity extends BaseEntity {

    public LanguagesEntity (Connection connection){
        super(connection,"languages");

    }
    public LanguagesEntity () {super ();}

    List<Language> findAll(){
        return findByCriteria("");
    }

    public Language findById (int id) {

        String criteria = "language_id = " +
                String.valueOf(id);
        return findByCriteria(criteria).get(0);
    }
        public List<Language> findAllOrderedByName(){
            String criteria ="true ORDER BY category_name";
            return findByCriteria(criteria);
        }

        public List<Language> findByCriteria(String criteria){
            String sql = getDefaultQuery() +
                    criteria == "" ? "" : " WHERE " + criteria;
            List <Language> languages = new ArrayList<>();
            try{
                ResultSet resultSet = getConnection()
                        .createStatement()
                        .executeQuery(sql);
                if (resultSet==null) return null;
                while (resultSet.next()){
                    languages.add((new Language())
                            .setId(resultSet.getInt("language_id"))
                            .setName(resultSet.getString("language_name"))
                            .setDescription(resultSet.getString("language_description"))

                    );




                }
                return languages;
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
