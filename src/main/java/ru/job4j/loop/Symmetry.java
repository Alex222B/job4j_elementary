package ru.job4j.loop;

public class Symmetry {
    public static boolean check(int i) {
        boolean rsl = true;
        String str = Integer.toString(i);
        int j = str.length();
        for (int ii = 0; ii < str.length(); ii++) {
            j--;
            if (str.charAt(ii) != str.charAt(j)) {
                rsl = false;
                break;
            } else if  (ii == j) {
                break;
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        boolean ffcheck = Symmetry.check(1112111);
        boolean ff = Symmetry.check(123456321);
    }
}
