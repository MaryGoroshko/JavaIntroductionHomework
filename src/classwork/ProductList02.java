package classwork;

import java.util.ArrayList;
import java.util.List;

public class ProductList02 {

    static int pos;

    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Киви");
        fruits.add("Мандарин");
        fruits.add("Банан");

        ArrayList<String> vegetables = new ArrayList<>();
        vegetables.add("Картофель");
        vegetables.add("Морковь");
        vegetables.add("Капуста");

        ArrayList<String> flowers = new ArrayList<>();
        flowers.add("Пион");
        flowers.add("Роза");
        flowers.add("Орхидея");

        ArrayList<String> allElements = new ArrayList<>();
        allElements.addAll(0, vegetables);
        allElements.addAll(3, flowers);
        allElements.addAll(6, fruits);

        print(vegetables,flowers,fruits);
        printElements(allElements);
    }

    public static void print(List<String> vegetables, List<String> flowers, List<String> fruits) {
        System.out.println("Овощи: ");
        pos = 0;
        for (String a : vegetables) {
            pos++;
            System.out.printf ( "%d. %s %n" , pos , a);
        }
        System.out.println ();
       System.out.println("Цветы: ");
        pos = 0;
       for (String p : flowers) {
           pos++;
           System.out.printf ( "%d. %s %n" , pos , p);
       }
        System.out.println ();
       System.out.println("Фрукты: ");
        pos = 0;
       for (String b : fruits) {
            pos++;
            System.out.printf("%d. %s %n", pos, b);
       }
    }

    public static void printElements(List<String>allElements){
        System.out.println();
        System.out.println("Вывод елементов №3-6: ");
        System.out.println(allElements.subList(2,6));
    }
}
