package pe.edu.utp.tesissupportapp.services;
import pe.edu.utp.tesissupportapp.models.Announcement;
import pe.edu.utp.tesissupportapp.models.TADataStore;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by KEVIN on 11/07/2017.
 */
public class TAService {
    private Connection connection;
    private TADataStore dataStore;

    public TAService(InitialContext ctx) {
        try {
            connection = ((DataSource) ctx.lookup("jdbc/MySQLDataSource")).getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }

    public TAService() {
        try {
            InitialContext ctx = new InitialContext();
            connection = ((DataSource) ctx.lookup("jdbc/MySQLDataSource")).getConnection();
        } catch (NamingException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Announcement> getAnnouncement(){
        return getDataStore().findAllAnnouncements();
    }
    private Connection getConnection() {
        return connection;
    }

    private TADataStore getDataStore() {
        if(dataStore == null){
            dataStore = new TADataStore(getConnection());
        }
        return dataStore;
    }




}