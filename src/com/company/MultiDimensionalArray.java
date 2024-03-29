package com.company;

import java.util.ArrayList;
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

    public static LinkedList<IndexesOfMultiArray> getIndexesOfMaxElementInMultiArray(int[][] array) {
        int maxInAllRows = array[0][0];
        int maxInParticularRow;

        for (int i = 0; i < array.length; i++) {
            maxInParticularRow = Arrays.stream(array[i]).max().getAsInt();
            if (maxInParticularRow > maxInAllRows) {
                maxInAllRows = maxInParticularRow;
            }
        }

        LinkedList<IndexesOfMultiArray> indexesOfMaxElementList = new LinkedList<>();

        // find all indexes where elements are equal to maxInAllRows element
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == maxInAllRows) {
                    IndexesOfMultiArray indexes = new IndexesOfMultiArray(i, j);
                    indexesOfMaxElementList.add(indexes);
                }
            }
        }

        return indexesOfMaxElementList;
    }

    public static int getIndexOfRowWithMaxAbsMultiplicationOfElements(int[][] array) {
        int maxMultiplication = array[0][0];
        int indexOfRowWithMaxAbsMultiplicationOfElements = 0;

        for (int i = 0; i < array.length; i++) {
            int multiplicationInRow = 1;
            for (int j = 0; j < array[i].length; j++) {
                multiplicationInRow *= array[i][j];
            }

            multiplicationInRow = Math.abs(multiplicationInRow);

            if (multiplicationInRow > maxMultiplication) {
                maxMultiplication = multiplicationInRow;
                indexOfRowWithMaxAbsMultiplicationOfElements = i;
            }
        }

        return indexOfRowWithMaxAbsMultiplicationOfElements;
    }

    public static void sortAllRows(int[][] array, SortType sortType) {
        if (sortType == SortType.ASCENDING) {
            for (int i = 0; i < array.length; i++) {
                ArraySorter.selectionSort(array[i], SortType.ASCENDING);
            }
        }
        else if (sortType == SortType.DESCENDING) {
            for (int i = 0; i < array.length; i++) {
                ArraySorter.selectionSort(array[i], SortType.DESCENDING);
            }
        }
    }

    public static void printMultiArray(int[][] array) {
        System.out.println();
        System.out.println(Arrays.deepToString(array));
        System.out.println();
    }
}
