package com.tatar.algorithmrtc.rtc;

import com.tatar.algorithmrtc.algorithm.Algorithm;

import java.util.concurrent.TimeUnit;

public class RunTimeCalculator {

    public double getRunningTimeInSeconds(Algorithm algorithm, int[] inputArray) {
        long startTime = System.nanoTime();
        algorithm.perform(inputArray);
        long endTime = System.nanoTime();

        long elapsedTime = endTime - startTime;

        return (double)elapsedTime / 1000000000.0;
    }
}
