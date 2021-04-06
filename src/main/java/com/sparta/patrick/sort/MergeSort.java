package com.sparta.patrick.sort;

import com.sparta.patrick.sortInterface.Sorter;

public class MergeSort implements Sorter {

    public int[] sortArray(int[] arrayToSort) {
        int arrayLength = arrayToSort.length;                                   //Get length of Array Parameter
        int splitArrayLength = arrayLength / 2;                                 //Get length for split arrays
        int[] leftArray = new int[splitArrayLength];                            //Create Array the length of half arrayToSort
        int[] rightArray = new int[splitArrayLength];
        int[] sortedArray;                                                      //Create Array to store sorted arrays
        int j = 0;                                                              //An index to iterate through right array


        if (arrayLength % 2 == 1) {                                             //Check if number of array is odd or even - get correct array size due to int round down by default
            splitArrayLength++;                                                 //safeguard against 3 / 2 = 1 by adding 1 to the length of the left array
            leftArray = new int[splitArrayLength];
        }




        for (int i = 0; i < splitArrayLength; i++) {                            //Enhanced For Loop to split array in half
            leftArray[i] = arrayToSort[i];
        }
        for (int i = splitArrayLength; i < arrayToSort.length; i++) {           //i starts mid-array - iterates and copys the second half
            rightArray[j] = arrayToSort[i];
            j++;
        }




        if (leftArray.length > 1) {                                             //If the split array has more than one element - the method will call itself to split the array
            leftArray = sortArray(leftArray);
        }
        if (rightArray.length > 1) {
            rightArray = sortArray(rightArray);
        }




        sortedArray = merge(leftArray, rightArray);

        return sortedArray;

    }

    private int[] merge(int[] splitArrayLeft, int[] splitArrayRight) {

        int arrayLeftPos = 0;
        int arrayRightPos = 0;

        int firstLength = splitArrayLeft.length;
        int secondLength = splitArrayRight.length;
        int[] array = new int[firstLength + secondLength];

        for (int i = 0; i < array.length; i++) {
            int a = splitArrayLeft[arrayLeftPos];
            int b = splitArrayRight[arrayRightPos];
            if (a < b) {
                array[i] = a;

                if (arrayLeftPos == splitArrayLeft.length - 1) {                //Avoid Index out of bounds
                    while (arrayRightPos != splitArrayRight.length ) {
                        i++;
                        array[i] = splitArrayRight[arrayRightPos];
                        arrayRightPos++;
                    }
                } else {
                    arrayLeftPos++;
                }

            } else {
                array[i] = b;

                if (arrayRightPos == splitArrayRight.length - 1) {
                    while (arrayLeftPos != splitArrayLeft.length ) {
                        i++;
                        array[i] = splitArrayLeft[arrayLeftPos];
                        arrayLeftPos++;
                    }
                } else {
                    arrayRightPos++;
                }

            }
        }
        return array;
    }

}
