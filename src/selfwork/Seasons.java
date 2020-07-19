package selfwork.swork01;

//**
//* @author Horoshko Maryna
//*


import java.util.Scanner;

public class Seasons {

    static String[] winterGoods;
    static String[] springGoods;
    static String[] summerGoods;
    static String[] autumnGoods;
    static String month;
    static String[] arrSeason;
    static int pos;

    public static void main(String[] args) {

        winterGoods = new String[]{"Шуба", "Пуховик", "Парка"};
        springGoods = new String[]{"Пальто", "Ветровка", "Комбинезон"};
        summerGoods = new String[]{"Футболка", "Поло", "Шорты"};
        autumnGoods = new String[]{"Куртка", "Гольф", "Плащ"};
        month = scanData();
        month = month.trim().toLowerCase();

        checkMonth();
        if (arrSeason != null) {
            printGoods(arrSeason);
        } else {
            System.out.println("Что-то не так!");
        }
    }

    private static void checkMonth() {
        switch (month) {
            case "декабрь": case "январь": case "февраль":
                arrSeason = winterGoods;
                break;
            case "март": case "апрель": case "май":
                arrSeason = springGoods;
                break;
            case "июнь": case "июль": case "август":
                arrSeason = summerGoods;
                break;
            case "сентябрь": case "октябрь": case "ноябрь":
                arrSeason = autumnGoods;
                break;
            default:
                System.out.println("Не определено!");
        }
    }

    public static String scanData () {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите месяц: ");
        String month = in.nextLine();
        in.close();
        return month;
    }

    private static void printGoods(String[] arrGoods) {
        System.out.println("Поставка на " + month + ":");
        for (String product : arrGoods) {
            pos++;
            System.out.printf("%d. %s %n", pos, product);
        }
    }
}
