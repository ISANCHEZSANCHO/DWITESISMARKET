package pe.edu.utp.tesissupportapp.models;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by George on 01/07/2017.
 */
public class DetailsAnnouncementsCareers {



    private int announcement_id;
    private String career_id;


    public DetailsAnnouncementsCareers() {
    }

    public DetailsAnnouncementsCareers(int announcement_id, String career_id) {
        this.announcement_id = announcement_id;
        this.career_id = career_id;

    }


    public int getAnnouncement_id() {
        return announcement_id;
    }


    public String getAnnouncementAsString() {
        return String.valueOf(getAnnouncement_id());
    }

    public DetailsAnnouncementsCareers setAnnouncement_id(int announcement_id) {
        this.announcement_id = announcement_id;
        return this;
    }

    public String getCareer_id() {
        return career_id;
    }

    public DetailsAnnouncementsCareers setCareer_id(String career_id) {
        this.career_id = career_id;
        return this;
    }




    public static DetailsAnnouncementsCareers build(ResultSet resultSet) {
        try {
            return (new DetailsAnnouncementsCareers())
                    .setAnnouncement_id(resultSet.getInt("announcement_id"))
                    .setCareer_id(resultSet.getString("Career_id")

                    );
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }



}
