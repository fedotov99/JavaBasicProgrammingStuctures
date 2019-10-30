package com.netcracker;

public class TimeEstimator {
    public interface PassedFunction {
        public void doSomething();
    }

    public String estimateTime(PassedFunction function, String functionName) {
        long startTime = System.nanoTime();
        function.doSomething();
        long estimatedTime = System.nanoTime() - startTime;
        return "The estimated time of " + functionName + " is " + estimatedTime;
    }
}
