# Algorithms and Data Structures

Open Repository For Programmers to Contribute Algorithms and Data Structures in different Languages and for beginners who want to know about Algorithms and Data Structures.

## Currently Supported Languages

* [BASH](BASH/README.md)
* [C++](C++/README.md)
* [C](C/README.md)
* [Java](Java/README.md)
* [JavaScript](JavaScript/README.md)
* [Kotlin](Kotlin/README.md)
* [NodeJS-ES6](NodeJS-ES6/README.md)
* [PHP](PHP/README.md)
* [Python3](Python3/README.md)
* [Q#](QSharp/README.md)
* More Languages welcome

## Documentation

For documentation see wiki [wiki](docs/wiki.md) or [online wiki](https://github.com/GauravWalia19/Algorithms-and-Data-Structures/wiki)

* SORTING ALGORITHMS  
  * [BUBBLE SORT](docs/bubble-sort.md)
  * [SELECTION SORT](docs/selection-sort.md)
  * [INSERTION SORT](docs/insertion-sort.md)

## ORDER OF COMPLEXITY

### :rocket: SORTING

 SNo. | Algorithm | Order of complexity O(n) | Type of Complexity | Stable/Unstable Sort | In Place Algorithm | Space Complexity | Recursive | Iterative
 ---- | --------- | ------------------------ | ------------------ | -------------------- | ------------------ | ---------------- | --------- | ---------
 1 | Bubble Sort | O(n^2) | Quadratic | Stable / Can be Unstable** | :heavy_check_mark: | O(1) | :heavy_multiplication_x: |  :heavy_check_mark:
 2 | Selection Sort | O(n^2) | Quadratic | Unstable | :heavy_check_mark: | O(1) | :heavy_multiplication_x: |  :heavy_check_mark:
 3 | Insertion Sort | O(n^2) | Quadratic | Stable | :heavy_check_mark: | O(1) | :heavy_multiplication_x: |  :heavy_check_mark:
 4 | Shell Sort | O(n^2) or better | Quadratic or other | Unstable | :heavy_check_mark: |
 5 | Merge Sort | O(n logn) | Logarithmic  | Stable | :heavy_multiplication_x: |
 6 | Quick Sort | O(n logn) | Logarithmic | Unstable | :heavy_check_mark: |
 7 | Counting Sort | O(n) | Linear | Stable / Unstable | :heavy_multiplication_x: |
 8 | Radix Sort | O(n) or slower than O(nlogn)  | Linear / Logarithmic | Stable | Can Be |

**Not an efficient Way

### :rocket: SEARCHING

 SNo. | Algorithm | Order of complexity O(n) | Type of Complexity | Recursive | Iterative
 ---- | --------- | ------------------------ | ------------------ | --------- | ---------
 1 | Linear Search | O(n) | Linear | :heavy_multiplication_x: | :heavy_check_mark:
 2 | Binary Search | O(log n) | Logarithmic | :heavy_multiplication_x: | :heavy_check_mark:

### :rocket: DATA STRUCTURES

#### :octocat: ARRAYS

##### 1D ARRAY

 SNo. | Operations | Order of complexity O(n) | Type of Complexity
 ---- | ---------- | ------------------------ | ------------------
 1 | Use value by indexes | O(1) | Constant
 2 | Insertion at beginning | O(n) | Linear
 3 | Deletion at beginning | O(n) | Linear
 4 | Insertion at end (empty array) | O(1) | Constant
 5 | Deletion at end (empty array) | O(1) | Constant
 6 | Deletion of the value without having index | O(n) | Linear  
 7 | Update value without having index | O(n) | Linear
 8 | Update value having index | O(1) | Constant

##### 2D ARRAY

 SNo. | Operations | Order of complexity O(n) | Type of Complexity
 ---- | ---------- | ------------------------ | ------------------
 1 | Use value by indexes | O(1) | Constant
 2 | Insertion at beginning | O(n^2) | Quadratic
 3 | Deletion at beginning | O(n^2) | Quadratic
 4 | Insertion at end (empty array) | O(1) | Constant
 5 | Deletion at end (empty array) | O(1) | Constant
 6 | Deletion of the value without having index | O(n^n) | Quadratic  
 7 | Update value without having index | O(n^2) | Quadratic
 8 | Update value having index | O(1) | Constant

##### 3D ARRAY

 SNo. | Operations | Order of complexity O(n) | Type of Complexity
 ---- | ---------- | ------------------------ | ------------------
 1 | Use value by indexes | O(1) | Constant
 2 | Insertion at beginning | O(n^3) | Cubic
 3 | Deletion at beginning | O(n^3) | Cubic
 4 | Insertion at end (empty array) | O(1) | Constant
 5 | Deletion at end (empty array) | O(1) | Constant
 6 | Deletion of the value without having index | O(n^3) | Cubic  
 7 | Update value without having index | O(n^3) | Cubic
 8 | Update value having index | O(1) | Constant

##### DYNAMIC 1d ARRAYS

 SNo. | Operations | Order of complexity O(n) | Type of Complexity
 ---- | ---------- | ------------------------ | ------------------
 1 | Use value by indexes | O(1) | Constant
 2 | Insertion at beginning | O(n) | Linear
 3 | Deletion at beginning | O(n) | Linear
 4 | Insertion at end (empty array) | O(n) | Linear
 5 | Deletion at end (empty array) | O(n) | Linear
 6 | Deletion of the value without having index | O(n) | Linear  
 7 | Update value without having index | O(n) | Linear
 8 | Update value having index | O(1) | Constant

#### :octocat: LINKED LISTS

##### SINGULAR (having head and next)

 SNo. | Operations | Order and Type of Time Complexity O(n) | Order and Type of Space Complexity
 ---- | ---------- | -------------------------------------- | ----------------------------------
 1 | Traversing a list | O(n) -- Linear | O(1) -- Constant
 2 | Insertion at Head | O(1) -- Constant | O(1) -- Constant
 3 | Insertion at Tail | O(n) -- Linear | O(1) -- Constant
 4 | Insertion at Middle using Position | O(n) -- Linear | O(1) -- Constant
 5 | Insertion at Middle Exactly | O(n/2) -- Linear | O(1) -- Constant
 6 | Deletion from Head | O(1) -- Constant | O(1) -- Constant
 7 | Deletion from Tail | O(n) -- Linear | O(1) -- Constant
 8 | Deletion from Middle using Position | O(n) -- Linear | O(1) -- Constant
 9 | Deletion from Middle using Value | O(n) -- Linear | O(1) -- Constant
 10 | Deletion from Middle Exactly | O(n/2) -- Linear | O(1) -- Constant
 11 | Linear Search | O(n) -- Linear | O(1) -- Constant
 12 | Clear list | O(1) -- Constant | O(1) -- Constant

##### HYBRID SINGULAR (having head,tail and next)

##### DOUBLE (having head,tail and next,prev)

 SNo. | Operations | Order and Type of Time Complexity O(n) | Order and Type of Space Complexity
 ---- | ---------- | -------------------------------------- | ----------------------------------
 1 | Traversing a list (from left or right) | O(n) -- Linear | O(1) -- Constant
 2 | Insertion at Head | O(1) -- Constant | O(1) -- Constant
 3 | Insertion at Tail | O(1) -- Constant | O(1) -- Constant
 4 | Insertion at Middle using Position | O(n) -- Linear | O(1) -- Constant
 5 | Insertion at Middle Exactly | O(n/2) -- Linear | O(1) -- Constant
 6 | Deletion from Head | O(1) -- Constant | O(1) -- Constant
 7 | Deletion from Tail | O(1) -- Constant | O(1) -- Constant
 8 | Deletion from Middle using Position | O(n) -- Linear | O(1) -- Constant
 9 | Deletion from Middle using Value | O(n) -- Linear | O(1) -- Constant
 10 | Deletion from Middle Exactly | O(n/2) -- Linear | O(1) -- Constant
 11 | Linear search | O(n) -- Linear | O(1) -- Constant
 12 | Clear list | O(1) -- Constant | O(1) -- Constant
 13 | Optimal Search | O(n/2) -- Linear | O(1) -- Constant

##### HYBRID DOUBLE (having head,prev and next)

##### SINGLE CIRCULAR (having head , next and loop)

 SNo. | Operations | Order of Time Complexity O(n) | Type of Time Complexity
 ---- | ---------- | ----------------------------- | -----------------------
 1 | Insertion at Head | O(1) | Constant
 2 | Insertion at Tail | O(n) | Linear
 3 | Deletion at Head | O(1) | Constant
 4 | Deletion at Tail | O(n) | Linear
 5 | Update the node | O(n) | Linear

##### DOUBLE CIRCULAR (having head,tail and prev,next and loop)

#### :octocat: STACKS

##### ONE WAY STACK / TWO WAY STACK

 SNo. | Operations | Order of Complexity O(n) | Type of Complexity
 ---- | ---------- | ------------------------ | ------------------
 1 | Push an element or Insert element | O(1) | Constant
 2 | Pop an element or Delete element | O(1) | Constant
 3 | Get value of top | O(1) | Constant

#### :octocat: QUEUES

#### :octocat: HASHTABLE

#### :octocat: HEAPS

#### :octocat: TREES

#### :octocat: GRAPHS

## Contribution Guide

Please Read the [CONTRIBUTING.md](.github/CONTRIBUTING.md) file for instructions of contributing and [CODE OF CONDUCT](CODE_OF_CONDUCT.md).

### Directory Structure

* Language
  * Conversions
  * Data-Structures
  * Dynamic-Programming
  * Misc
  * Searching
  * Sorting
  * README

* Add a new Language to the root directory (but don't add unnecessary languages).
* Each Code snippet must be in the appropriate sub-directory.
* Add index of the code to specific readme of the language.

### Docs

* Algorithm
  * About
  * Pseudocode
  * Important Points
  * Different Methods
  * Algorithm
  * Implementations

### Got any Questions

* Make an [issue](https://github.com/GauravWalia19/Algorithms-and-Data-Structures/issues)! We'll reply as soon as we can!
* Find bugs in our code and make [issue](https://github.com/GauravWalia19/Algorithms-and-Data-Structures/issues) or [pull request](https://github.com/GauravWalia19/Algorithms-and-Data-Structures/pulls).
* Pull Request of the new code will we accepted soon as possible.

### AUTHORS

* Gaurav Walia (GauravWalia19)
* [CONTRIBUTORS](CONTRIBUTORS.md)

### :octocat: HAPPY CODING

#### :copyright: Gaurav Walia