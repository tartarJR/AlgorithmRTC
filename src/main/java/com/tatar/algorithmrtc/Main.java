package com.tatar.algorithmrtc;

import com.tatar.algorithmrtc.algorithm.Algorithm;
import com.tatar.algorithmrtc.algorithm.sortingalgorithm.InsertionSort;
import com.tatar.algorithmrtc.algorithm.sortingalgorithm.MergeSort;
import com.tatar.algorithmrtc.inputhelper.InputGenerator;
import com.tatar.algorithmrtc.inputhelper.RandomGenerator;
import com.tatar.algorithmrtc.rtc.RunTimeCalculator;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        RandomGenerator randomGenerator = new RandomGenerator(random);
        InputGenerator inputGenerator = new InputGenerator(randomGenerator);

        int[] inputArr = inputGenerator.getRandomIntegerArray(10000000, 1000, 0);

        RunTimeCalculator runTimeCalculator = new RunTimeCalculator();

        Algorithm mergeSort = new MergeSort();
        Algorithm insertionSort = new InsertionSort();

        //System.out.println("Elapsed time in nanoseconds for MERGE SORT: " + runTimeCalculator.calculate(mergeSort, inputArr));
        System.out.println("Elapsed time in nanoseconds for INSERTION SORT: " + runTimeCalculator.calculate(insertionSort, inputArr));
    }
}
//1247454033 merge
//1565207
