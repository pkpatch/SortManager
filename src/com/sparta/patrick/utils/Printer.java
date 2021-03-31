package com.sparta.patrick.utils;

public class Printer {

    public static void printArray(int[] numbers) {
        for (int number : numbers) {
            System.out.print(number + ", " );
        }
    }

    public static void printMessage(String string) {
        System.out.println(string);
    }
}
