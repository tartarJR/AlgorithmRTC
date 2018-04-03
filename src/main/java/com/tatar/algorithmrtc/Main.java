package com.tatar.algorithmrtc;

import com.tatar.algorithmrtc.sortingalgorithm.InsertionSort;
import com.tatar.algorithmrtc.sortingalgorithm.MergeSort;
import com.tatar.algorithmrtc.sortingalgorithm.SortingAlgorithm;
import com.tatar.algorithmrtc.inputhelper.InputGenerator;
import com.tatar.algorithmrtc.inputhelper.RandomGenerator;
import com.tatar.algorithmrtc.rtc.RunTimeCalculator;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        RandomGenerator randomGenerator = new RandomGenerator(random);
        InputGenerator inputGenerator = new InputGenerator(randomGenerator);

        int[] inputArr = inputGenerator.getRandomIntegerArray(10, 1000, 0);

        RunTimeCalculator runTimeCalculator = new RunTimeCalculator();

        SortingAlgorithm mergeSort = new MergeSort();
        SortingAlgorithm insertionSort = new InsertionSort();

        //System.out.println("Running time for MERGE SORT is " + runTimeCalculator.getRunningTimeInSeconds(mergeSort, inputArr) + " seconds.");
        System.out.println("Running time for INSERTION SORT is " + runTimeCalculator.getRunningTimeInSeconds(insertionSort, inputArr) + " seconds.");
    }
}
// 10000000                 1.720142459
// 300000   10.881722244    0.047389845
// 500000   27.927323336    0.079521302
// 1000000  111.343392966   0.150275374
