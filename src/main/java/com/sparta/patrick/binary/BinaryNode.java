package com.sparta.patrick.binary;

public class BinaryNode {

        int value;
        BinaryNode leftChild;
        BinaryNode rightChild;

        public BinaryNode(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public BinaryNode getLeftChild() {
            return leftChild;
        }

        public void setLeftChild(BinaryNode leftChild) {
            this.leftChild = leftChild;
        }

        public BinaryNode getRightChild() {
            return rightChild;
        }

        public void setRightChild(BinaryNode rightChild) {
            this.rightChild = rightChild;
        }

    }
