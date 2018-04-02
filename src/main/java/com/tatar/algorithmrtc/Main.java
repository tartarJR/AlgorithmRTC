package com.tatar.algorithmrtc;

import com.tatar.algorithmrtc.algorithm.Algorithm;
import com.tatar.algorithmrtc.algorithm.sortingalgorithm.InsertionSort;
import com.tatar.algorithmrtc.algorithm.sortingalgorithm.MergeSort;
import com.tatar.algorithmrtc.inputhelper.InputGenerator;
import com.tatar.algorithmrtc.inputhelper.RandomGenerator;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        RandomGenerator randomGenerator = new RandomGenerator(random);
        InputGenerator inputGenerator = new InputGenerator(randomGenerator);

        Algorithm mergeSort = new MergeSort();
        Algorithm insertionSort = new InsertionSort();

        int[] inputArr = inputGenerator.getRandomIntegerArray(10, 50, 0);

        for (int anInputArr : inputArr) {
            System.out.println(anInputArr);
        }

        System.out.println("*******");
        insertionSort.perform(inputArr);

        for (int anInputArr : inputArr) {
            System.out.println(anInputArr);
        }
    }
}
