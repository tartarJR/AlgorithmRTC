package com.tatar.algorithmrtc.di.modules;

import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;
import java.util.Random;

@Module
public class RandomModule {

    @Provides
    @Singleton
    public Random random() {
        return new Random();
    }

}
