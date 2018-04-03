package com.tatar.algorithmrtc.algorithm.sortingalgorithm;

public class MergeSort extends SortingAlgorithm {

    private int[] array;
    private int[] temporaryMergeArray;

    @Override
    public void sort(int[] inputArr) {
        this.array = inputArr;
        this.temporaryMergeArray = new int[inputArr.length];
        divide(0, inputArr.length - 1);
    }

    private void divide(int left, int right) {
        if (left < right) {
            int middle = left + (right - left) / 2;

            divide(left, middle);
            divide(middle + 1, right);
            merge(left, middle, right);
        }
    }

    private void merge(int left, int middle, int right) {
        System.arraycopy(array, left, temporaryMergeArray, left, right + 1 - left);

        int i = left;
        int j = middle + 1;
        int k = left;

        while (i <= middle && j <= right) {
            if (temporaryMergeArray[i] <= temporaryMergeArray[j]) {
                array[k] = temporaryMergeArray[i];
                i++;
            } else {
                array[k] = temporaryMergeArray[j];
                j++;
            }

            k++;
        }

        while (i <= middle) {
            array[k] = temporaryMergeArray[i];
            k++;
            i++;
        }
    }
}
