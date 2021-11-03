package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {
     @Test
     public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int var = 5;
        int result = Factorial.calc(var);
        int expected = 120;
        Assert.assertEquals(expected, result);
     }

     @Test
     public void whenCalculateFactorialForZeroThenOne() {
        int var = 0;
        int result = Factorial.calc(var);
        int expected = 1;
        Assert.assertEquals(expected, result);
     }

    @Test
    public void whenCalculateFactorialForOneThenOne() {
        int var = 1;
        int result = Factorial.calc(var);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }

}