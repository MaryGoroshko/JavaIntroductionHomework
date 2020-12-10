package task12;

import java.text.DecimalFormat;

/**
 * @author Horoshko Maryna
 * @version 1.0
 */

public class SupplierA {

    static double amount;
    static String amountResult;

    public static void showData(String name) {
        System.out.printf("Наименование: %s%n%n", name);
    }

    public static void showData(String name, String email) {
        System.out.printf("Наименование: %s%nE-mail: %s%n%n", name, email);
    }

    public static void showData(String name, String email,
                                int quantity, double price) {

        amount = calculateDeliveryAmount(quantity, price);

        amountResult = roundValue(amount);

        System.out.printf("Наименование: %s%nE-mail: %s%n" +
                "Сумма поставки (грн.): %s", name, email, amountResult);
    }

    private static double calculateDeliveryAmount(int quantity, double price) {
        return quantity * price;
    }

    static String roundValue(double value) {
        DecimalFormat df = new DecimalFormat("#.00");
        return df.format(value);
    }

}
