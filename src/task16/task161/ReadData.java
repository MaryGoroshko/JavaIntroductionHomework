package task16.task161;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Horoshko Maryna
 * @version 1.0
 * Все как в примере, изменила только вывод данных в консоль, сделала похожим на таблицу.
 */

public class ReadData {

    public static void main(String[] args) {

        if (CheckBase.isBaseExists()){
            selectAll();
        } else {
            System.out.println("Базы нет!");
        }
    }

    private static void selectAll(){

        String sql = "SELECT id, name, position, phone FROM "
                + Constants.TABLE_NAME;

        try (Statement stmt = DbConnect.connect().createStatement();
             ResultSet rs = stmt.executeQuery(sql)){

            System.out.format("|%4s|%15s|%10s|%15s|%n", "id", "Имя", "Должность", "Телефон");
            System.out.println("|----|---------------|----------|---------------|");

            while (rs.next()) {
                int id = rs.getInt(1);
                String username = rs.getString("name");
                String position = rs.getString("position");
                String phone = rs.getString("phone");
                System.out.format("|%4d|%15s|%10s|%15s|%n", id, username, position, phone);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
