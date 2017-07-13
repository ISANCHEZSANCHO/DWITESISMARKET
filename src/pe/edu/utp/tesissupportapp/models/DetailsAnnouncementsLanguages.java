package pe.edu.utp.tesissupportapp.models;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by George on 01/07/2017.
 */
public class DetailsAnnouncementsLanguages {


    private int announcement_id;
    private String language_id;


    public DetailsAnnouncementsLanguages() {
    }

    public DetailsAnnouncementsLanguages(int announcement_id, String language_id) {
        this.announcement_id = announcement_id;
        this.language_id = language_id;

    }

    public int getAnnouncement_id() {
        return announcement_id;
    }


    public String getAnnouncementAsString() {
        return String.valueOf(getAnnouncement_id());
    }

    public DetailsAnnouncementsLanguages setAnnouncement_id(int announcement_id) {
        this.announcement_id = announcement_id;
        return this;
    }

    public String getLanguage_id() {
        return language_id;
    }

    public DetailsAnnouncementsLanguages setLanguage_id(String language_id) {
        this.language_id = language_id;
        return this;
    }




    public static DetailsAnnouncementsLanguages build(ResultSet resultSet) {
        try {
            return (new DetailsAnnouncementsLanguages())
                    .setAnnouncement_id(resultSet.getInt("announcement_id"))
                    .setLanguage_id(resultSet.getString("Language_id")

                    );
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}