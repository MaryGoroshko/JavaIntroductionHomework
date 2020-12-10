package task11;

public class ClientC {

    private static String name;
    private static int quantity;
    private static double price;
    private static String email;

    public static void main(String[] args) {

        name = "Кристофор";
        quantity = 5;
        price = 85;
        email = "kristof@mail.com";

        ClientA client2 = new ClientA (name, quantity, price, email);

        client2.infoPurchase();
    }
}
