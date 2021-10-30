package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double tmp1 = x2 - x1;
        tmp1 = Math.pow(tmp1, 2);
        double tmp2 = y2 - y1;
        tmp2 = Math.pow(tmp2, 2);
        return Math.sqrt(tmp1 + tmp2);
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        result = Point.distance(1, 0, 4, 0);
        System.out.println("result (1, 0) to (4, 0) " + result);
        result = Point.distance(1, 1, 5, 5);
        System.out.println("result (1, 1) to (5, 5) " + result);
    }
}
