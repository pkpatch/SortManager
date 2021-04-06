package com.sparta.patrick.start;

import com.sparta.patrick.exception.ChildNotFoundException;
import com.sparta.patrick.factory.SortFactory;
import com.sparta.patrick.sort.*;
import com.sparta.patrick.utils.Data;
import com.sparta.patrick.utils.Printer;
import com.sparta.patrick.utils.Time;

import java.util.Scanner;

public class Starter {

    public void start() {
        Scanner scanner = new Scanner(System.in);
        SortFactory sortFactory;
        int count=0;

        Printer.printMessage("Which sorting method would you like to choose? ");

        Printer.printMessage("1. Bubble Sort \n2. Merge Sort \n3. Binary Sort \n4. Performance Data for Bubble Sort and Merge Sort \n5. Exit");

        try{
            count = scanner.nextInt();
        }catch (Exception e){
            Printer.printMessage("Please enter a valid input." + e.getMessage());
            start();
        }

        switch (count){
            case 1:
                sortFactory = new SortFactory();
                sortFactory.getSort(Sort.Bubble);
                break;
            case 2:
                sortFactory = new SortFactory();
                sortFactory.getSort(Sort.Merge);
                break;
            case 3:
                sortFactory = new SortFactory();
                sortFactory.getSort(Sort.Binary);
                break;
            case 4:
                sortFactory = new SortFactory();
                sortFactory.getSort(Sort.Performance);
            case 5:
                sortFactory = new SortFactory();
                sortFactory.getSort(Sort.Exit);

        }


    }
}
