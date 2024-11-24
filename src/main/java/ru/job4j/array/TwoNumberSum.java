package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        boolean result = false;
        int i = 0;
        int j = i + 1;
        while (i < array.length - 1) {
            if (array[i] + array[j] == target) {
                result = true;
                break;
            }
            j++;
            if (j == array.length) {
                i++;
                j = i + 1;
            }
        }
        return result ?  new int[] {i, j} : new int[0];
    }
}
