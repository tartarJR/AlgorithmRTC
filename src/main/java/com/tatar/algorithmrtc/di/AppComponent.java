package com.tatar.algorithmrtc.di;

import com.tatar.algorithmrtc.di.annotations.InsertionSort;
import com.tatar.algorithmrtc.di.annotations.MergeSort;
import com.tatar.algorithmrtc.di.modules.RandomGeneratorModule;
import com.tatar.algorithmrtc.di.modules.RandomModule;
import com.tatar.algorithmrtc.di.modules.SortingAlgorithmModule;
import com.tatar.algorithmrtc.inputhelper.InputGenerator;
import com.tatar.algorithmrtc.sortingalgorithm.SortingAlgorithm;
import dagger.Component;

import javax.inject.Singleton;

@Component(modules = {RandomModule.class, RandomGeneratorModule.class, SortingAlgorithmModule.class})
@Singleton
public interface AppComponent {
    InputGenerator getInputGenerator();

    @MergeSort
    SortingAlgorithm getMergeSortAlgorithm();

    @InsertionSort
    SortingAlgorithm getInsertionSortAlgorithm();
}
