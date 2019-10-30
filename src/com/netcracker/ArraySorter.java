package com.netcracker;

import java.util.Arrays;

public class ArraySorter {
    public static void getRandomArray(int[] array, int high) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * high);
        }
    }

    public static void bubbleSort(int[] array, SortType sortType) {
        boolean isSorted = false;
        int lastUnsorted = array.length - 1;
        if (sortType == SortType.ASCENDING) {
            while (!isSorted) {
                isSorted = true;
                for (int i = 0; i < lastUnsorted; i++) {
                    if (array[i] > array[i + 1]) {
                        swapElements(array, i, i + 1);
                        isSorted = false;
                    }
                }
                lastUnsorted--;
            }
        } else if (sortType == SortType.DESCENDING) {
            while (!isSorted) {
                isSorted = true;
                for (int i = 0; i < lastUnsorted; i++) {
                    if (array[i] < array[i + 1]) {
                        swapElements(array, i, i + 1);
                        isSorted = false;
                    }
                }
                lastUnsorted--;
            }
        }
    }

    public static void selectionSort(int[] array, SortType sortType) {
        if (sortType == SortType.ASCENDING) {
            int indexOfSmallestElement;

            for (int front = 0; front < array.length; front++) {
                indexOfSmallestElement = findSmallestElement(array, front);
                swapElements(array, front, indexOfSmallestElement);
            }
        }
        else if (sortType == SortType.DESCENDING) {
            int indexOfBiggestElement;

            for (int front = 0; front < array.length; front++) {
                indexOfBiggestElement = findBiggestElement(array, front);
                swapElements(array, front, indexOfBiggestElement);
            }
        }
    }

    public static void callStandardSortMethod(int[] array, SortType sortType) {
        Arrays.sort(array);
    }

    private static void swapElements(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    private static int findSmallestElement(int[] array, int startIndex) {
        int smallestElement = array[startIndex];
        int indexOfSmallestElement = startIndex;

        for (int i = startIndex; i < array.length; i++) {
            if (array[i] < smallestElement) {
                smallestElement = array[i];
                indexOfSmallestElement = i;
            }
        }
        return indexOfSmallestElement;
    }

    private static int findBiggestElement(int[] array, int startIndex) {
        int biggestElement = array[startIndex];
        int indexOfBiggestElement = startIndex;

        for (int i = startIndex; i < array.length; i++) {
            if (array[i] > biggestElement) {
                biggestElement = array[i];
                indexOfBiggestElement = i;
            }
        }
        return indexOfBiggestElement;
    }

    public static void printArray(int[] array) {
        System.out.println();
        Arrays.stream(array).forEach(a-> System.out.print(a + " "));
        System.out.println();
    }
}
