package task101;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CustomerA {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя покупателя: ");
        String name = validateName(scanner);

        Scanner quantityGoods = new Scanner(System.in);
        System.out.println("Введите количество купленного товара: ");
        int quantity = validateQuantityInput(quantityGoods);

        Scanner priceGoods = new Scanner(System.in);
        System.out.println("Введите цену за единицу купленного товара: ");
        double price = validatePriceInput(priceGoods);

        double discount = 5.3;
        double sumPurchase = calculateSumPurchase(quantity, price);
        double sumDiscount = calculateSumDiscount(discount, sumPurchase);

        String sumPurchaseResult = roundValue(sumPurchase);
        String sumDiscountResult = roundValue(sumDiscount);

        Customer customerA = new Customer(name, quantity, price);

        String nameOutput = customerA.getName();
        int quantityOutput = customerA.getQuantity();

        System.out.println(
                        "Объем покупки и скидки" +
                        "\n---------------------------------\n" +
                        "Покупатель: " + nameOutput + '\n' +
                        "Количество: " + quantityOutput + " шт." + '\n' +
                        "Сумма покупки: " + sumPurchaseResult + " грн." + '\n' +
                        "Скидка: " + sumDiscountResult + " грн." +
                        "\n---------------------------------\n"
        );
    }

    private static double calculateSumPurchase(int quantity, double price) {
        return quantity * price;
    }

    private static double calculateSumDiscount(double price, double sumPurchase) {
        return sumPurchase * price / 100;
    }

     private static String roundValue(double value) {
        DecimalFormat df = new DecimalFormat("#.00");
        return df.format(value);
    }

    private static String validateName(Scanner scanner){
        String str = scanner.nextLine().trim().toUpperCase();
        while (str.isEmpty()){
            System.out.println("Пусто! Введите имя покупателя: ");
            str = scanner.nextLine().trim();
        }
        return str;
    }

    private static int validateQuantityInput(Scanner scanner){
        while (!scanner.hasNextInt()) {
            String str = scanner.nextLine().trim();
            System.out.printf("\"%s\" - не число!\n", str);
            System.out.println("Введите количество !!: ");
        }
        int quantity = scanner.nextInt();
        while (quantity <= 0){
            System.out.println("Неверное значение!! Введите количество: ");
            while (!scanner.hasNextInt()) {
                String str = scanner.next().trim();
                System.out.printf("\"%s\" - не число!\n", str);
                System.out.println("Введите количество !!: ");
            }
            quantity = scanner.nextInt();
        }

        return quantity;
    }

    private static double validatePriceInput(Scanner scanner){
        while (!scanner.hasNextDouble()) {
            String str = scanner.nextLine().trim();
            System.out.printf("\"%s\" - не число!\n", str);
            System.out.println("Введите цену !: ");
        }
        double price = scanner.nextDouble();
        while (price <= 0){
            System.out.println("Неверное значение!! Введите цену: ");
            while (!scanner.hasNextDouble()) {
                String str = scanner.nextLine().trim();
                System.out.printf("\"%s\" - не число!\n", str);
                System.out.println("Введите цену !!: ");
            }
            price = scanner.nextDouble();
        }
        return price;
    }
}
