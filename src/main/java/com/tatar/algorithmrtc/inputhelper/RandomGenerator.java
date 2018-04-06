package com.tatar.algorithmrtc.inputhelper;

import javax.inject.Inject;
import java.util.Random;

public class RandomGenerator {

    private Random random;

    @Inject
    public RandomGenerator(Random random) {
        this.random = random;
    }

    public int generateRandomInteger(int max, int min) {
        return random.nextInt((max - min) + 1) + min;
    }
}
