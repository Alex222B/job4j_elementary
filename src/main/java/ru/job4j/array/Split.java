package ru.job4j.array;

import java.util.Arrays;

public class Split {

    public static char[][] split(char[] str, char c) {
        char[][] result = new char[str.length / 2][];
        boolean word = true;
        int startIndex = 0;
        int endIndex;
        int cnt = 0;
        for (int i = 0; i < str.length; i++) {
            if ((str[i] != c) && word) {
                startIndex = i;
                word = false;
            } else if (((str[i] == c) && !word) || ((i == str.length - 1) && !word)) {
                endIndex = i == str.length - 1 ? i : i - 1;
                word = true;
                result[cnt] = new char[endIndex - startIndex + 1];
                for (int j = startIndex; j <= endIndex; j++) {
                    result[cnt][j - startIndex] = str[j];
                }
                cnt++;
            }
        }
        return Arrays.copyOf(result, cnt);
    }
}
