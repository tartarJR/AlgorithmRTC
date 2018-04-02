package com.tatar.algorithmrtc.algorithm.sortingalgorithm;

public class MergeSort extends SortingAlgorithm {


    @Override
    public void perform(int[] inputArr) {
        divideAndConquer(inputArr);
    }

    private void divideAndConquer(int[] inputArray) {
        int n = inputArray.length;
        if (n == 1) {
            return;
        }
        int mid = n / 2;
        int[] leftArray = new int[mid];
        int[] rightArray = new int[n - mid];
        System.arraycopy(inputArray, 0, leftArray, 0, leftArray.length);
        System.arraycopy(inputArray, leftArray.length, rightArray, 0, rightArray.length);
        divideAndConquer(leftArray);
        divideAndConquer(rightArray);
        merge(leftArray, rightArray, inputArray);
    }

    private void merge(int[] leftArray, int[] rightArray, int[] sortedArray) {
        int leftArrayLength = leftArray.length;
        int rightArrayLength = rightArray.length;
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < leftArrayLength && j < rightArrayLength) {
            if (leftArray[i] < rightArray[j]) {
                sortedArray[k] = leftArray[i];
                i++;
            } else {
                sortedArray[k] = rightArray[j];
                j++;
            }
            k++;
        }
        //copy the rest of the first half if there is anything left
        while (i < leftArrayLength) {
            sortedArray[k] = leftArray[i];
            i++;
            k++;
        }
        //copy the rest of the second half if there is anything left
        while (j < rightArrayLength) {
            sortedArray[k] = rightArray[j];
            j++;
            k++;
        }
    }
}
