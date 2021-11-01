package ru.job4j.condition;

public class SwitchWeek {
    public static String nameOfDay(int day) {
        String name;
        switch (day) {
            case 1:
                name = "Понедельник";
                break;
            case 2:
                name = "Вторник";
                break;
            case 3:
                name = "Среда";
                break;
            case 4:
                name = "Четверг";
                break;
            case 5:
                name = "Пятница";
                break;
            case 6:
                name = "Суббота";
                break;
            case 7:
                name = "Воскресенье";
                break;
            default:
                name = "Ошибка";
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
