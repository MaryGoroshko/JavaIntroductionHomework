package task06;

/**
 * @author Horoshko Maryna
 * @version 2.0
 */

import java.util.ArrayList;

public class ProductList02 {

    public static void main(String[] args) {
        ArrayList<String> goods = new ArrayList<>();
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
        mixGoods(goods);
        printMix(goods);
        printElements(goods);
    }

    private static void print(ArrayList<String> goods) {

        System.out.println("Первоначальный список: " + goods);
    }

    private static void mixGoods(ArrayList<String> goods) {
        int lastIndex = goods.size();

        String temp1;
        for( int i = 8 ;  i < lastIndex ; i++) {
            temp1 = goods.remove(0);
            goods.add(i , temp1);
        }
        String temp2;
        for( int i = 8 ;  i < lastIndex ; i++){
            temp2 = goods.remove(0);
            goods.add(i , temp2);
        }
        String temp3;
        for( int i = 8 ;  i < lastIndex ; i++){
            temp3 = goods.remove(0);
            goods.add(i , temp3);
        }
    }

    private static void printMix(ArrayList<String> goods) {

        System.out.println("Модифицированный список: " + goods);
    }

    private static void printElements(ArrayList<String> goods) {
        System.out.println("Вывод елементов №3-6: " + goods.subList(2,6));
    }
}
