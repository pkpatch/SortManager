package com.sparta.patrick.binary;

public class BinaryTreeSetUp {

    public BinaryNode setUpTree(int[] array) {

        BinaryNode rootBinaryNode = new BinaryNode(array[0]);
        BinaryNode positionNode = rootBinaryNode;
        boolean sorted = false;
        int element;

        for (int i = 1; i < array.length; i++) {
            sorted = false;
            positionNode = rootBinaryNode;
            element = array[i];
            BinaryNode newNode = new BinaryNode(element);
            if (element < rootBinaryNode.getValue()) {
                if (rootBinaryNode.leftChild == null) {
                    rootBinaryNode.setLeftChild(newNode);
                } else {
                    SetChildNode(element, positionNode, sorted, newNode);
                }
            } else {
                if (rootBinaryNode.rightChild == null) {
                    rootBinaryNode.setRightChild(newNode);
                } else {
                    SetChildNode(element, positionNode, sorted, newNode);
                }
            }
        }
        return rootBinaryNode;
    }

    public BinaryNode addElementToBinaryTree(int element, BinaryNode binaryNode) {
        boolean sorted = false;

        BinaryNode newNode = new BinaryNode(element);
        if (element < binaryNode.getValue()) {
            if (binaryNode.leftChild == null) {
                binaryNode.setLeftChild(newNode);
            } else {
                SetChildNode(element, binaryNode, sorted, newNode);
            }
        } else {
            if (binaryNode.rightChild == null) {
                binaryNode.setRightChild(newNode);
            } else {
                SetChildNode(element, binaryNode, sorted, newNode);
            }
        }
        return binaryNode;

    }

    private void SetChildNode(int element, BinaryNode positionNode, boolean sorted, BinaryNode newNode) {
        while (!sorted) {
            if (element < positionNode.getValue()) {
                if (positionNode.leftChild == null) {
                    positionNode.setLeftChild(newNode);
                    sorted = true;

                } else {
                    positionNode = positionNode.getLeftChild();
                }
            } else {
                if (positionNode.rightChild == null) {
                    positionNode.setRightChild(newNode);
                    sorted = true;

                } else {
                    positionNode = positionNode.getRightChild();
                }
            }
        }
    }
}

