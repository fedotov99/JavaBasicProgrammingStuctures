package com.company;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    final static int N = 100;

    public static void main(String[] args) {

//        ===============ArraySorter sample===============

        int[] array = new int[N];
        OneDimensionalArray.getRandomArray(array, 0, 100);
        TimeEstimator.estimateSortingTime(ArraySorter::bubbleSort, array, SortType.ASCENDING, "bubbleSort(array, SortType.ASCENDING)");
//        ArraySorter.printArray(array);

        OneDimensionalArray.getRandomArray(array, 0, 100);
        TimeEstimator.estimateSortingTime(ArraySorter::selectionSort, array, SortType.ASCENDING, "selectionSort(array, SortType.ASCENDING)");
//        ArraySorter.printArray(array);

        OneDimensionalArray.getRandomArray(array, 0, 100);
        TimeEstimator.estimateSortingTime(ArraySorter::callStandardSortMethod, array, SortType.ASCENDING, "callStandardSortMethod(array, SortType.ASCENDING)");
//        ArraySorter.printArray(array);



//        ===============FactorialCalculation sample===============
        int n = 5;
        TimeEstimator.estimateFactorialTime(FactorialCalculation::getLoopFactorial, n, "getLoopFactorial(n)");
        TimeEstimator.estimateFactorialTime(FactorialCalculation::getRecursionFactorial, n, "getRecursionFactorial(n)");


//        ===============SharpDrawer sample===============
        SharpDrawer.drawRectangle(4, 5);
        SharpDrawer.drawEmptyRectangle(4, 5);
        SharpDrawer.drawTriangle(8);



//        ===============OneDimensionalArray sample===============
        int[] oddNumberArray = OneDimensionalArray.getOddNumberArray(SortType.DESCENDING); // or ASCENDING
        OneDimensionalArray.printArray(oddNumberArray);

        int[] random20IntArray = OneDimensionalArray.getRandomArray(20, 0, 10);
        OneDimensionalArray.printArray(random20IntArray);
        System.out.println("Number of even: " + OneDimensionalArray.countEvenNumber(random20IntArray));
        System.out.println("Number of odd: " + OneDimensionalArray.countOddNumber(random20IntArray));

        int[] random10IntArray = OneDimensionalArray.getRandomArray(10, 1, 100);
        OneDimensionalArray.printArray(random10IntArray);
        OneDimensionalArray.replaceOddIndexesWith0(random10IntArray);
        OneDimensionalArray.printArray(random10IntArray);

        int[] random15IntArray = OneDimensionalArray.getRandomArray(15, -50, 50);
        OneDimensionalArray.printArray(random15IntArray);
        int lastMinElementIndex = OneDimensionalArray.getLastMinElementIndex(random15IntArray);
        int lastMaxElementIndex = OneDimensionalArray.getLastMaxElementIndex(random15IntArray);
        System.out.println("Min element is " + random15IntArray[lastMinElementIndex] + ", which last index is " + lastMinElementIndex);
        System.out.println("Max element is " + random15IntArray[lastMaxElementIndex] + ", which last index is " + lastMaxElementIndex);

        int[] firstArrayForAverage = OneDimensionalArray.getRandomArray(10, 0, 10);
        int[] secondArrayForAverage = OneDimensionalArray.getRandomArray(10, 0, 10);
        double averageOfFirstArray = OneDimensionalArray.getAverage(firstArrayForAverage);
        double averageOfSecondArray = OneDimensionalArray.getAverage(secondArrayForAverage);
        OneDimensionalArray.printArray(firstArrayForAverage);
        System.out.println("Average of first array: " + averageOfFirstArray);
        OneDimensionalArray.printArray(secondArrayForAverage);
        System.out.println("Average of second array: " + averageOfSecondArray);
        OneDimensionalArray.compareAveragesOfTwoArrays(averageOfFirstArray, averageOfSecondArray);

        int[] yetAnotherRandom20IntArray = OneDimensionalArray.getRandomArray(20, -1, 1);
        OneDimensionalArray.printArray(yetAnotherRandom20IntArray);
        Map<Integer, Integer> counts = new LinkedHashMap<>();
        counts = OneDimensionalArray.getTheMostFrequentElements(yetAnotherRandom20IntArray);
        counts.forEach((k, v)-> System.out.println("The count of number " + k + " is " + v));



//        ===============MultiDimensionalArray sample===============
        int[][] multiArray = MultiDimensionalArray.getRandomMultiArray(3, 3, 1, 99);
        MultiDimensionalArray.printMultiArray(multiArray);
        System.out.println("Sum of main diagonal is " + MultiDimensionalArray.getSumOfMainDiagonal(multiArray));
        System.out.println("Multiplication of main diagonal is " + MultiDimensionalArray.getMultiplicationOfMainDiagonal(multiArray));
    }
}
