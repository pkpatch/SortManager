package com.sparta.patrick.binary;

public class BinaryTreeSortDesc {
    int i= 0;
    public int[] sortDesc(BinaryNode binaryNode, int[] numbers) {

        BinaryNode positionNode = binaryNode;
        int[] binarySortedArray = numbers;


        if(positionNode.rightChild != null){
            sortDesc(positionNode.getRightChild(), numbers);
            binarySortedArray[i] = positionNode.getValue();
            i++;
        }else{
            binarySortedArray[i] = positionNode.getValue();
            i++;
        }

        if(positionNode.leftChild != null){
            sortDesc(positionNode.getLeftChild(),numbers);
        }

        return binarySortedArray;
    }
}
