package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when10to40then3() {
        double expected = 3;
        Point a = new Point(1, 0);
        Point b = new Point(4, 0);
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when11to55then5Dot65() {
        double expected = 5.65;
        Point a = new Point(1, 1);
        Point b = new Point(5, 5);
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenMinus1Minus1to33then5Dot65() {
        double expected = 5.65;
        Point a = new Point(-1, -1);
        Point b = new Point(3, 3);
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    public void when000to111then1p73() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(1, 1, 1);
        double expected = 1.73;
        double output = a.distance3d(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    public void when000to001then1() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(0, 0, 1);
        double expected = 1;
        double output = a.distance3d(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    public void when123to456then5p20() {
        Point a = new Point(1, 2, 3);
        Point b = new Point(4, 5, 6);
        double expected = 5.20;
        double output = a.distance3d(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

}