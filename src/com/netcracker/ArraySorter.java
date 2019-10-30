package com.netcracker;

import java.util.Arrays;

public class ArraySorter {
    public static void getRandomArray(int[] array, int high) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * high);
        }
    }

    public static void BubbleSort(int[] array, SortType sortType) {
        boolean isSorted = false;
        int lastUnsorted = array.length - 1;
        while(!isSorted) {
            isSorted = true;
            if (sortType == SortType.ASCENDING) {
                for (int i = 0; i < lastUnsorted; i++) {
                        if (array[i] > array[i + 1]) {
                            swapElements(array, i, i + 1);
                            isSorted = false;
                        }
                }
                lastUnsorted--;
            }
            else if (sortType == SortType.DESCENDING) {
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

    private static void swapElements(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    public static void printArray(int[] array) {
        System.out.println();
        Arrays.stream(array).forEach(a-> System.out.print(a + " "));
        System.out.println();
    }
}
