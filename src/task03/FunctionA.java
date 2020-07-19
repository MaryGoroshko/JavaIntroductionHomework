package task03;

/*
  @author Horoshko Maryna
 */

import java.math.BigDecimal;
import java.math.RoundingMode;

public class FunctionA {

    private static String name;
    private static String position;
    private static float hoursWorked;
    private static float rate;
    private static float koef;
    private static final String value = " грн.";

    public static void showResult() {

        showResultA();
        showResultB();
        showResultC();
    }

    private static void showResultA() {
        name = "Ворчун Г.Б.";
        position = " дровосек ";
        hoursWorked = 171f;
        rate = 38.51f;
        koef = 5.89f;
        float salary = calculateSalary(hoursWorked, rate);
        System.out.println("\"Расчет премий\" ");
        System.out.println(" ");
        System.out.println(name + "," + position);
        System.out.print("Заработная плата: " +
                roundCost(calculateSalary(hoursWorked, rate), 2) + value + "\n");
        System.out.print("Премия: " +
                roundCost((float) calculateBonus(salary, koef), 2) + value + "\n");
        System.out.println(" ");
    }

    private static void showResultB() {
        name = "Чихун К.И.";
        position = " продавец ";
        hoursWorked = 208f;
        rate = 20.2f;
        koef = 0.55f;
        float salary = calculateSalary(hoursWorked,rate);
        double bonus = calculateBonus(salary,koef);
        System.out.println(name + "," + position);
        System.out.printf("Заработная плата: " + "%.2f" + value + "\n", salary);
        System.out.printf("Премия: " + "%.2f" + value + "\n", bonus);
        System.out.println(" ");
    }

    private static void showResultC() {
        name = "Сонный А.В.";
        position = " охранник ";
        hoursWorked = 340f;
        rate = 44.8f;
        koef = 7.8f;
        float salary = calculateSalary(hoursWorked,rate);
        double bonus = calculateBonus(salary,koef);
        System.out.println(name + "," + position);
        System.out.printf("Заработная плата: " + "%.2f" + value + "\n", salary);
        System.out.printf("Премия: " + "%.2f" + value, bonus);
    }

    private static float calculateSalary(float hoursWorked, float rate){
        return hoursWorked * rate;
    }
    private static double calculateBonus(float salary, double koef){
        return salary / koef;
    }

    public static float roundCost(float value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.floatValue();
    }

}
