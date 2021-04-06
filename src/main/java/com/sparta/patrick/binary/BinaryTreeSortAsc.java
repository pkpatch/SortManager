package com.sparta.patrick.binary;

public class BinaryTreeSortAsc {
    int i=0;
    public int[] sortAsc(BinaryNode binaryNode, int[] numbers) {

        BinaryNode positionNode = binaryNode;
        int[] binarySortedArray = numbers;


        if(positionNode.leftChild != null){
            sortAsc(positionNode.getLeftChild(), numbers);
        }
        binarySortedArray[i] = positionNode.getValue();
        i++;

        if(positionNode.rightChild != null){
            sortAsc(positionNode.getRightChild(),numbers);
        }

        return binarySortedArray;
    }

}