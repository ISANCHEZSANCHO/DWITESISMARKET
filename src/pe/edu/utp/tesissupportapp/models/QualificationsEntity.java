package pe.edu.utp.tesissupportapp.models;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by KEVIN on 1/07/2017.
 */
public class QualificationsEntity extends BaseEntity {

    public QualificationsEntity(Connection connection) {
        super(connection, "qualifications");
    }

    public QualificationsEntity() {
        super();
    }

    public List<Qualification> findAll(ThesisAssessorsEntity thesisAssessorsEntity, StudentsEntity studentsEntity) {
        return findByCriteria("", thesisAssessorsEntity,studentsEntity);
    }

    public Qualification findById(String id, ThesisAssessorsEntity thesisAssessorsEntity, StudentsEntity studentsEntity) {
        String criteria = "id = " + "'" + id + "'";
        return findByCriteria(criteria, thesisAssessorsEntity,studentsEntity).get(0);
    }

    public List<Qualification> findByCriteria(String criteria, ThesisAssessorsEntity thesisAssessorsEntity, StudentsEntity studentsEntity) {
        String sql = getDefaultQuery() + (criteria.isEmpty() ? "" : " WHERE " + criteria);
        List<Qualification> qualifications = new ArrayList<>();
        try {
            ResultSet rs = getConnection().createStatement().executeQuery(sql);
            if(rs == null) return null;
            while(rs.next()) qualifications.add(Qualification.build(rs,thesisAssessorsEntity,studentsEntity));
            return qualifications;
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return qualifications;
    }

    public List<Qualification> findByStudent(Student student, ThesisAssessorsEntity thesisAssessorsEntity, StudentsEntity studentsEntity) {
        String criteria = "student_id = " + student.getIdAsString();
        return findByCriteria(criteria, thesisAssessorsEntity,studentsEntity);
    }

    public List<Qualification> findAllOrderByNroStars(ThesisAssessorsEntity thesisAssessorsEntity, StudentsEntity studentsEntity, boolean isAscending) {
        return findByCriteria("true ORDER BY nro_stars" + (isAscending ? "" : " DESC"), thesisAssessorsEntity, studentsEntity );
    }

    public boolean add(Qualification qualification) {
        String sql = "INSERT INTO qualifications(id, student_id, assessor_id, date, nro_stars, comment) VALUES(" +
                qualification.getId() + ", " +
                qualification.getStudent().getId() + ", " +
                qualification.getThesisAssessor().getId() +
                "'"+qualification.getDate()+"'"+
                qualification.getNroStars()+
                "'"+qualification.getComment()+"'"+")";
        return change(sql);
    }

    public boolean update(Qualification qualification) {
        String sql = "UPDATE qualifications SET " +
                "id = " + qualification.getId() + ", " +
                "student_id = " + qualification.getStudent().getId() + ", " +
                "assessor_id = " + qualification.getThesisAssessor().getId() + ", " +
                "date = " +"'" + qualification.getDate() + "'" + ", " +
                "nro_stars = " + qualification.getNroStars() + ", " +
                "comment = " + "'" + qualification.getComment() + "'" +
                " WHERE id = " + qualification.getId();
        return change(sql);
    }

    public boolean delete(Qualification qualification) {
        String sql = "DELETE FROM qualifications WHERE id = " + qualification.getId();
        return change(sql);
    }

    public boolean delete(String id) {
        String sql = "DELETE FROM qualifications WHERE id = " + id;
        return change(sql);
    }
}
