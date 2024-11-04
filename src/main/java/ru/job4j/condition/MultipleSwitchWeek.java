package ru.job4j.condition;

public class MultipleSwitchWeek {
    public static int numberOfDay(String name) {
        return switch (name) {
            case "Понедельник", "Monday" -> 1;
            case "Вторник", "Tuesday" -> 2;
            case "Среда", "Wednesday" -> 3;
            case "Четверг", "Thursday" -> 4;
            case "Пятница", "Friday" -> 5;
            case "Суббота", "Saturday" -> 6;
            case "Воскресенье", "Sunday" -> 7;
            default -> -1;
        };
    }

    public static void main(String[] args) {
        System.out.println("Понедельник = " + MultipleSwitchWeek.numberOfDay("Понедельник"));
        System.out.println("Tuesday = " + MultipleSwitchWeek.numberOfDay("Tuesday"));
        System.out.println("Среда = " + MultipleSwitchWeek.numberOfDay("Среда"));
        System.out.println("Thursday = " + MultipleSwitchWeek.numberOfDay("Thursday"));
        System.out.println("Пятница = " + MultipleSwitchWeek.numberOfDay("Пятница"));
        System.out.println("Saturday = " + MultipleSwitchWeek.numberOfDay("Saturday"));
        System.out.println("Воскресенье = " + MultipleSwitchWeek.numberOfDay("Воскресенье"));
        System.out.println("День = " + MultipleSwitchWeek.numberOfDay("День"));
    }
}

