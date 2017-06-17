package pe.edu.utp.tesissupportapp.models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by USER on 16/06/2017.
 */
public class CareersEntity extends BaseEntity {
    public CareersEntity() {
        super();
        setTableName("careers");
    }

    public CareersEntity(Connection connection) {
        super(connection, "careers");
    }

    public List<Career> findByCriteria(
            String criteria,
            CategoriesEntity categoriesEntity) {
        String sql = getDefaultQuery() +
                (criteria.isEmpty() ? "" : " WHERE " + criteria);
        List<Career> careers = new ArrayList<>();
        try {
            ResultSet rs = getConnection()
                    .createStatement()
                    .executeQuery(sql);
            if(rs == null) return null;
            while(rs.next()) {
                careers.add(
                        Career.build(rs, categoriesEntity));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return careers;
    }

    public List<Career> findAll(CategoriesEntity categoriesEntity) {
        return findByCriteria("", categoriesEntity);
    }

    public Career findById(int id, CategoriesEntity categoriesEntity) {
        try {
            String sql = "career_id = " + String.valueOf(id);
            return findByCriteria(sql, categoriesEntity).get(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }











}
