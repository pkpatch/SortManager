package com.sparta.patrick.utils;

public class Time {

    public static void timer(Long start, Long finish) {
        long time = finish - start;
        double timeSeconds = (double) time / 1000000000;
        Printer.printMessage("The sort took: " + timeSeconds + " seconds");
        Printer.printMessage("");
    }


}
