package task09;

/**
 * @author Horoshko Maryna
 * @version 1.0
 */

public class ProductA {

        static final int TAX_RATE = 15;
        static final String CURRENCY = " грн.";
        static String productName;
        static int quantitySales;
        static double price;
        static double income;
        static double taxAmount;

    public static void main(String[] args) {

        productName = "Кондиционер";
        quantitySales = 12;
        price = 8999.99;

        Product goods = new Product();

        goods.setProductName(productName);
        goods.setQuantity(quantitySales);
        goods.setPrice(price);

        income = calculateIncome(goods.getQuantity(),goods.getPrice());
        taxAmount = calculateTax(goods.getQuantity(),goods.getPrice());

        System.out.println("Наименование товара: " + goods.getProductName());
        System.out.println("Колличество проданного товара: " + goods.getQuantity() + " шт.");
        System.out.printf("Доход: " + "%.2f" + CURRENCY + "\n", income);
        System.out.printf("Сумма налога: " + "%.2f" + CURRENCY, taxAmount);
    }

    private static double calculateIncome(int quantity, double price){
        return quantity * price;
    }

    private static double calculateTax(int quantity, double price){
          return quantity * price * TAX_RATE / 100;
    }

}