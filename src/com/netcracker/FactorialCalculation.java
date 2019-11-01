package com.netcracker;

public class FactorialCalculation {
    public static int getLoopFactorial(int n) {
        int result = 1;

        try {
            if (n < 0)
                throw new Exception("Factorial number must be >= 0");

            if (n == 0) {  // special case
                return 1;
            }

            for (int i = 1; i <= n; i++) {
                result *= i;
            }

            return result;
        }
        catch (Exception exception) {
            System.out.println(exception.getMessage());
            return 0;
        }
    }

    public static int getRecursionFactorial(int n) {
        try {
            if (n < 0) {
                throw new Exception("Factorial number must be >= 0");
            }
            if (n == 0) {  // special case
                return 1;
            }

            if (n == 1)
                return 1;
            else {
                return n * getLoopFactorial(n - 1);
            }
        }
        catch (Exception exception) {
            System.out.println(exception.getMessage());
            return 0;
        }
    }
}
