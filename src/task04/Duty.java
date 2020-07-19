package task04;

/**
 * @author Horoshko Maryna
 * @version 1.0
 */

public class Duty {

    private static String group1;
    private static String group2;

    public static void main(String[] args) {
        group1 = "Богдан, Кирилл, Филип";
        group2 = "Николай, Петр, Иван";

        String dayString1 = "Понедельник";
        switch (dayString1.trim()) {
            case "Понедельник": case "Среда": case "Пятница":
                System.out.println(dayString1 + " - "  + group1);
                break;
            case "Вторник": case "Четверг": case "Суббота":
                System.out.println(dayString1 + " - "  + group2);
                break;
            default:
                System.out.println("Выходной");
        }

        String dayString2 = "Вторник";
        switch (dayString2.trim()) {
            case "Понедельник": case "Среда": case "Пятница":
                System.out.println(dayString2 + " - "  + group1);
                break;
            case "Вторник": case "Четверг": case "Суббота":
                System.out.println(dayString2 + " - " + group2);
                break;
            default:
                System.out.println("Выходной");
        }

        String dayString3 = "Среда";
        switch (dayString3.trim()) {
            case "Понедельник": case "Среда": case "Пятница":
                System.out.println(dayString3 + " - "  + group1);
                break;
            case "Вторник": case "Четверг": case "Суббота":
                System.out.println(dayString3 + " - " + group2);
                break;
            default:
                System.out.println("Выходной");
        }

        String dayString4 = "Четверг";
        switch (dayString4.trim()) {
            case "Понедельник": case "Среда": case "Пятница":
                System.out.println(dayString4 + " - "  + group1);
                break;
            case "Вторник": case "Четверг": case "Суббота":
                System.out.println(dayString4 + " - " + group2);
                break;
            default:
                System.out.println("Выходной");
        }

        String dayString5 = "Пятница";
        switch (dayString5.trim()) {
            case "Понедельник": case "Среда": case "Пятница":
                System.out.println(dayString5 + " - "  + group1);
                break;
            case "Вторник": case "Четверг": case "Суббота":
                System.out.println(dayString5 + " - " + group2);
                break;
            default:
                System.out.println("Выходной");
        }

        String dayString6 = "Суббота";
        switch (dayString6.trim()) {
            case "Понедельник": case "Среда": case "Пятница":
                System.out.println(dayString6 + " - "  + group1);
                break;
            case "Вторник": case "Четверг": case "Суббота":
                System.out.println(dayString6 + " - " + group2);
                break;
            default:
                System.out.println("Выходной");
        }

        String dayString7 = "Воскресенье";
        switch (dayString7.trim()) {
            case "Понедельник": case "Среда": case "Пятница":
                System.out.println(dayString7 + " - " + group1);
                break;
            case "Вторник": case "Четверг": case "Суббота":
                System.out.println(dayString7 + " - " + group2);
                break;
            default:
                System.out.println("Выходной");
        }
    }
}




