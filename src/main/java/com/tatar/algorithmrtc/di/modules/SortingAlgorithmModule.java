package com.tatar.algorithmrtc.di.modules;

import com.tatar.algorithmrtc.di.annotations.InsertionSort;
import com.tatar.algorithmrtc.di.annotations.MergeSort;
import com.tatar.algorithmrtc.sortingalgorithm.SortingAlgorithm;
import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;

@Module
public class SortingAlgorithmModule {

    @Provides
    @MergeSort
    @Singleton
    public SortingAlgorithm mergeSort() {
        return new com.tatar.algorithmrtc.sortingalgorithm.MergeSort();
    }

    @Provides
    @InsertionSort
    @Singleton
    public SortingAlgorithm insertionSort() {
        return new com.tatar.algorithmrtc.sortingalgorithm.InsertionSort();
    }

}
