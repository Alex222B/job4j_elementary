package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class FindLoopTest {
    @Test
    public void whenArrayHas5Then0() {
    int[] data = {5, 4, 3, 2};
    int el = 5;
    int result = FindLoop.indexOf(data, el);
    int expected = 0;
    Assert.assertEquals(expected, result);
}
    @Test
    public void whenArrayHas33Then4() {
        int[] data = {5, 4, 3, 2, 33, 45};
        int el = 33;
        int result = FindLoop.indexOf(data, el);
        int expected = 4;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHas32ThenMinus1() {
        int[] data = {5, 4, 3, 2, 33, 45};
        int el = 32;
        int result = FindLoop.indexOf(data, el);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }

}