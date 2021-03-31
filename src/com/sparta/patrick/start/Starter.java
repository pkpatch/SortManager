package com.sparta.patrick.start;

import com.sparta.patrick.sort.BubbleSort;
import com.sparta.patrick.sort.MergeSort;
import com.sparta.patrick.utils.Printer;
import com.sun.source.tree.BinaryTree;

import java.util.Scanner;

public class Starter {
    public void start() {

        int[] numbers = new int[10];
        int number = 0;
        int i = 0;

        Scanner scanner = new Scanner(System.in);
        Printer.printMessage("Please enter 10 numbers: ");
        
        while(i < 10){

            number = scanner.nextInt();
            numbers[i] = number;
            i++;

        }
        Printer.printMessage("Here is the array of integers you have entered: " );
        Printer.printArray(numbers);

        Printer.printMessage("Which sorting method would you like to choose? ");
        i = scanner.nextInt();

        switch (i){
            case 1:
                BubbleSort bubbleSort = new BubbleSort();
                Printer.printArray(bubbleSort.sortArray(numbers));
                break;
            case 2:
                MergeSort mergeSort = new MergeSort();
                Printer.printArray(mergeSort.sortArray(numbers));
                break;
            /*case 3:
                BinaryTreeSort binaryTreeSort = new BinaryTreeSort();
                Printer.printArray(binaryTreeSort.sortArray(numbers));
                break;*/
            default:
                Printer.printMessage("Incorrect input. GoodBye");
        }



        


        //



    }
}
