package ru.job4j.condition;

public class Triangle {

    public static boolean exist(double ab, double ac, double bc) {
        double eps = 0.001;
        return (ab + ac - bc > eps) && (ab + bc - ac > eps) && (ac + bc - ab > eps);
    }
}
