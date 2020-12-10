package task06;

/**
 * @author Horoshko Maryna
 * @version 3.0
 */

import java.util.ArrayList;
import java.util.Collections;

//Тоже самое что и версия 1.0, но с использованием подсказок по совершенствованию кода от IDEA

public class ProductList03 {

    public static void main(String[] args) {

        ArrayList<String> fruits = getStrings("Киви" , "Мандарин" , "Банан");

        ArrayList<String> vegetables = getStrings("Картофель" , "Морковь" , "Капуста");

        ArrayList<String> flowers = getStrings("Пион" , "Роза" , "Орхидея");

        ArrayList<String> allElements01 = new ArrayList<>();
        allElements01.addAll(0, fruits);
        allElements01.addAll(3, vegetables);
        allElements01.addAll(6, flowers);

        ArrayList<String> allElements02 = new ArrayList<>();
        allElements02.addAll(0, vegetables);
        allElements02.addAll(3, flowers);
        allElements02.addAll(6, fruits);

        printAllElements01(allElements01);
        printAllElements02(allElements02);
        printElements(allElements02);
    }

    private static ArrayList<String> getStrings(String... pos) {
        ArrayList<String> result = new ArrayList<>();
        Collections.addAll(result, pos);
        return result;
    }

    private static void printAllElements01(ArrayList<String> allElements01) {
        System.out.println("Первоначальный перечень:" + allElements01);
    }

    private static void printAllElements02(ArrayList<String> allElements02) {
        System.out.println("Модифицированный перечень:" + allElements02);
    }

    private static void printElements(ArrayList<String> allElements02) {
        System.out.println("Вывод елементов №3-6: " + allElements02.subList(2,6));
    }
}
