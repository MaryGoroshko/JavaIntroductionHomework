package task12;

/**
 * @author Horoshko Maryna
 * @version 1.0
 */

public class SupplierB extends SupplierA{

    static String name;
    static String email;
    static int quantity;
    static double price;

    public static void main(String[] args) {

        name = "Lampa";
        email = "office@lampa.com";
        quantity = 871;
        price = 29.53;

        showData(name);
        showData(name, email);
        showData(name, email, quantity, price);

    }

}
