package com.sparta.patrick.factory;

import com.sparta.patrick.sort.BinarySort;
import com.sparta.patrick.sort.BubbleSort;
import com.sparta.patrick.sort.MergeSort;
import com.sparta.patrick.sort.Sort;
import com.sparta.patrick.start.Main;
import com.sparta.patrick.start.Starter;
import com.sparta.patrick.utils.Data;
import com.sparta.patrick.utils.Printer;
import com.sparta.patrick.utils.Time;

import java.util.Scanner;

import static com.sparta.patrick.sort.Sort.Bubble;

public class SortFactory {
    Starter starter = new Starter();

    public void getSort(Sort sortType){

        int size = 100;
        int[] numbers;
        long start, finish;

        switch (sortType) {
            case Bubble:
                numbers = Data.randomNumbers(size);
                Printer.printMessage("Unsorted Array: ");
                Printer.printArray(numbers);
                Printer.printMessage("Bubble Sorted Array: ");
                BubbleSort bubbleSort = new BubbleSort();

                start = System.nanoTime();
                numbers = bubbleSort.sortArray(numbers);
                finish = System.nanoTime();
                Printer.printArray(numbers);
                Time.timer(start, finish);

                starter.start();
                break;

            case Merge:
                numbers = Data.randomNumbers(size);
                Printer.printMessage("Unsorted Array: ");
                Printer.printArray(numbers);
                Printer.printMessage("Merge Sorted Array: ");
                MergeSort mergeSort = new MergeSort();

                start = System.nanoTime();
                numbers = mergeSort.sortArray(numbers);
                finish = System.nanoTime();
                Printer.printArray(numbers);
                Time.timer(start, finish);

                starter.start();
                break;

            case Binary:

                int[] array = {40,17,53,33,58,11,46,88,21,62,56,31,8,59,42,61,29,57,60,13,63,28,37,54,5,64,43,16,25,68,9,81,72,23,76,30,83,1,85,41,19,84,36,74,10,91,48,87,26,51,80,93,3,89,86,94,14,78,52,95,96,22,98,50,99,47,92,82,90,70,20,39,67,34,6,71,18,79,44,7,69,66,24,55,27,65,4,75,45,32,38,15,73,49,35,77,12,};
                Printer.printMessage("Unsorted Array: ");
                Printer.printArray(array);

                Printer.printMessage("Binary Tree Conversion: ");
                BinarySort binarySort = new BinarySort();

                start = System.nanoTime();
                binarySort.addElements(array);
                finish = System.nanoTime();
                Time.timer(start, finish);

                Printer.printMessage("Binary Sort Ascending: ");
                start = System.nanoTime();
                Printer.printArray(binarySort.getSortedTreeAsc());
                finish = System.nanoTime();
                Time.timer(start, finish);

                Printer.printMessage("Binary Sort Descending: ");
                start = System.nanoTime();
                Printer.printArray(binarySort.getSortedTreeDesc());
                finish = System.nanoTime();
                Time.timer(start, finish);

                starter.start();
                break;
            case Performance:

                for (int i = 100; i < 10001; i *= 10) {
                    numbers = Data.randomNumbers(i);
                    Printer.printMessage(i + " numbers being sorted by Bubble Sort: ");
                    bubbleSort = new BubbleSort();

                    start = System.nanoTime();
                    bubbleSort.sortArray(numbers);
                    finish = System.nanoTime();
                    Time.timer(start, finish);


                    Printer.printMessage(i + " numbers being sorted by Merge Sort: ");
                    mergeSort = new MergeSort();

                    start = System.nanoTime();
                    mergeSort.sortArray(numbers);
                    finish = System.nanoTime();
                    Time.timer(start, finish);

                    Printer.printMessage("----------------------------");
                }

                starter.start();
                break;
            case Exit:
                Printer.printMessage("Thank you and Goodbye");
                System.exit(0);

        }

    }
}
