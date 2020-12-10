package task16.task162;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author Horoshko Maryna
 * @version 1.1
 * Добавление значений через ArrayList
 */

public class CreateData {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Гидеон");
        names.add("Алексий");
        names.add("Теобальд");
        names.add("Никодим");
        names.add("Ефрем");

        ArrayList<String> position = new ArrayList<>();
        position.add("столяр");
        position.add("электрик");
        position.add("строитель");
        position.add("сантехник");
        position.add("монтажник");

        ArrayList<String> phone = new ArrayList<>();
        phone.add("501-874-59-87");
        phone.add("202-141-58-78");
        phone.add("404-898-23-11");
        phone.add("803-569-88-99");
        phone.add("901-565-23-23");

        Employees employees = new Employees();

        if (CheckBase.isBaseExists()){
            for (int i = 0; i < names.size(); i++) {
                employees.setName(names.get(i));
                employees.setPosition(position.get(i));
                employees.setPhone(phone.get(i));
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
