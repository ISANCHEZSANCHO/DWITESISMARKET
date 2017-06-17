package pe.edu.utp.tesissupportapp.models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by USER on 16/06/2017.
 */
public class CategoryEntity extends BaseEntity {

    public CategoryEntity(Connection connection) {
        super(connection, "categories");
    }

    public CategoryEntity(){ super();}

    List<Category> findAll() {
        return findByCriteria("");
    }

    public Category findById(int id) {
        String criteria = " category_id = " +
                String.valueOf(id);
        return findByCriteria(criteria).get(0);
    }

    public List<Category> findAllOrderedByName() {
        String criteria = "true ORDER BY category_name";
        return findByCriteria(criteria);
    }

    public List<Category> findByCriteria(String criteria) {
        String sql = getDefaultQuery() +
                criteria == "" ? "" : " WHERE " + criteria;
        List<Category> categories = new ArrayList<>();
        try {
            ResultSet resultSet = getConnection()
                    .createStatement()
                    .executeQuery(sql);
            if(resultSet == null) return null;
            while(resultSet.next()) {
                categories.add((new Category())
                        .setId(resultSet.getInt("category_id"))
                        .setName(resultSet.getString("category_name"))
                        .setDescription(resultSet.getString("category_description"))
                        .setPhoto(resultSet.getString("category_photo"))
                );
            }
            return categories;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean add(Category category) {
        String sql = "INSERT INTO categories(category_id, category_name, category_description, category_photo) " +
                "VALUES(" + category.getIdAsString() + ", " +
                category.getNameAsValue() + ")";
        return change(sql);
    }

    public boolean delete(Category category) {
        String sql = "DELETE FROM categories WHERE category_id = " + category.getIdAsString();
        return change(sql);
    }

    public boolean delete(String name) {
        return change("DELETE FROM categories WHERE category_name = " +
                "'" + name + "'");
    }

       public boolean update(Category category) {
        String sql = "UPDATE categories SET category_name = " + category.getNameAsValue() +
                " WHERE category_id = " + category.getIdAsString();
        return change(sql);
    }



}
