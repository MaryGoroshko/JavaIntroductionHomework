package task16.task161;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author Horoshko Maryna
 * @version 1.0
 * Все как в примере, изменила только вывод данных в консоль, сделала похожим на таблицу.
 */

public class CreateData {

    public static void main(String[] args) {

        String [] names = {"Илларион", "Тимофей", "Платон", "Ева", "Орест"};
        String [] position = {"Слесарь", "Плотник", "Каменщик", "Электрик", "Водитель"};
        String [] phone = {"532-16-15", "854-11-91", "404-00-88", "201-78-89", "609-26-56"};

        Employees employees = new Employees();

        if (CheckBase.isBaseExists()){
            for (int i = 0; i < names.length; i++) {
                employees.setName(names[i]);
                employees.setPosition(position[i]);
                employees.setPhone(phone[i]);
                insert(employees.getName(), employees.getPosition(), employees.getPhone());
            }
        } else {
            System.out.println("Базы нет!");
        }
    }

    private static void insert(String name, String pos, String phone) {

        String sql = "INSERT INTO "
                + Constants.TABLE_NAME
                + "(name, position, phone) VALUES(?,?,?)";

        try (PreparedStatement pstmt = DbConnect.connect().prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.setString(2, pos);
            pstmt.setString(3, phone);
            pstmt.executeUpdate();
            System.out.println("Добавлен сотрудник: " + name);
        }catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
