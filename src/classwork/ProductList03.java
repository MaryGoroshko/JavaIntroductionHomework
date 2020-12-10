package classwork;

import java.util.ArrayList;

public class ProductList03 {

    public static void main(String[] args) {
        ArrayList <String> goods = new ArrayList<>();
        goods.add("Киви");
        goods.add("Мандарин");
        goods.add("Банан");
        goods.add("Картофель");
        goods.add("Морковь");
        goods.add("Капуста");
        goods.add("Пион");
        goods.add("Роза");
        goods.add("Орхидея");

        print(goods);
        printElements(goods);
    }

    private static void print(ArrayList< String> goods) {
        System.out.println ("Овощи:");
        System.out.println (goods.subList (3,6));
        System.out.println ("Цветы:");
        System.out.println (goods.subList (6,9));
        System.out.println ("Фрукты:");
        System.out.println (goods.subList (0,3));

    }

    private static void printElements(ArrayList< String> goods) {
        System.out.println ("Печать элементов №3-6:");
        System.out.println (goods.subList (3,6));
    }


}
