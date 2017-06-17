package pe.edu.utp.tesissupportapp.models;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by USER on 16/06/2017.
 */
public class Category {

    private int id;
    private String name;
    private String description;
    private String photo;

    public Category() {
    }

    public Category(int id, String name, String description, String photo) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.photo = photo;
    }


    public int getId() {
        return id;
    }

    public String getIdAsString() {
        return String.valueOf(getId());
    }

    public Category setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Category setName(String name) {
        this.name = name;
        return this;
    }

    public String getNameAsValue() {
        return "'"+getName()+"'";
    }

    public String getDescription() {
        return description;
    }

    public Category setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getPhoto() {
        return photo;
    }

    public Category setPhoto(String photo) {
        this.photo = photo;
        return this;
    }

    public static Category build(ResultSet resultSet) {
        try {
            return (new Category())
                    .setId(resultSet.getInt("category_id"))
                    .setName(resultSet.getString("category_name"))
                            .setName(resultSet.getString("category_description"))
                                    .setName(resultSet.getString("category_photo")

                    );
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }





}
