package ru.job4j.array;

public class TriangleMatrix {
    public static int[][] rows(int count) {
        int[][] triangle = new int[count][];
        int data = 1;
        for (int i = 1; i <= count; i++) {
            triangle[i - 1] = new int[i];
            for (int j = 0; j < i; j++) {
                triangle[i - 1][j] = data;
                data++;
            }
        }
        return triangle;
    }
}
