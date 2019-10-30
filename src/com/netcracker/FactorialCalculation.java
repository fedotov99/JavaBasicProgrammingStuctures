package com.netcracker;

public class FactorialCalculation {
    public static int getLoopFactorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

//    public static int getRecursionFactorial(int n) {
//
//    }
}
