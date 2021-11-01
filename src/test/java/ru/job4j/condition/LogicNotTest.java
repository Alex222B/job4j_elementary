package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class LogicNotTest {

    @Test
    public void whenNotEvenAndPositive1Then1() {
        int t = 1;
        boolean result = LogicNot.notEvenAndPositive(t);
        boolean expected = true;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenNotEvenAndPositive2Then0() {
        int t = 2;
        boolean result = LogicNot.notEvenAndPositive(t);
        boolean expected = false;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenEvenOrNotPositive2Then1() {
        int t = 2;
        boolean result = LogicNot.evenOrNotPositive(t);
        boolean expected = true;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenEvenOrNotPositive1Then0() {
        int t = 1;
        boolean result = LogicNot.evenOrNotPositive(t);
        boolean expected = false;
        Assert.assertEquals(result, expected);
    }

}