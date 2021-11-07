package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int indexLeft = 0;
        int indexRight = 0;
        for (int index = 0; index < rsl.length; index++) {
            if ((indexLeft < left.length) && (indexRight < right.length)) {
                rsl[index] = left[indexLeft ] < right[indexRight] ? left[indexLeft++ ] : right[indexRight++];
            } else if (indexLeft < left.length) {
                rsl[index] =  left[indexLeft++];
            } else {
                rsl[index] = right[indexRight++];
            }
        }
        return rsl;
    }
}
