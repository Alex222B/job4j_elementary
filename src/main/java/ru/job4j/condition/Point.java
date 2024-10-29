package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rslX = x2 - x1;
        double rslY = y2 - y1;
        rslX = Math.pow(rslX, 2);
        rslY = Math.pow(rslY, 2);
        double result = Math.sqrt(rslX + rslY);
        return result;
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
