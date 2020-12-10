package task10;

/**
 * @author Horoshko Maryna
 * @version 1.0
 */

public class Customer {

    private String name;
    private int quantity;
    private double price;

    public Customer(String name , int quantity , double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public Customer(String name , int quantity) {
        this.name = name;
        this.quantity = quantity;
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
