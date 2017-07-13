package pe.edu.utp.tesissupportapp.models;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by George on 01/07/2017.
 */
public class DetailsAnnouncementsLevels {




    private int announcement_id;
    private int level_id;


    public DetailsAnnouncementsLevels() {
    }

    public DetailsAnnouncementsLevels(int announcement_id, int level_id) {
        this.announcement_id = announcement_id;
        this.level_id = level_id;

    }


    public int getAnnouncement_id() {
        return announcement_id;
    }


    public String getAnnouncementAsString() {
        return String.valueOf(getAnnouncement_id());
    }

    public DetailsAnnouncementsLevels setAnnouncement_id(int announcement_id) {
        this.announcement_id = announcement_id;
        return this;
    }




    public int getLevel_id() {
        return level_id;
    }


    public String getALevel_idAsString() {
        return String.valueOf(getLevel_id());
    }

    public DetailsAnnouncementsLevels setLevel_id(int level_id) {
        this.level_id = level_id;
        return this;
    }



    public static DetailsAnnouncementsLevels build(ResultSet resultSet) {
        try {
            return (new DetailsAnnouncementsLevels())
                    .setAnnouncement_id(resultSet.getInt("announcement_id"))
                    .setLevel_id(resultSet.getInt("level_id")

                    );
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}
