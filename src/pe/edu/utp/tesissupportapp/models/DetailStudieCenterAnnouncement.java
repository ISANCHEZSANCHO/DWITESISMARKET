package pe.edu.utp.tesissupportapp.models;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by George on 12/07/2017.
 */
public class DetailStudieCenterAnnouncement {





    private int announcement_id;
    private int studies_center_id;


    public DetailStudieCenterAnnouncement() {
    }

    public DetailStudieCenterAnnouncement(int announcement_id, int studies_center_id) {
        this.announcement_id = announcement_id;
        this.studies_center_id = studies_center_id;

    }


    public int getAnnouncement_id() {
        return announcement_id;
    }


    public String getAnnouncementAsString() {
        return String.valueOf(getAnnouncement_id());
    }

    public DetailStudieCenterAnnouncement setAnnouncement_id(int announcement_id) {
        this.announcement_id = announcement_id;
        return this;
    }




    public int getStudies_center_id() {
        return studies_center_id;
    }


    public String getAStudies_center_idAsString() {
        return String.valueOf(getStudies_center_id());
    }

    public DetailStudieCenterAnnouncement setStudies_center_id(int studies_center_id) {
        this.studies_center_id = studies_center_id;
        return this;
    }



    public static DetailStudieCenterAnnouncement build(ResultSet resultSet) {
        try {
            return (new DetailStudieCenterAnnouncement())
                    .setAnnouncement_id(resultSet.getInt("announcement_id"))
                    .setStudies_center_id(resultSet.getInt("studies_center_id")

                    );
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


}
