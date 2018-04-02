package com.tatar.algorithmrtc.rtc;

import com.tatar.algorithmrtc.algorithm.Algorithm;

import java.util.concurrent.TimeUnit;

public class RunTimeCalculator {
    public long calculate(Algorithm algorithm, int[] inputArray) {
        long lStartTime = System.nanoTime();
        algorithm.perform(inputArray);
        long lEndTime = System.nanoTime();

        return lEndTime - lStartTime;
    }
}
