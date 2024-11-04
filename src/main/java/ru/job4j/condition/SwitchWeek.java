package ru.job4j.condition;

public class SwitchWeek {
    public static String nameOfDay(int day) {
        String name;
        switch (day) {
            case 1:
                name = "Monday";
                break;
            case 2:
                name = "Tuesday";
                break;
            case 3:
                name = "Wednesday";
                break;
            case 4:
                name = "Thursday";
                break;
            case 5:
                name = "Friday";
                break;
            case 6:
                name = "Saturday";
                break;
            case 7:
                name = "Sunday";
                break;
            default:
                name = "Error";
                break;
        }
        return name;
    }

    public static void main(String[] args) {
        System.out.println(" 1день -- " + SwitchWeek.nameOfDay(1));
        System.out.println(" 2день -- " + SwitchWeek.nameOfDay(2));
        System.out.println(" 3день -- " + SwitchWeek.nameOfDay(3));
        System.out.println(" 4день -- " + SwitchWeek.nameOfDay(4));
        System.out.println(" 5день -- " + SwitchWeek.nameOfDay(5));
        System.out.println(" 6день -- " + SwitchWeek.nameOfDay(6));
        System.out.println(" 7день -- " + SwitchWeek.nameOfDay(7));
        System.out.println("10день -- " + SwitchWeek.nameOfDay(10));
    }
}
