package com.tatar.algorithmrtc.di.modules;

import com.tatar.algorithmrtc.rtc.RunTimeCalculator;
import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;

@Module
public class RunTimeCalculatorModule {

    @Provides
    @Singleton
    public RunTimeCalculator runTimeCalculator() {
        return new RunTimeCalculator();
    }

}
