package com.netcracker;

import java.util.Arrays;

public class Main {
    final static int N = 100;

    public static void main(String[] args) {
        TimeEstimator timeEstimator = new TimeEstimator();

        int[] array = new int[N];
        ArraySorter.getRandomArray(array, 100);
        timeEstimator.estimateSortingTime(ArraySorter::bubbleSort, array, SortType.ASCENDING, "bubbleSort(array, SortType.ASCENDING)");
//        ArraySorter.printArray(array);

        ArraySorter.getRandomArray(array, 100);
        timeEstimator.estimateSortingTime(ArraySorter::selectionSort, array, SortType.ASCENDING, "selectionSort(array, SortType.ASCENDING)");
//        ArraySorter.printArray(array);

        ArraySorter.getRandomArray(array, 100);
        timeEstimator.estimateSortingTime(ArraySorter::callStandardSortMethod, array, SortType.ASCENDING, "callStandardSortMethod(array, SortType.ASCENDING)");
//        ArraySorter.printArray(array);
    }
}
