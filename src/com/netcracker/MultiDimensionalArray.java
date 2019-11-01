package com.netcracker;

import java.util.Arrays;

public class MultiDimensionalArray {
    public static int[][] getRandomMultiArray(int rows, int cols, int min, int max) {
        int[][] array = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            array[i] = OneDimensionalArray.getRandomArray(cols, min, max);
        }
        return array;
    }

    public static int getSumOfMainDiagonal(int[][] array){
        try {
            if (array.length != array[0].length) {
                throw new Exception("Rows count must be equal to cols count!");
            }

            int sum = 0;

            for (int i = 0; i < array.length; i++) {
                sum += array[i][i];
            }

            return sum;
        }
        catch (Exception exception) {
            System.out.println(exception.getMessage());
            return -1;
        }
    }

    public static void printMultiArray(int[][] array) {
        System.out.println();
        System.out.println(Arrays.deepToString(array));
        System.out.println();
    }
}
