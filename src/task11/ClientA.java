package task11;

import java.text.DecimalFormat;

/**
 * @author Horoshko Maryna
 * @version 1.0
 */

public class ClientA extends Client {

    private double discount = 7.5;
    private String email;

    public ClientA(String name, int quantity, double price, String email) {
        super(name, quantity, price);
        this.email = email;
    }

    public void infoPurchase() {

        double sumPurchase = calculateSumPurchase(getQuantity(), getPrice());
        double sumDiscount = calculateSumDiscount(sumPurchase, discount);

        String sumPurchaseResult = roundValue(sumPurchase);
        String sumDiscountResult = roundValue(sumDiscount);

        System.out.println("Информация о покупке" +
                "\n--------------------------------------------------" +
                "\nПокупатель: " + getName() +
                "\nE-mail: " + email +
                "\nКоличество (шт.): " + getQuantity() +
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

}
