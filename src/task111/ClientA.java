package task111;

import task11.Client;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author Horoshko Maryna
 * @version 1.0
 */

public class ClientA extends Client {

    private double discount = 7.5;
    private static String email;

    public ClientA(String name, int quantity, double price, String email) {
        super(name, quantity, price);
        this.email = email;
    }

    public static void main(String[] args) {
        Scanner customerName = new Scanner(System.in);
        System.out.println("Введите имя покупателя: ");
        String name = validateName(customerName);

        Scanner quantityGoods = new Scanner(System.in);
        System.out.println("Введите количество купленного товара: ");
        int quantity = validateQuantityInput(quantityGoods);

        Scanner priceGoods = new Scanner(System.in);
        System.out.println("Введите цену за единицу купленного товара: ");
        double price = validatePriceInput(priceGoods);

        Scanner emailAdress = new Scanner(System.in);
        System.out.println("Введите e-mail: ");
        boolean email = isValidEmailAddress(emailAdress);
    }

    public void infoPurchase() {

        double sumPurchase = calculateSumPurchase(getQuantity(), getPrice());
        double sumDiscount = calculateSumDiscount(sumPurchase, discount);

        String sumPurchaseResult = roundValue(sumPurchase);
        String sumDiscountResult = roundValue(sumDiscount);

        ClientA clientA = new ClientA(getName(), getQuantity(), getPrice(), email);
        String nameOutput = clientA.getName();
        int quantityOutput = clientA.getQuantity();
        String emailOutput = email;

        System.out.println("Информация о покупке" +
                "\n--------------------------------------------------" +
                "\nПокупатель: " + nameOutput +
                "\nE-mail: " + emailOutput +
                "\nКоличество (шт.): " + quantityOutput +
                "\nСумма покупки (грн.): " + sumPurchaseResult +
                "\nСкидка (грн.): " + sumDiscountResult +
                "\n--------------------------------------------------"
        );

    }

    private double calculateSumPurchase(int quantity, double price) {
        return quantity * price;
    }

    private double calculateSumDiscount(double sumPurchase, double discount) {
        return sumPurchase * discount / 100;
    }

    private static String roundValue(double value){
        DecimalFormat df = new DecimalFormat("#.00");
        return df.format(value);
    }

    public static boolean isValidEmailAddress(Scanner scanner) {
        String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
        java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
        System.out.printf("\"%s\" - не является email!\n", scanner);
        System.out.println("Введите правильный email !: ");
        java.util.regex.Matcher m = p.matcher(email);
        return m.matches();
    }

    public static String validateName(Scanner scanner){
        String str = scanner.nextLine().trim().toUpperCase();
        while (str.isEmpty()){
            System.out.println("Пусто! Введите имя покупателя: ");
            str = scanner.nextLine().trim();
        }
        return str;
    }

    public static int validateQuantityInput(Scanner scanner){
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

    public static double validatePriceInput(Scanner scanner){
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
