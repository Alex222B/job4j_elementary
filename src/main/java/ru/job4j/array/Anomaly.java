package ru.job4j.array;

import java.util.Arrays;

public class Anomaly {
    public static int[][] found(int[] data, int up, int down) {
        int[][] result = new int[data.length][2];
        int count = 0;
        boolean anomaly = true;
        int indexStart = 0;
        int indexEnd;
        for (int i = 0; i < data.length; i++) {
            if (((data[i] >= up) || (data[i] <= down)) && (anomaly)) {
                anomaly = false;
                indexStart = i;
                continue;
            }
            if (((data[i] >= up) || (data[i] <= down)) && (!anomaly)) {
                anomaly = true;
                indexEnd = i;
                result[count][0] = indexStart;
                result[count][1] = indexEnd;
                count++;
            }
        }
        if (!anomaly) {
            result[count][0] = indexStart;
            result[count][1] = indexStart;
            count++;
        }
        return Arrays.copyOf(result, count);
    }
}
