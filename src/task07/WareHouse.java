package task07;

import java.util.HashMap;
import java.util.Map;

public class WareHouse {

    public static void main(String[] args) {

        Map<Integer,String>goods = new HashMap<>();
        goods.put(101,"Апельсины");
        goods.put(102,"Палатки");
        goods.put(103,"Машины");
        goods.put(104,"Ноутбуки");
        goods.put(105,"Кастрюли");
        goods.put(106,"Блокноты");

        showFirst(goods);
        modificationFirst(goods);
        modificationSecond(goods);
    }

        private static void showFirst(Map<Integer, String> goods) {
        System.out.println("Начальный перечень:");
        for(Map.Entry m : goods.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }

    private static void modificationFirst(Map<Integer, String> goods) {
        goods.remove(105);
        goods.put(109, "Матрасы");
        System.out.println("Вторая модификация:");
        goods.forEach((key, value) -> System.out.println(key + " " + value));
    }

    private static void modificationSecond(Map<Integer, String> goods) {
        goods.remove(101);
        goods.put(115, "Стаканы");
        goods.remove(103, "Машины");
        goods.put(189, "Столы");
        System.out.println("Третья модификация:");
        goods.forEach((key, value) -> System.out.println(key + " " + value));
    }




}
