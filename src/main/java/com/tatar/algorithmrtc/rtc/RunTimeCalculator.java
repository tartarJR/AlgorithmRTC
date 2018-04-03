package com.tatar.algorithmrtc.rtc;

import com.tatar.algorithmrtc.algorithm.Algorithm;
import com.tatar.algorithmrtc.algorithm.sortingalgorithm.SortingAlgorithm;

import java.util.concurrent.TimeUnit;

public class RunTimeCalculator {

    public double getRunningTimeInSeconds(SortingAlgorithm sortingAlgorithm, int[] inputArray) {
        long startTime = System.nanoTime();
        sortingAlgorithm.sort(inputArray);
        long endTime = System.nanoTime();

        long elapsedTime = endTime - startTime;

        return (double) elapsedTime / 1000000000.0;
    }
}
