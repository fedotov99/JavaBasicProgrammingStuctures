package com.company;

import java.util.Arrays;
import java.util.Collections;

public class ArraySorter {
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
                indexOfSmallestElement = OneDimensionalArray.findSmallestElement(array, front);
                swapElements(array, front, indexOfSmallestElement);
            }
        }
        else if (sortType == SortType.DESCENDING) {
            int indexOfBiggestElement;

            for (int front = 0; front < array.length; front++) {
                indexOfBiggestElement = OneDimensionalArray.findBiggestElement(array, front);
                swapElements(array, front, indexOfBiggestElement);
            }
        }
    }

    public static void callStandardSortMethod(int[] array, SortType sortType) {
        if (sortType == SortType.ASCENDING)
            Arrays.sort(array);
        else if (sortType == SortType.DESCENDING) {
            Integer[] newArray = Arrays.stream(array).boxed().toArray(Integer[]::new);
            Arrays.sort(newArray, Collections.reverseOrder());
            for (int i = 0; i < array.length; i++) {
                array[i] = newArray[i];
            }
        }
    }

    private static void swapElements(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
}
