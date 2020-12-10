package task101;

import java.util.Scanner;

public class CustomerB {

    public static void main(String[] args) {

        Scanner customerName = new Scanner(System.in);
        System.out.println("Введите имя покупателя: ");
        String name = validateName(customerName);

        Scanner quantityGoods = new Scanner(System.in);
        System.out.println("Введите количество купленного товара: ");
        int quantity = validateQuantityInput(quantityGoods);

        Customer customerB = new Customer(name, quantity);

        String nameOutput = customerB.getName();
        int quantityOutput = customerB.getQuantity();

        System.out.println(
                "Объем покупки (шт.)" +
                        "\n---------------------------------\n" +
                        "Покупатель: " + nameOutput + '\n' +
                        "Количество: " + quantityOutput +'\n' +
                        "\n---------------------------------\n"
        );
    }

    private static String validateName(Scanner scanner){
        String str = scanner.nextLine().trim().toUpperCase();
        while (str.isEmpty()){
            System.out.println("Пусто! Введите имя покупателя: ");
            str = scanner.nextLine().trim();
        }
        return str;
    }

    private static int validateQuantityInput(Scanner scanner){
        while (!scanner.hasNextInt()) {
            String str = scanner.nextLine().trim();
            System.out.printf("\"%s\" - не число!\n", str);
            System.out.println("Введите количество !!: ");
        }
        int quantity = scanner.nextInt();
        while (quantity <= 0){
            System.out.println("Неверное значение!! Введите количество: ");
            while (!scanner.hasNextInt()) {
                String str = scanner.next().trim();
                System.out.printf("\"%s\" - не число!\n", str);
                System.out.println("Введите количество !!: ");
            }
            quantity = scanner.nextInt();
        }
        return quantity;
    }

}
