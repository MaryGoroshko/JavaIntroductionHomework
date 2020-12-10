package task16.task162;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Horoshko Maryna
 * @version 1.1
 * Добавление значений через ArrayList.
 */

public class DbConnect {

    public static Connection connect() {
        String dbDriver = Constants.DB_DRIVER;
        String dbBaseUrl = Constants.DB_BASE_URL;
        String dbName = Constants.DB_NAME;
        String url = dbDriver + dbBaseUrl + dbName;
        Connection connect = null;
        try {
            connect = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return connect;
    }
}
