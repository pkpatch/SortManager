package com.sparta.patrick;

import com.sparta.patrick.utils.Printer;

public class BubbleSort {

    int place = 0;                                          //values to identify place in array
    int nextPlace = 1;

    public void sort(int[] numbers) {

        for (int i = 0; i < numbers.length - 1; i++) {      //First Loop acts as counter as the sort process requires multiple iterations
            for (int j = 0; j < numbers.length - 1; j++) {  //Second Loop iterates through the array.
                if (numbers[place] > numbers[nextPlace]) {  //If the number to the left is bigger than the right {3,2} - 3 is bigger than 2
                    int temp = numbers[nextPlace];          //to avoid over writing the value, the number on the right will be assigned to a variable temporarily e.g {3,2} -> temp=2
                    numbers[nextPlace] = numbers[place];    //the value on the right is assign to the value on the left e.g {3,3}
                    numbers[place] = temp;                  //the left number is then assign the value of temp {2,3}
                }
                place++;                                    //place variables increased by 1 so the next loop can compare the next values
                nextPlace++;
            }
            place = 0;                                      //Once the inner loop has completed - place values are reset for the next loop
            nextPlace = 1;
        }
        Printer.printArray(numbers);                        //when both loops are completed - the sorted array is presented
    }


}
