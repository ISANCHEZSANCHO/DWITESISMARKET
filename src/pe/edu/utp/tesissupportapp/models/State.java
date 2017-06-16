package pe.edu.utp.tesissupportapp.models;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by USER on 16/06/2017.
 */
public class State {

    private int id;
    private String name;
    private String description;

    public State(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public State() {

    }

    public int getId() {
        return id;
    }

    public String getIdAsString() {
        return String.valueOf(getId());
    }

    public State setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public State setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public State setDescription(String description) {
        this.description = description;
        return this;
    }

    public static State build(ResultSet resultSet) {
        try {
            return (new State())
                    .setId(resultSet.getInt("status_id"))
                    .setName(resultSet.getString("status_name"))
                    .setName(resultSet.getString("status_description"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }



}
