package ru.job4j.condition;

public class TaskX {

    /**
     * Метод для подсчета количества замкнутых областей
     * Проходим циклом по столбцам в каждой строке
      */
    public static int countClosedAreas(int[][] map) {
        int count = 0;
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] == 0) {
                    count +=  isClosedArea(map, i, j) ? 1 : 0;
                }
            }
        }
        return count;
    }

    /**
     * Вспомогательный метод для проверки замкнутой области
     * Рекурсивно проверяем на наличие нулей справа, слева и снизу
     * в текущую ячейку записываем 1
     */
    private static boolean isClosedArea(int[][] map, int row, int col) {
        boolean result = true;
        map[row][col] = 1;
        if (col + 1 < map[row].length) {
            if (map[row][col + 1] == 0) {
                result &= isClosedArea(map, row, col + 1);
            }
        } else {
            result = false;
        }
        if (row + 1 < map.length) {
            if (map[row + 1][col] == 0) {
                result &= isClosedArea(map, row + 1, col);
            }
        } else {
            result = false;
        }
        if (col - 1 >= 0) {
            if (map[row][col - 1] == 0) {
                result &= isClosedArea(map, row, col - 1);
            }
        } else {
            result = false;
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] map = {
                {1, 1, 1, 1, 1},
                {1, 0, 0, 0, 1},
                {1, 1, 1, 0, 0},
                {0, 0, 1, 1, 1},
                {1, 1, 1, 1, 1}
        };

        System.out.println(TaskX.countClosedAreas(map));

    }
}
