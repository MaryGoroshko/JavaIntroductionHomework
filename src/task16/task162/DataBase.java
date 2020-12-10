package task16.task162;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Horoshko Maryna
 * @version 1.1
 * Добавление значений через ArrayList.
 */

public class DataBase {

    public static void main(String[] args) {

        if (CheckBase.isBaseExists()){
            System.out.println("База " + Constants.DB_NAME + " уже существует!");
        } else {
            createDatabase(Constants.DB_NAME);
        }
    }

    public static void createDatabase(String fileName) {

        String dbDriver = Constants.DB_DRIVER;
        String dbBaseUrl = Constants.DB_BASE_URL;
        String url = dbDriver + dbBaseUrl + fileName;

        try (Connection conn = DriverManager.getConnection(url)) {
            if (conn != null) {
                DatabaseMetaData meta = conn.getMetaData();
                System.out.println("Драйвер - " + meta.getDriverName());
                System.out.println("База создана.");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
