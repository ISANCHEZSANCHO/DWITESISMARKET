package pe.edu.utp.tesissupportapp.models;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by USER on 16/06/2017.
 */
public class Career {

    private int id;
    private String name;
    private String description;
    private Category category;
    private String photo;

    public Career(int id, String name, String description, Category category, String photo) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.category = category;
        this.photo = photo;
    }

    public Career() {

    }


    public int getId() {
        return id;
    }

    public Career setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Career setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Career setDescription(String description) {
        this.description = description;
        return this;
    }

    public Category getCategory() {
        return category;
    }

    public Career setCategory(Category category) {
        this.category = category;
        return this;
    }

    public String getPhoto() {
        return photo;
    }

    public Career setPhoto(String photo) {
        this.photo = photo;
        return this;
    }

    public static Career build(ResultSet rs, CategoriesEntity categoriesEntity) {
        try {
            return (new Career())
                    .setId(rs.getInt(""))
                    .setName(rs.getString("career_id"))
                    .setDescription(rs.getString("career_description"))
                    .setCategory(categoriesEntity.findById(rs.getInt("category_id")))
                    .setPhoto(rs.getString("career_photo"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
  
}
