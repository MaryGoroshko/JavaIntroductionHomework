package task11;

/**
 * @author Horoshko Maryna
 * @version 1.0
 */

public class Client {

    private String name;
    private int quantity;
    private double price;

    public Client(String name , int quantity , double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }
}
