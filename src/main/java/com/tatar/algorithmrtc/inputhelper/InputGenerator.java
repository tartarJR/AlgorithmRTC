package com.tatar.algorithmrtc.inputhelper;

public class InputGenerator {

    private RandomGenerator randomGenerator;

    public InputGenerator(RandomGenerator randomGenerator) {
        this.randomGenerator = randomGenerator;
    }

    public int[] getRandomIntegerArray(int inputLength, int maxRange, int minRange) {
        int[] randomIntArray = new int[inputLength];

        for (int i = 0; i < inputLength; i++) {
            randomIntArray[i] = randomGenerator.generateRandomInteger(maxRange, minRange);
        }

        return randomIntArray;
    }
}
