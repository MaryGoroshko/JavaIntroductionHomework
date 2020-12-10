package task16.task161;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Horoshko Maryna
 * @version 1.0
 * Все как в примере, изменила только вывод данных в консоль, сделала похожим на таблицу.
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
