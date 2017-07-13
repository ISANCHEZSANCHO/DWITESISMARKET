package pe.edu.utp.tesissupportapp.models;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 * Created by George on 01/07/2017.
 */
public class Announcements {

    private int announcements_id;
    private int asesor_id;
    private String title;
    private String methodology;
    private String experience;
    private String video_url;
    private String comunication_media;
    private String comunication_tool;
    private int price;
    private String photo_path;


    public Announcements(int announcements_id, int asesor_id, String title, String methodology, String experience, String video_url,
                         String comunication_media, String comunication_tool, int price, String photo_path) {

        this.announcements_id = announcements_id;
        this.asesor_id=asesor_id;
        this.title=title;
        this.methodology=methodology;
        this.experience=experience;
        this.video_url=video_url;
        this.comunication_media=comunication_media;
        this.comunication_tool=comunication_tool;
        this.price=price;
        this.photo_path=photo_path;

    }


    public Announcements() {

    }

    public int getAnnouncements_id() {
        return announcements_id;
    }

    public Announcements setAnnouncements_id(int announcements_id) {
        this.announcements_id = announcements_id;
        return this;
    }
    public int getAsesor_id() {
        return asesor_id;
    }

    public Announcements setAsesor_id(int asesor_id) {
        this.asesor_id = asesor_id;
        return this;
    }
    public String getTitle() {
        return title;
    }

    public Announcements setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getMethodology() {
        return methodology;
    }

    public Announcements setMethodology(String methodology) {
        this.methodology = methodology;
        return this;
    }

    public String getExperience() {
        return experience;
    }

    public Announcements setExperience(String experience) {
        this.experience = experience;
        return this;
    }

    public String getVideo_url() {
        return video_url;
    }

    public Announcements setVideo_url(String video_url) {
        this.video_url = video_url;
        return this;
    }

    public String getComunication_media() {
        return comunication_media;
    }

    public Announcements setComunication_media(String comunication_media) {
        this.video_url = video_url;
        return this;
    }

    public String getComunication_tool() {
        return comunication_tool;
    }

    public Announcements setComunication_tool(String comunication_tool) {
        this.comunication_tool = comunication_tool;
        return this;
    }

    public int getPrice() {
        return price;
    }

    public Announcements setPrice(int price) {
        this.price = price;
        return this;
    }

    public String getPhoto_path() {
        return photo_path;
    }

    public Announcements setPhoto_path(String photo_path) {
        this.photo_path = photo_path;
        return this;
    }



    public static Announcements build(ResultSet resultSet) {
        try {
            return (new Announcements())
                    .setAnnouncements_id(resultSet.getInt("announcements_id"))
                    .setAsesor_id(resultSet.getInt("asesor_id"))
                    .setTitle(resultSet.getString("title"))
                    .setMethodology(resultSet.getString("methodology"))
                    .setExperience(resultSet.getString("category_photo"))
                    .setVideo_url(resultSet.getString("category_photo"))
                    .setComunication_media(resultSet.getString("category_photo"))
                    .setComunication_tool(resultSet.getString("category_photo"))
                    .setPrice(resultSet.getInt("category_photo"))
                    .setPhoto_path(resultSet.getString("category_photo"));

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


}

