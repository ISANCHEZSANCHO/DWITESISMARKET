package pe.edu.utp.tesissupportapp.models;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by USER on 16/06/2017.
 */
public class Language {

    private int id;
    private String name;
    private String description;

    public Language(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public Language() {

    }


    public int getId() {
        return id;
    }

    public String getIdAsString() {
        return String.valueOf(getId());
    }

    public Language setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Language setName(String name) {
        this.name = name;
        return this;
    }
    public String getNameAsValue() {
        return "'"+getName()+"'";
    }
    public String getDescription() {
        return description;
    }

    public Language setDescription(String description) {
        this.description = description;
        return this;
    }

    public static Language build(ResultSet resultSet) {
        try {
            return (new Language())
                    .setId(resultSet.getInt("language_id"))
                    .setName(resultSet.getString("language_name"))
                    .setName(resultSet.getString("language_description"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
