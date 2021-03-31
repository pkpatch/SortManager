package com.sparta.patrick.sort;

import com.sparta.patrick.sortInterface.Sorter;

public class BubbleSort implements Sorter {
    

    public int[] sortArray(int[] numbers) {

        for (int i = 0; i < numbers.length - 1; i++) {      //First Loop acts as counter as the sort process requires multiple iterations
            for (int j = 0; j < numbers.length - 1; j++) {  //Second Loop iterates through the array.
                if (numbers[j] > numbers[j+1]) {            //If the number to the left is bigger than the right {3,2} - 3 is bigger than 2
                    int temp = numbers[j+1];                //to avoid over writing the value, the number on the right will be assigned to a variable temporarily e.g {3,2} -> temp=2
                    numbers[j+1] = numbers[j];              //the value on the right is assign to the value on the left e.g {3,3}
                    numbers[j] = temp;                      //the left number is then assign the value of temp {2,3}
                }
            }

        }
        return numbers;                                     //when both loops are completed - the sorted array is presented
    }

}
