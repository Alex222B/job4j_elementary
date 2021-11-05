package ru.job4j.array;

/**
 * Циклом for проходит от элемента sourceIndex до конца массива,
 * определяет минимальное значение эл-та и его индекс - destIndex
 * меняет элементы местами и сдвигает sourceIndex вперед.
 * Работает while пока sourceIndex не дойдет до предпоследнего эл-та
 */
public class AlgoArray {
    public static void main(String[] args) {
        int[] array = new int[] {5, 3, 2, 1, 4, 6, 5, 7};
        int sourceIndex = 0;
        int destIndex = 0;
        int currentMinimum = array[0];
        int temp;

        while (sourceIndex < array.length - 1) {
            for (int index = sourceIndex; index < array.length; index++) {
                if (currentMinimum >= array[index]) {
                    currentMinimum = array[index];
                    destIndex = index;
                }
            }
            temp = array[sourceIndex];
            array[sourceIndex] = array[destIndex];
            array[destIndex] = temp;
            sourceIndex++;
            currentMinimum = array[sourceIndex];
        }

        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}
