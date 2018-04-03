package com.tatar.algorithmrtc.sortingalgorithm;

public class InsertionSort extends SortingAlgorithm {
    @Override
    public void sort(int[] inputArr) {
        int n = inputArr.length;
        for (int j = 1; j < n; j++) {
            int key = inputArr[j];
            int i = j - 1;
            while ((i > -1) && (inputArr[i] > key)) {
                inputArr[i + 1] = inputArr[i];
                i--;
            }
            inputArr[i + 1] = key;
        }
    }
}
