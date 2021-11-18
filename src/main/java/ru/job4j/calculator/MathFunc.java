package ru.job4j.calculator;

public class MathFunc {
    public static int func1(int x) {
        int y = x * x + 1;
        return y;
    }

    public static  int func2(int x) {
        int y = 1 / x;
        return y;
    }

    public static void main(String[] args) {
        int resThree = MathFunc.func1(3);
        int resFive = MathFunc.func2(5);
        int resOnehundr = MathFunc.func1(100);
        int total = resThree + resFive + resOnehundr;
        System.out.println(total);
    }
}
