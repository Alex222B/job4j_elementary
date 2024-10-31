package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double descAndDiv(double first, double second) {
        return desc(first, second) + div(first, second);
    }

    public static double sumAndMultiplyAndDescAndDiv(double first, double second) {
        return desc(first, second) + div(first, second)
                + sum(first, second) + multiply(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета sumAndMultiply равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета descAndDiv равен: " + descAndDiv(10, 20));
        System.out.println("Результат расчета sumAndMultiplyAndDescAndDiv равен: "
                + sumAndMultiplyAndDescAndDiv(10, 20));
    }
}
