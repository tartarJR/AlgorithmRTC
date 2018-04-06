package com.tatar.algorithmrtc;

import com.tatar.algorithmrtc.di.AppComponent;
import com.tatar.algorithmrtc.di.DaggerAppComponent;
import com.tatar.algorithmrtc.inputhelper.InputGenerator;
import com.tatar.algorithmrtc.rtc.RunTimeCalculator;
import com.tatar.algorithmrtc.sortingalgorithm.SortingAlgorithm;

public class Main {
    public static void main(String[] args) {
        AppComponent appComponent = DaggerAppComponent.create();

        InputGenerator inputGenerator = appComponent.getInputGenerator();
        int[] inputArr = inputGenerator.getRandomIntegerArray(10000, 1000, 0);

        RunTimeCalculator runTimeCalculator = appComponent.getRunTimeCalculator();

        SortingAlgorithm mergeSort = appComponent.getMergeSortAlgorithm();
        SortingAlgorithm insertionSort = appComponent.getInsertionSortAlgorithm();

        System.out.println("Running time for MERGE SORT is " + runTimeCalculator.getRunningTimeInSeconds(mergeSort, inputArr) + " seconds.");
        //System.out.println("Running time for INSERTION SORT is " + runTimeCalculator.getRunningTimeInSeconds(insertionSort, inputArr) + " seconds.");
    }
}
// 10000000                 1.720142459
// 300000   10.881722244    0.047389845
// 500000   27.927323336    0.079521302
// 1000000  111.343392966   0.150275374
