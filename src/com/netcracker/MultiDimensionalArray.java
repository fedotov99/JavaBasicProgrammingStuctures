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

    public static void printMultiArray(int[][] array) {
        System.out.println();
        System.out.println(Arrays.deepToString(array));
        System.out.println();
    }
}
