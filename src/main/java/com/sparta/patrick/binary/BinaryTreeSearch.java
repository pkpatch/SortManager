package com.sparta.patrick.binary;

public class BinaryTreeSearch {

    public BinaryNode findElement(int value, BinaryNode binaryNodes){

            BinaryNode positionNode = binaryNodes;
            while(positionNode.getValue() != value){
                if(positionNode.getValue() > value && positionNode.leftChild!=null){
                    positionNode = positionNode.getLeftChild();
                }else if(positionNode.getValue() < value && positionNode.rightChild != null){
                   positionNode = positionNode.getRightChild();
                }
                else{
                    return null;
                }
            }
        return positionNode;

    }


}
