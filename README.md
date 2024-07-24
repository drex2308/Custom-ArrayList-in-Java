# MyArray Program

## Overview

This repository contains my implementation of the `MyArray` class. The primary goal of this project was to review the basic concepts and limitations of arrays and reinforce Object-Oriented Programming (OOP) principles.

## Description

In this project, I implemented a Java class `MyArray` using a `String[]` array as its underlying data structure to store and manipulate words. The class includes various methods to handle common array operations while maintaining the integrity of the array.

## Features

- **Constructors**:
  - `MyArray()`: Initializes the array with a default capacity of 10.
  - `MyArray(int initialCapacity)`: Initializes the array with a specified capacity.

- **Methods**:
  - `void add(String text)`: Adds a new word to the array, doubling the array's length if necessary.
  - `boolean search(String key)`: Searches for a word in the array.
  - `int size()`: Returns the number of elements in the array.
  - `int getCapacity()`: Returns the current capacity of the array.
  - `void display()`: Displays all words in the array.
  - `void removeDups()`: Removes duplicate words from the array.

## Implementation Details

To deepen my understanding of data structures, I implemented this project with specific constraints and rules:

- **No Java Collections Framework**: I avoided using any classes from the Java Collections Framework to manage the array operations manually.
- **Single `String[]` Array**: The implementation relies solely on a single `String[]` array, ensuring efficient memory use and avoiding auxiliary data structures.
- **No Null Values**: The array maintains integrity by preventing null values, ensuring no "holes" in the data structure.
- **Dynamic Array Resizing**: The array automatically doubles in size when its capacity is exceeded, demonstrating dynamic memory allocation techniques.
- **Efficient Duplicate Removal**: The `removeDups()` method eliminates all duplicate entries without using temporary arrays, showcasing efficient data manipulation.
- **Constant Time Size Method**: The `size()` method operates in O(1) time complexity, highlighting efficient algorithm design.
- **No Sorting Algorithms**: The project excludes sorting algorithms to focus on raw array manipulation techniques.
- **Encapsulation with Private Methods**: Private helper methods are utilized to encapsulate complex operations, promoting code readability and maintainability.
- **Case Sensitivity**: The class does not alter the case of strings, allowing flexibility in handling input data.

## Usage

To use the `MyArray` class, you can create an instance and call its methods or run the driver class in the repository.
