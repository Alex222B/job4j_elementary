package ru.job4j.condition;

import ru.job4j.converter.Converter;

public class Triangle {

    public static boolean exist(double ab, double ac, double bc) {
        double eps = 0.001;
        return (ab + ac - bc > eps) && (bc + ab - ac > eps) && (ac + bc - ab > eps);
    }

}
