package com.sparta.patrick.sort;

import com.sparta.patrick.binary.*;
import com.sparta.patrick.exception.ChildNotFoundException;
import com.sparta.patrick.sortInterface.BinaryTree;
import com.sparta.patrick.utils.Printer;

public class BinarySort implements BinaryTree {

    BinaryNode binaryNodes;
    BinaryTreeSortAsc binaryTreeSortAsc = new BinaryTreeSortAsc();
    BinaryTreeSortDesc binaryTreeSortDesc = new BinaryTreeSortDesc();
    int[] array;
    BinaryTreeSetUp binaryTreeSetUp = new BinaryTreeSetUp();
    BinaryTreeSearch binaryTreeSearch = new BinaryTreeSearch();

    @Override
    public int getRootElement() {
        Printer.printMessage("Root element is: ");
        return binaryNodes.getValue();
    }

    @Override
    public int getNumberOfElements() {
        Printer.printMessage("Number of elements: ");
        return array.length;
    }

    @Override
    public void addElement(int element) {
        int length = array.length;
        int [] newArray = new int[length + 1];
        array[0] = element;
        System.arraycopy(array, 0, newArray, 1, length + 1 - 1);
        array = newArray;
        binaryNodes = binaryTreeSetUp.addElementToBinaryTree(element, binaryNodes);
        Printer.printMessage(element + " Was added");
    }

    @Override
    public void addElements(int[] elements) {
        this.array = elements;
        binaryNodes = binaryTreeSetUp.setUpTree(array);
    }

    @Override
    public boolean findElement(int value) {
        BinaryNode foundBinaryNode = binaryTreeSearch.findElement(value, binaryNodes);
        return foundBinaryNode != null;
    }

    @Override
    public int getLeftChild(int element) throws ChildNotFoundException {
        BinaryNode foundBinaryNode = binaryTreeSearch.findElement(element, binaryNodes);
        if(foundBinaryNode == null){
            throw new ChildNotFoundException("Child not found");
        }else{
            return foundBinaryNode.getLeftChild().getValue();
        }
    }

    @Override
    public int getRightChild(int element) throws ChildNotFoundException {
        BinaryNode foundBinaryNode = binaryTreeSearch.findElement(element, binaryNodes);
        if(foundBinaryNode == null){
            throw new ChildNotFoundException("Child not found");
        }else{
            return foundBinaryNode.getRightChild().getValue();
        }
    }

    @Override
    public int[] getSortedTreeAsc() {
        return binaryTreeSortAsc.sortAsc(binaryTreeSetUp.setUpTree(array), array);
    }

    @Override
    public int[] getSortedTreeDesc() {
        return binaryTreeSortDesc.sortDesc(binaryTreeSetUp.setUpTree(array), array);


    }
}