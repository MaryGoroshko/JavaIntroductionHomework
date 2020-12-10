package task131;

import java.text.DecimalFormat;

public class BuyerA implements Discount, Bonus{

     String buyerName;
     int purchaseVolume;
     double price;
     double sumBonus;
     int discount;
     double sumPurchase;
     String sumPurchaseResult;

    public int getPurchaseVolume() {
        return purchaseVolume;
    }

    public double getPrice() {
        return price;
    }

    public double getSumBonus() {
        return sumBonus;
    }

    public int getDiscount() {
        return discount;
    }

    public double getSumPurchase() {
        return sumPurchase;
    }

    private double calculateSumPurchase(int purchaseVolume, double price) {
        return purchaseVolume * price;
    }

    @Override
    public double bonus() {
        sumBonus = sumPurchase * getDiscount() / 100;
        return sumBonus;
    }

    @Override
    public int discount() {
        if (getPurchaseVolume() < 2000){
            discount = 5;
        }else if (getPurchaseVolume()  > 2001 && getPurchaseVolume()  <= 5000){
            discount = 10;
        }else {
            discount = 15;
        }
        return discount;
    }

    public void showInfo(){

        buyerName = "Платон";
        purchaseVolume = 158;
        price = 29.76;

        sumPurchase = calculateSumPurchase (purchaseVolume, price);

        sumPurchaseResult = roundSum(sumPurchase);

        System.out.println("Покупатель: " + buyerName +
                "\nСумма покупки (грн.): " + sumPurchaseResult +
                "\nБонус (грн.): " + getSumBonus() +
                "\nСкидка (%): " + getDiscount());
    }

    static String roundSum(double value) {
        DecimalFormat df = new DecimalFormat("#.00");
        return df.format(value);
    }
}
