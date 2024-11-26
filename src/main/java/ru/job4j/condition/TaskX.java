package ru.job4j.condition;

public class TaskX {
        private static int normalize(int val) {
            if (val > 9) {
                val--;
            } else if (val < 0) {
                val++;
            }
            return val;
        }

        public static void transform(int number) {
            int znak = number > 0 ? 1 : -1;
            number = Math.abs(number);
            int num1 = number / 100;
            int num2 = number % 100 / 10;
            int num3 = number % 10;
            if (number % 2 == 0) {
                num1 += num1 % 2 == 0 ? 1 : -1;
                num2 += num2 % 2 == 0 ? 1 : -1;
                num3 += num3 % 2 == 0 ? 1 : -1;
            } else {
                num1 += num1 % 2 == 0 ? -1 : 1;
                num2 += num2 % 2 == 0 ? -1 : 1;
                num3 += num3 % 2 == 0 ? -1 : 1;
            }
            num1 =  normalize(num1);
            num2 =  normalize(num2);
            num3 =  normalize(num3);

            System.out.println(znak * (num1 * 100 + num2 * 10 + num3));
        }

    public static void main(String[] args) {
        TaskX.transform(-109);

    }
}
