package task06;
/**
 * @author Horoshko Maryna
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductList {

    public static void main(String[] args) {

        ArrayList<String> fruits = getGoods("Киви", "Мандарин", "Банан");
        ArrayList<String> vegetables = getGoods("Картофель", "Морковь", "Капуста");
        ArrayList<String> flowers = getGoods("Пион", "Роза", "Орхидея");

        ArrayList<String> allElements = new ArrayList<>();
        allElements.addAll(vegetables);
        allElements.addAll(flowers);
        allElements.addAll(fruits);

        print(vegetables,flowers,fruits);
        printElements(allElements);

    }

    private static ArrayList<String> getGoods(String... params) {
        ArrayList<String> result = new ArrayList<>();
        Collections.addAll(result, params);
        return result;
    }

    public static void print(List<String> vegetables, List<String> flowers, List<String> fruits) {
        printPart(vegetables, "Овощи:");
        printPart(flowers, "Цветы:");
        printPart(fruits,"Фрукты:");
    }

    private static void printPart(List<String> vegetables, String s) {
        System.out.println(s);
        vegetables.forEach(System.out::println);
        System.out.println();
    }

    public static void printElements(ArrayList<String>allElements){
        System.out.println();
        System.out.println("Вывод елементов №3-6: ");
        System.out.println(allElements.subList(3,6));
    }
}
