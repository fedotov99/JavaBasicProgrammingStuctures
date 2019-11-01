package com.company;

public class TimeEstimator {

    public static void estimateSortingTime(PassedSortingFunction function, int[] array, SortType sortType, String functionName) {
        long startTime = System.nanoTime();
        function.sortArray(array, sortType);
        long estimatedTime = System.nanoTime() - startTime;
        System.out.println("The estimated time of " + functionName + " is " + estimatedTime + "ms");
    }

    public static void estimateFactorialTime(PassedFactorialFunction function, int n, String functionName) {
        long startTime = System.nanoTime();
        function.getFactorial(n);
        long estimatedTime = System.nanoTime() - startTime;
        System.out.println("The estimated time of " + functionName + " is " + estimatedTime + "ms");
    }
}
