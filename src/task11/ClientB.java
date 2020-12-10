package task11;

/**
 * @author Horoshko Maryna
 * @version 1.0
 */

public class ClientB {

    private static String name;
    private static int quantity;
    private static double price;
    private static String email;

    public static void main(String[] args) {

        name = "Аристарх";
        quantity = 81;
        price = 57.9;
        email = "aristarh@mail.com";

        ClientA client1 = new ClientA (name, quantity, price, email);

        client1.infoPurchase();
    }



}
