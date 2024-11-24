package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 1;
        result = result + input.charAt(0);
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) != symbol) {
                if (counter > 1) {
                    result += counter;
                }
                symbol = input.charAt(i);
                counter = 0;
                result = result + input.charAt(i);
            }
            counter++;
        }
        if (counter > 1) {
            result += counter;
        }
        return result;
    }
}
