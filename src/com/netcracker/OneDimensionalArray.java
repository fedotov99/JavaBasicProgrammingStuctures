package com.netcracker;

public class OneDimensionalArray {
    public static int[] getOddNumberArray(SortType sortType) {
        int[] array = new int[50];
        int oddNumber = 1;
        for (int i = 0; i < array.length; i++) {
            array[i] = oddNumber;
            oddNumber += 2;
        }

        if (sortType == SortType.ASCENDING) {
            return  array;
        }
        else {
            ArraySorter.selectionSort(array, SortType.DESCENDING);
            return array;
        }
    }
}
