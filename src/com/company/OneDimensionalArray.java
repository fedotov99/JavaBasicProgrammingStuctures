package com.company;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class OneDimensionalArray {
    public static void getRandomArray(int[] array, int min, int max) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * ((max - min) + 1)) + min;
        }
    }

    public static int[] getRandomArray(int size, int min, int max) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * ((max - min) + 1)) + min;
        }
        return array;
    }

    public static int[] getOddNumberArray(int size, SortType sortType) {
        int[] array = new int[size];
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

    public static long countEvenNumber(int[] array) {
        return Arrays.stream(array).filter(i -> i % 2 == 0).count();
    }

    public static long countOddNumber(int[] array) {
        return Arrays.stream(array).filter(i -> i % 2 != 0).count();
    }

    public static void replaceOddIndexesWith0(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                array[i] = 0;
            }
        }
    }

    public static int findSmallestElement(int[] array, int startIndex) { // designed for selectionSort
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

    public static int findBiggestElement(int[] array, int startIndex) { // designed for selectionSort
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

    public static int getLastMinElementIndex(int[] array) {
        int minElement = array[0];
        int indexOfMinElement = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] <= minElement) {
                minElement = array[i];
                indexOfMinElement = i;
            }
        }
        return indexOfMinElement;
    }

    public static int getLastMaxElementIndex(int[] array) {
        int maxElement = array[0];
        int indexOfMaxElement = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] >= maxElement) {
                maxElement = array[i];
                indexOfMaxElement = i;
            }
        }
        return indexOfMaxElement;
    }

    public static double getAverage(int[] array) {
        return Arrays.stream(array).average().getAsDouble();
    }

    public static void compareAveragesOfTwoArrays (double average1, double average2) {
        if (average1 > average2) {
            System.out.println("Average of first array > average of second array");
        }
        else if (average1 < average2) {
            System.out.println("Average of first array < average of second array");
        }
        else {
            System.out.println("Average of first array = average of second array");
        }
    }

    public static Map<Integer, Integer> getTheMostFrequentElements(int[] array) {
        Map<Integer, Integer> counter = new LinkedHashMap<Integer, Integer>(); // key - element of array, value - count of element. store the count of each key
        for (int i = 0; i < array.length; i++) {
            if (counter.get(array[i]) != null)
                counter.put(array[i], counter.get(array[i]) + 1);
            else {
                counter.put(array[i], 1);
            }
        }
        Map<Integer, Integer> resultCounter;
        // find max value of count
        int maxCount = counter.entrySet().stream().max((i, j)-> i.getValue() > j.getValue() ? 1 : -1).get().getValue();
        // looking for elements with the same max value of count
        resultCounter = counter.entrySet().stream().filter((i) -> i.getValue() == maxCount).collect(Collectors.toMap(k->k.getKey(), v->v.getValue()));

        return resultCounter;
    }

    public static void printArray(int[] array) {
        System.out.println();
        Arrays.stream(array).forEach(a-> System.out.print(a + " "));
        System.out.println();
    }
}
