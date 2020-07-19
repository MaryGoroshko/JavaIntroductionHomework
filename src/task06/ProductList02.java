package task06;

import java.util.ArrayList;

public class ProductList02 {
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
        allElements.addAll(vegetables);
        allElements.addAll(flowers);
        allElements.addAll(fruits);

        printAll(allElements);
        printElements(allElements);

    }

    private static void printAll(ArrayList<String> allElements) {
        System.out.println();
        allElements.forEach(System.out::println);
    }

    public static void printElements(ArrayList<String>allElements){
        System.out.println();
        System.out.println("Вывод елементов №3-6: ");
        System.out.println(allElements.subList(3,6));

    }


}

