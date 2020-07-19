package task05;

/**
 * @author Horoshko Maryna
 */

public class SortB {

    final static String CURRENCY = " грн.";

    public static void main(String[] args) {
        double [] arrSum = {100.99, 9999.99, 238.85, 854.63, 567.12,
                5873.85, 2451.93, 7112.75, 9051.88, 1070.55};
        int n = arrSum.length;

        selectionSort(arrSum, 0, n - 1);

        System.out.println("Закупки товара: ");
        for (double sum : arrSum)
            System.out.println(sum + CURRENCY);
    }

    public static void selectionSort(double[] arrSum, int low, int high) {
        for (int h = low; h <= high; h++)
            swap(arrSum, h, (int) getSmallest(arrSum, h, high));
    }

    public static double getSmallest(double[] arrSum, int low, int high) {
        int small = low;
        for (int i = low + 1; i <= high; i++)
            if (arrSum[i] < arrSum[small])
                small = i;
        return small;
    }

    public static void swap(double[] numbers, int i, int a) {
        double temp = numbers[i];
        numbers[i] = numbers[a];
        numbers[a] = temp;
    }
}