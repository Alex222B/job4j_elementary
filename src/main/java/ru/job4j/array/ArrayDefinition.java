package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] names = new String[4];
        String[] surnames = new String[10500];
        float[] prices = new float[40];
        System.out.println("Размер массива ages равен: " + ages.length);
        System.out.println("Размер массива surnames равен: " + surnames.length);
        System.out.println("Размер массива prices равен: " + prices.length);
        names[0] = "Ivan Ivanov";
        names[1] = "Petr Petrov";
        names[2] = "Fedor Fedorov";
        names[3] = "Maksim Ivanov";
        for (int i = 0; i < names.length; i++) {
            System.out.println("names(" + i + ")=" + names[i]);
        }
    }
}
