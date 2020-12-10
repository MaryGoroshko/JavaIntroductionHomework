package task10;

import java.text.DecimalFormat;

/**
 * @author Horoshko Maryna
 * @version 1.0
 */

public class CustomerA {

    private static String name;
    private static int quantity;
    private static double price;
    private static double discount;
    private static double sumPurchase;
    private static double sumDiscount;
    private static Customer customerA;
    private static String sumPurchaseResult;
    private static String sumDiscountResult;

    public static void main(String[] args) {

        name = "Вениамин";
        quantity = 187;
        price = 35.28;
        discount = 5.3;

        customerA = new Customer(name, quantity, price);

        sumPurchase = calculateSumPurchase(
                customerA.getPrice(),
                customerA.getQuantity()
        );

        sumDiscount = calculateSumDiscount (sumPurchase, discount);

        sumPurchaseResult = roundValue(sumPurchase);

        sumDiscountResult = roundValue(sumDiscount);

        System.out.printf("Объем покупки и скидки%n" +
                        "------------------------%n" +
                        "Покупатель: %s%nКоличество: %d шт.%n" +
                        "Сумма покупки: %s грн.%nСкидка: %s грн.%n" +
                        "------------------------",
                        customerA.getName(), customerA.getQuantity(),
                        sumPurchaseResult, sumDiscountResult
        );
    }

    private static double calculateSumPurchase(double price, int quantity) {
        return price * quantity;
    }

    private static double calculateSumDiscount(double purchaseAmount, double discount) {
        return purchaseAmount * discount / 100;
    }

    private static String roundValue(double value){
        DecimalFormat df = new DecimalFormat("#.00");
        return df.format(value);
    }

}
