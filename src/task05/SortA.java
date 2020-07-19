package task05;

/**
 * @author Horoshko Maryna
 */

public class SortA {

    static int pos;

    public static void main(String[] args) {
        String[] arrGoods = {"Фонари", "Палатки", "Ножи", "Посуда", "Спальники",
                "Коврики", "Рюкзаки", "Арбалеты", "Горелки", "Баллоны"};
        insertionSort(arrGoods);
        System.out.println("Ассортимент туристических товаров: ");
        for (String goods : arrGoods){
            pos++;
            System.out.printf("%d. %s %n", pos, goods);
        }
    }

    private static void insertionSort (String [] goods){
        for (int i = 1; i < goods.length; i++) {
            String key = goods[i];
            int a = i - 1;
            while (a >= 0 && (key.compareTo(goods[a]) < 0)) {
                goods[a + 1] = goods[a];
                a--;
            }
            goods[a + 1] = key;
        }
    }
}
