package com.netcracker;

import java.util.concurrent.Callable;

public class TimeEstimator {
    public interface PassedFunction {
        public void sortArray(int[] array, SortType sortType);
    }

    public void estimateSortingTime(PassedFunction function, int[] array, SortType sortType, String functionName) {
        long startTime = System.nanoTime();
        function.sortArray(array, sortType);
        long estimatedTime = System.nanoTime() - startTime;
        System.out.println("The estimated time of " + functionName + " is " + estimatedTime + "ms");
    }
}
