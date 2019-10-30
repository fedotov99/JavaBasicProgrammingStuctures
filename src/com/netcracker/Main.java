package com.netcracker;

import java.util.Arrays;

public class Main {
    final static int N = 10;

    public static void main(String[] args) {
        TimeEstimator timeEstimator = new TimeEstimator();

        int[] array = new int[N];
        ArraySorter.getRandomArray(array, 100);
        ArraySorter.printArray(array);
        timeEstimator.estimateSortingTime(ArraySorter::BubbleSort, array, SortType.ASCENDING, "BubbleSort(array, SortType.ASCENDING)");
        ArraySorter.printArray(array);
    }
}
