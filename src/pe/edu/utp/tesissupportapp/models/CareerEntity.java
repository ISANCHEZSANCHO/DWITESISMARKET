package pe.edu.utp.tesissupportapp.models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by USER on 16/06/2017.
 */
public class CareerEntity extends BaseEntity {
    public CareerEntity() {
        super();
setTableName("careers");
    }

    public CareerEntity(Connection connection) {
        super(connection, "careers");
    }

    public List<Career> findByCriteria(
            String criteria,
            CategoryEntity categoryEntity) {
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
                        Career.build(rs, categoryEntity));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return careers;
    }

    public List<Career> findAll(CategoryEntity categoryEntity) {
        return findByCriteria("", categoryEntity);
    }

    public Career findById(int id, CategoryEntity categoryEntity) {
        try {
            String sql = "career_id = " + String.valueOf(id);
            return findByCriteria(sql, categoryEntity).get(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }
}
