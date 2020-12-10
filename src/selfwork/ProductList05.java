package selfwork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductList05 {
    public static void main(String[] args) {

        ArrayList<String> fruits = getGoods("Киви", "Мандарин", "Банан");
        ArrayList<String> vegetables = getGoods("Картофель", "Морковь", "Капуста");
        ArrayList<String> flowers = getGoods("Пион", "Роза", "Орхидея");

        ArrayList<String> allElements01 = new ArrayList<>();
        allElements01.addAll(fruits);
        allElements01.addAll(vegetables);
        allElements01.addAll(flowers);

        ArrayList<String> allElements02 = new ArrayList<>();
        allElements02.addAll(vegetables);
        allElements02.addAll(flowers);
        allElements02.addAll(fruits);

        print01(fruits, vegetables,flowers);
        print02(vegetables,flowers,fruits);
        printElements(allElements02);
    }

    private static ArrayList<String> getGoods(String... params) {
        ArrayList<String> result = new ArrayList<>();
        Collections.addAll(result, params);
        return result;
    }

    private static void print01(List<String>fruits, List<String>vegetables, List<String>flowers) {
        System.out.println("Первоначальный список:");
        printPart(fruits,"Фрукты:");
        printPart(vegetables, "Овощи:");
        printPart(flowers, "Цветы:");
    }

    public static void print02(List<String> vegetables, List<String> flowers, List<String> fruits) {
        System.out.println("Модифицированный список:");
        printPart(vegetables, "Овощи:");
        printPart(flowers, "Цветы:");
        printPart(fruits,"Фрукты:");
    }

    private static void printPart(List<String> vegetables, String s) {
        System.out.println(s);
        vegetables.forEach(System.out::print);
    }

    public static void printElements(ArrayList<String>allElements){
        System.out.println("Вывод елементов №3-6: ");
        System.out.println(allElements.subList(3,6));
    }
}
