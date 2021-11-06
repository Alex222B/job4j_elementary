package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort3el() {
        int[] data = new int[] {1, 4, 2};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 4};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort5el() {
        int[] data = new int[] {1, 4, 2, 4, 6};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 4, 4, 6};
        Assert.assertArrayEquals(expected, result);
    }
}