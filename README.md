# 401 Code Challenges Table of Contents

1. [Code Challenge 1: Reverse Array](#Reverse-an-Array)
2. [Code Challenge 2: Array Shift](#Array-Shift)
3. [Code Challenge 3: Binary Search](#Binary-Search)

## Reverse an Array

- Write a function called ```reverseArray``` which takes an array as an argument. Without utilizing any of the built-in methods available to your language, return an array with elements in reversed order.

### Challenge Description

- Be able to take an array as our input and reverse order the contents of the array as the output
- Ex. Input: [1, 2, 3, 4, 5, 6] -> Output: [6, 5, 4, 3, 2, 1]

### Approach & Efficiency

- Google searched methods of reversing arrays in Java and then reserve engineered the method to better understand.

### Solution

![Whiteboard for Code Challenge 1](assets/CC1WhiteBoard.png)

__________________________________________________________________________________

## Array Shift

- Write a function called ```insertShiftArray``` which takes in an array and the value to be added. Without utilizing any of the built-in methods available to your language, return an array with the new value added at the middle index.

### Challenge Description 2

- Be able to take an array and value as our parameters and place the value in the middle of the input array to create a whole new array
- Ex. Input: [2, 4, 6, 8,], 5 -> Output: [2, 4, 5, 6, 8]

### Approach & Efficiency 2

- The first approach was to write everything down on the whiteboard to gain a better understanding of our problem domain, get a better understanding by creating a visual and using that visual to create our alogrithm for the problem.

- Space: O(n)
- Time: O(n)

### Solution 2

![Whiteboard for Code Challenge 2](assets/arrayShiftWhiteboard.PNG)

__________________________________________________________________________________

## Binary Search

- Write a function called ```BinarySearch``` which takes in 2 parameters: a sorted array and the search key. Without utilizing any of the built-in methods available to your language, return the index of the array’s element that is equal to the search key, or -1 if the element does not exist.

### Challenge Description 3

- Be able to take an sorted array and value as our paramters and iterate through array to find element that matches key value and return the key's index. If key value doesn't exist in array, then return -1.
- Ex. Input: [4, 8, 15, 16, 23, 42], 15 -> Ouput: 2

### Approach & Efficiency 3

- Take an sorted array, define first, last and middle index. Iterate through a while loop to find middle value of array. Short array search by half each time and define new first and last of array. If sorted array at the mid index equals the key value, then return mid index. If key value does not exist, return -1.

- Space: O(1)
- Time: O(1)

### Solution 3

![Whiteboard for Code Challenge 3](assets/CC3Whiteboard.PNG)

__________________________________________________________________________________

## Resources

- [Method to reverse arrays](https://www.geeksforgeeks.org/reverse-an-array-in-java/)
- Assistance from Bade on CC1 with structuring my function

- [Method to round our index integer up](https://www.tutorialspoint.com/java/lang/math_ceil.htm)

- [Binary Search Method](https://www.javatpoint.com/binary-search-in-java)

__________________________________________________________________________________

## Code Challenges

## Code Challeneges Resources

- I got some advice and assistance from Tif Taylor on Code Challenge 5 Problem #4.
