package com.sparta.patrick.utils;

import java.util.Random;

public class Data {
    public static int[] randomNumbers(int size) {
        Random random = new Random();

        int[] numbers = new int[size];

        for (int count = 0; count < numbers.length; count++) {
            numbers[count] = random.nextInt(200);
        }

        return numbers;
    }

}
