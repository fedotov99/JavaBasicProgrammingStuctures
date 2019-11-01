package com.company;

import java.util.Arrays;
import java.util.LinkedList;

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

    public static int getSumOfSecondaryDiagonal(int[][] array){
        try {
            if (array.length != array[0].length) {
                throw new Exception("Rows count must be equal to cols count!");
            }

            int sum = 0;

            for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
                sum += array[i][j];
            }

            return sum;
        }
        catch (Exception exception) {
            System.out.println(exception.getMessage());
            return -1;
        }
    }

    public static int getMultiplicationOfMainDiagonal(int[][] array){
        try {
            if (array.length != array[0].length) {
                throw new Exception("Rows count must be equal to cols count!");
            }

            int multiplication = 1;

            for (int i = 0; i < array.length; i++) {
                multiplication *= array[i][i];
            }

            return multiplication;
        }
        catch (Exception exception) {
            System.out.println(exception.getMessage());
            return -1;
        }
    }

    public static int getMultiplicationOfSecondaryDiagonal(int[][] array){
        try {
            if (array.length != array[0].length) {
                throw new Exception("Rows count must be equal to cols count!");
            }

            int multiplication = 1;

            for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
                multiplication *= array[i][j];
            }

            return multiplication;
        }
        catch (Exception exception) {
            System.out.println(exception.getMessage());
            return -1;
        }
    }

    public static LinkedList<IndexesOfMaxElementsInMultiArrays> getIndexesOfMaxElementInMultiArray(int[][] array) {
        int maxInAllRows = array[0][0];
        int maxInParticularRow;

        for (int i = 0; i < array.length; i++) {
            maxInParticularRow = Arrays.stream(array[i]).max().getAsInt();
            if (maxInParticularRow > maxInAllRows) {
                maxInAllRows = maxInParticularRow;
            }
        }

        LinkedList<IndexesOfMaxElementsInMultiArrays> indexesOfMaxElementList = new LinkedList<>();

        // find all indexes where elements are equal to maxInAllRows element
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == maxInAllRows) {
                    IndexesOfMaxElementsInMultiArrays indexes = new IndexesOfMaxElementsInMultiArrays(i, j);
                    indexesOfMaxElementList.add(indexes);
                }
            }
        }

        return indexesOfMaxElementList;
    }

    public static void printMultiArray(int[][] array) {
        System.out.println();
        System.out.println(Arrays.deepToString(array));
        System.out.println();
    }
}
