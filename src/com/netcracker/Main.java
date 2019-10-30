package com.netcracker;

import java.util.Arrays;

public class Main {
    final static int N = 100;

    public static void main(String[] args) {
//        ===============ArraySorter sample===============

        int[] array = new int[N];
        ArraySorter.getRandomArray(array, 100);
        TimeEstimator.estimateSortingTime(ArraySorter::bubbleSort, array, SortType.ASCENDING, "bubbleSort(array, SortType.ASCENDING)");
//        ArraySorter.printArray(array);

        ArraySorter.getRandomArray(array, 100);
        TimeEstimator.estimateSortingTime(ArraySorter::selectionSort, array, SortType.ASCENDING, "selectionSort(array, SortType.ASCENDING)");
//        ArraySorter.printArray(array);

        ArraySorter.getRandomArray(array, 100);
        TimeEstimator.estimateSortingTime(ArraySorter::callStandardSortMethod, array, SortType.ASCENDING, "callStandardSortMethod(array, SortType.ASCENDING)");
//        ArraySorter.printArray(array);

//        ===============FactorialCalculation sample===============
        int n = 5;
        TimeEstimator.estimateFactorialTime(FactorialCalculation::getLoopFactorial, n, "getLoopFactorial(n)");
        TimeEstimator.estimateFactorialTime(FactorialCalculation::getRecursionFactorial, n, "getRecursionFactorial(n)");

    }
}
