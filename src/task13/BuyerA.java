package task13;

import java.text.DecimalFormat;

/**
 * @author Horoshko Maryna
 * @version 1.2
 */

public class BuyerA implements Bonus, Discount{

    String buyerName;
    int purchaseVolume;
    double price;
    double sumBonus;
    int discount;
    double sumPurchase;
    String sumPurchaseResult;

    
    public void showInfo(){

        buyerName = "Ипполит";
        purchaseVolume = 158;
        price = 29.76;
        sumBonus = 59;
        discount = 10;

        sumPurchase = calculateSumPurchase (purchaseVolume, price);

        sumPurchaseResult = roundSum(sumPurchase);

        System.out.println("Покупатель: " + buyerName +
                "\nСумма покупки (грн.): " + sumPurchaseResult);
    }

    @Override
    public void bonus() {
        System.out.println("Бонус (грн.): " + sumBonus);
    }

    @Override
    public void discount() {
        System.out.println("Скидка (%): " + discount);
    }

    private double calculateSumPurchase(int purchaseVolume, double price) {
        return purchaseVolume * price;
    }

    String roundSum(double value) {
        DecimalFormat df = new DecimalFormat("#.00");
        return df.format(value);
    }
}
