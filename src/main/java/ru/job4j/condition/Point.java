package ru.job4j.condition;

public class Point {
    /**
     * Вычисляет расстояние между двумя точками на плоскости по их координатам.
     *
     * @param x1 координата X первой точки
     * @param y1 координата Y первой точки
     * @param x2 координата X второй точки
     * @param y2 координата Y второй точки
     * @return расстояние между точками
     */
    public static double distance(int x1, int y1, int x2, int y2) {
        double deltaX = x2 - x1;
        double deltaY = y2 - y1;
        return Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
    }

    public static void main(String[] args) {
        System.out.println("Distance (0, 0) to (2, 0) = " + Point.distance(0, 0, 2, 0));
        System.out.println("Distance (1, 0) to (4, 0) = " + Point.distance(1, 0, 4, 0));
        System.out.println("Distance (1, 1) to (5, 5) = " + Point.distance(1, 1, 5, 5));
    }
}