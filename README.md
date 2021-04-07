
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
<details open="open">
  <summary><h2 style="display: inline-block">Table of Contents</h2></summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
      <ul>
        <li><a href="#built-with">Built With</a></li>
      </ul>
    <li><a href="#Sorting Algorithms">Sorting Algorithms</a></li>
    <li><a href="#license">License</a></li>
    <li><a href="#contact">Contact</a></li>
  </ol>
</details>



<!-- ABOUT THE PROJECT -->
## About The Project


### Built With

* IntelliJ IDEA 2020.3.2


<!-- Sorting Algorithms -->
##Sorting Algorithms

 Bubble Sort:
 One of the simplest algorithms yet one of the most time consuming. Moving through the collection of numbers, comparing one after the other, swapping as you go.

 How it works:
 E.g. 
 - int[] array = {3,4,2}
 - compare is 3 > 4 = false
 - compare is 4 > 2 = true - so swap their positions
 - int[] array = {3,2,4}
 - compare is 3 > 2 = true - so swap their positions
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
 
 Merge sort:
 
 How it works:
 
 My approach:
 
 Unsorted Array to Binary Tree:
 
 How it works:
 
 My approach:
 
 Binary Tree to Sorted Array:
 
 How it works:
 
 My approach:
 
 Performance:
 
 ##Issues



<!-- LICENSE -->
## License

Distributed under the MIT License. See `LICENSE` for more information.



<!-- CONTACT -->
## Contact

Patrick Walsh - www.linkedin.com/in/patrick-walsh-jsdet - pwalsh@spartaglobal.com

Project Link: [https://github.com/pkpatch/SortManager](https://github.com/pkpatch/SortManager)


