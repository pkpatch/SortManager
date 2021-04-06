package com.sparta.patrick.utils;

public class Printer {

    public static void printArray(int[] numbers) {
        for (int number : numbers) {
            System.out.print(number + ", ");
        }
        System.out.println();
    }

    public static void printMessage(String string) {
        System.out.println(string);
    }

    public static void printInt(int value) {
        System.out.println(value);
    }

    public static void printDouble(double time) {
        System.out.println(time);
    }
}
