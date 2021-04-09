
<h3 align="center">Sort Manager</h3>

  <p align="center">
    Sorting any array of integers with the help of Bubble, Merge and Binary Sort Algorithms
    <br />
    <a href="https://github.com/pkpatch/SortManager"><strong>Explore the docs »</strong></a>
    <br />
    <br />
  </p>
</p>

<!-- TABLE OF CONTENTS -->
  <summary><h2 style="display: inline-block">Table of Contents</h2></summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
      <ul>
        <li><a href="#built-with">Built With</a></li>
      </ul>
    <li><a href="#Sorting Algorithms">Sorting Algorithms</a>
     <ul>
       <li><a href="#bubble-sort">Bubble Sort</a></li>
       <li><a href="#merge-sort">Merge Sort</a></li>
       <li><a href="#unsorted-array-to-binary-tree">Unsorted Array to Binary Tree</a></li>
       <li><a href="#binary-tree-to-sorted-array">Binary Tree to Sorted Array</a></li>
       <li><a href="#performance">Performance</a></li>
      </ul>
     <li><a href="#future-work">Future Work</a></li>
    <li><a href="#license">License</a></li>
    <li><a href="#contact">Contact</a></li>
  </ol>

<!-- ABOUT THE PROJECT -->
## About The Project

This project was challenging in terms of understanding data structures as well as different sorting algorithms. In understanding the sorting process of different algorithms, I was able to competantly recreate Bubble, Merge and Binary sorting programs with a great insight to how they perform under different loads. 

### Built With

* IntelliJ IDEA 2020.3.2
* JDK 11
* Git

<!-- Sorting Algorithms -->
## Sorting Algorithms

 ### Bubble Sort:
 
One of the simplest algorithms yet one of the most time consuming. Moving through the collection of numbers, comparing one after  the other, swapping as you go.

 How it works:
 
 E.g. 
 - int[] array = {3,4,2}
 - Compare is 3 > 4 = false
 - Compare is 4 > 2 = true - so swap their positions
 - int[] array = {3,2,4}
 - Compare is 3 > 2 = true - so swap their positions
 - int[] array = {2,3,4}
 - array is now in order

 My approach:
 
 - First Loop acts as counter as the sort process requires multiple iterations
 - Second Loop iterates through the array.
 - If the number to the left is bigger than the right {3,2} - 3 is bigger than 2
 - To avoid over writing the value, the number on the right will be assigned to a variable temporarily e.g {3,2} -> temp=2
 - The value on the right is assign to the value on the left e.g {3,3}
 - The left number is then assign the value of temp {2,3}
 - When both loops are completed - the sorted array is presented
 
 ### Merge sort:
 
 How it works:
 
  E.g. 
 - int[] array = {3,4,2,1}
 - array is split in half until 1 int arrays remain int[] a1 = {3,4} int[] a2 = {2,1}
 - a1 and a2 are split again int[] a11 = {3} int[] a12 = {4} int[] a21 = {2} int[] a22 = {1}
 - a11 and a12 are compared and merged into ascending order a1 = {3,4} 
 - a21 and a22 are compared and merged into ascending order a2 = {1,2} 
 - a1 and a2 are compared and merged into ascending order array = {1,2,3,4} 
 - array is now in order
 
 My approach:
 
 - Enhanced For Loop to split array in half
 - If the split array has more than one element, the method will call itself to split the array recursivley
 - One the elements are split into 1-element arrays, the values will be compared and returned in order up and out of the stack
 
 ### Unsorted Array to Binary Tree:
 
 How it works:
 
 - First element of the unsorted array becomes the root node at the top of the tree. Each element is unique. No duplicates
 - If the next element value is lower than the root element it is placed on the left, if it is greater it is placed on the right.
 - From then the previous step is repeated, each element becomes a node on the tree, position depending on it being less than or greater than each node.
 
 My approach:
 
 - Root Binary Node is create and initialised with the value of the first element of the array
 - The array enter an advanced for loop for the values to be added as nodes on the binary tree.
 - New Binary Node is created with its value corressponding to the element value
 - Binary Node will check if it is greater than or less than the Root Binary Node.
 - The New Binary Node will then check if the child of the Root Binary Node is Null
 - If the Child is Null, The Root Binary Node will call Set Child as the New Binary Node and iterate to the next loop for the next element
 - If the Child is Not Null, SetChildNode Method is called.
 - Position Node is created to track the position, compare elements and check child nodes
 - New Node and Position Node will enter a While 'not sorted' loop and compare Values
 - New Node will check if child is Null.
 - If Null Position Node will SetChild as New Node
 - Else Position Node will assign itself the values and children of the next node and continue comparing values
 
 ### Binary Tree to Sorted Array:
 
 How it works:
 
 - Step 1: Starting at Root Node, 
 - Step 2: Go as far left down the tree, get this value.
 - Step 3: Check if there is a right child:
         - If no Right child, return up the tree to the previous node and get this value repeat step 3.
         - If there is a right child, go to the right and repeat step 2.
 
 My approach:
 
 - Initialize position Node
 - If Position nodes Left child is not null
 - Using Recursion, Method will call itself passing in the Left child as the PositionNode
 - If Position node left child is null, Value of positionNode if enterd into the array. Array position increments
 - If Position nodes Right child is not null
 - Using Recursion, Method will call itself passing in the Right child as the PositionNode
 - The PositionNode has traversed each left and right child in the tree, It will return the sorted array
 
 ### Performance:

There is a forth feature that will randomly generate 100, 1000, 10000 integer arrays. Input each array into the Bubble and Merge Algorithm, Record how much time has elapsed in each Sort and print the results. Merge Sort is often seen as the fastest in term of speed.
 
 ## Future Work
 
 - Logging
 - Unit Testing
 - Users Array Input functionality

<!-- LICENSE -->
## License

Distributed under the MIT License. See `LICENSE` for more information.

<!-- CONTACT -->
## Contact

Patrick Walsh - www.linkedin.com/in/patrick-walsh-jsdet - pwalsh@spartaglobal.com

Project Link: [https://github.com/pkpatch/SortManager](https://github.com/pkpatch/SortManager)


