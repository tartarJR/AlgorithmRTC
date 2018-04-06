package com.tatar.algorithmrtc.di.modules;

import com.tatar.algorithmrtc.inputhelper.RandomGenerator;
import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;
import java.util.Random;

@Module(includes = {RandomModule.class})
public class RandomGeneratorModule {

    @Provides
    @Singleton
    public RandomGenerator randomGenerator(Random random) {
        return new RandomGenerator(random);
    }

}
