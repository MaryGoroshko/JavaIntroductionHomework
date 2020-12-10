package task10;

/**
 * @author Horoshko Maryna
 * @version 1.0
 */

public class CustomerB {

    public static void main(String[] args) {

        Customer customerB = new Customer("Аркадий",85);

        System.out.printf("Объем покупки (шт.)%n" +
                "----------------------%n" +
                "Покупатель: %s%nКоличество: %d%n" +
                "----------------------",
                customerB.getName(),customerB.getQuantity());
    }

}
