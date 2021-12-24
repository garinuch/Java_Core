package Lesson2_HW;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws MyArrayDataException, MyArraySizeException {
        int[][] myArr = {{12, 25, 15, 10}, {32, 27, 92, 68}, {35, 32, 23, 98}, {1, 45, 71, 5}};

        System.out.print(Arrays.deepToString(myArr));

        try {
            try {
                int result;
                result = method(myArr);
                System.out.print(result);
            } catch (MyArrayDataException e) {
                System.out.println("Привышение размера массива!");
            }
        } catch (MyArraySizeException e) {
            e.printStackTrace();
            System.out.println("Неправильное значение массива!");
            System.out.println("Ошибка в ячейке: " + e.i + "x" + e.j);
        }

    }

    public static int method(int[][] arr) throws MyArraySizeException, MyArrayDataException {
        int count = 0;
        if (arr.length != 3) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    count = count + Integer.parseInt(String.valueOf(arr[i][j]));
                }
                catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }

        }
        return count;
    }
}
