package pe.edu.utp.tesissupportapp.models;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by USER on 16/06/2017.
 */
public class Level {

    private int id;
    private String name;
    private String description;

    public Level(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public Level() {

    }


    public int getId() {
        return id;
    }

    public String getIdAsString() {
        return String.valueOf(getId());
    }

    public Level setId(int id) {
        this.id = id;
        return this;
    }
    public String getNameAsValue() {
        return "'"+getName()+"'";
    }
    public String getName() {
        return name;
    }

    public Level setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Level setDescription(String description) {
        this.description = description;
        return this;

    }

    public static Level build(ResultSet resultSet) {
        try {
            return (new Level())
                    .setId(resultSet.getInt("level_id"))
                    .setName(resultSet.getString("level_name"))
                    .setName(resultSet.getString("level_description"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


}
