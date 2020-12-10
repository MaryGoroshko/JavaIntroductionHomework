package task16.task161;

import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Horoshko Maryna
 * @version 1.0
 * Все как в примере, изменила только значения
 * и вывод данных в консоль, сделала похожим на таблицу.
 */

public class CreateTable {

    public static void main(String[] args) {

        if (CheckBase.isBaseExists()){
            createTable();
        } else {
            System.out.println("Базы нет!");
        }
    }

    private static void createTable() {

        String sql = "CREATE TABLE IF NOT EXISTS employees("
                + " id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,"
                + " name TEXT NOT NULL,"
                + " position TEXT NOT NULL,"
                + " phone TEXT NOT NULL"
                + ");";

        try  {
            Statement stmt = DbConnect.connect().createStatement();
            stmt.execute(sql);
            System.out.println("Таблица создана.");
        }catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
