# COMPLEXITY

## INDEX

* DATA STRUCTURES
  * [ARRAYS](####arrays)
    * [1D ARRAY](#####1d-array)
    * [2D ARRAY](#####2d-array)
    * [3D ARRAY](#####3d-array)
    * [4D ARRAY](#####4d-array)
    * [ARRAYS CLASS IN JAVA](#####arrays-class-in-java)
  * [LISTS](####lists)
    * [SINGULAR LINKED LIST](#####singular-linked-list-having-head-and-next)
    * [HYBRID SINGULAR LINKED LIST](#####hybrid-singular-linked-list-having-head,tail-and-next)
    * [DOUBLE LINKED LIST](#####double-linked-list-having-head,tail-and-next,prev)
    * [HYBRID DOUBLE LINKED LIST](#####hybrid-double-linked-list-having-head,prev-and-next)
    * [SINGLE CIRCULAR LINKED LIST](#####circular-linked-list-having-tail/head-,next-and-loop)
    * DOUBLE CIRCULAR LINKED LIST
    * [MEMORY EFFICIENT DOUBLE LINKED LIST](#####memory-efficient-(XOR)-double-linked-list)
    * [UNROLLED LINKED LIST](#####unrolled-linked-list)
    * [SKIP LIST](#####skip-list)
    * [ARRAYLISTS](#####arraylists-(JAVA))
    * [VECTORS](#####vectors-(C++,JAVA))
  * STACKS
    * [ONE WAY STACK / TWO WAY STACK](#####one-way-stack-/-two-way-stack)
  * QUEUES
  * HASHTABLE
  * HEAPS
    * [DYNAMIC 1D ARRAY](#####dynamic-1d-arrays-(C,C++))
    * [DYNAMIC 2D ARRAY](#####dynamic-2d-arrays-(C,C++))
    * [DYNAMIC 3D ARRAY](#####dynamic-3d-arrays-(C,C++))
  * TREES
  * GRAPHS
  * BLOCKCHAIN

* SEARCHING
  * [LINEAR SEARCH](###searching)
  * [BINARY SEARCH](###searching)

* SORTING
  * [BUBBLE SORT](###sorting)
  * [SELECTION SORT](###SORTING)
  * [INSERTION SORT](###sorting)
  * [SHELL SORT](###sorting)
  * [MERGE SORT](###sorting)
  * [QUICK SORT](###sorting)
  * [COUNTING SORT](###sorting)
  * [RADIX SORT](###sorting)

### DATA STRUCTURES

#### ARRAYS

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

##### 4D ARRAY

 SNo. | Operations | Order of complexity O(n) | Type of Complexity
 ---- | ---------- | ------------------------ | ------------------
 1 | Use value by indexes | O(1) | Constant
 2 | Insertion at beginning | O(n^4) | Quadratic
 3 | Deletion at beginning | O(n^4) | Quadratic
 4 | Insertion at end (empty array) | O(1) | Constant
 5 | Deletion at end (empty array) | O(1) | Constant
 6 | Deletion of the value without having index | O(n^4) | Quadratic  
 7 | Update value without having index | O(n^4) | Quadratic
 8 | Update value having index | O(1) | Constant

##### ARRAYS CLASS IN JAVA

 SNo. | Methods | Order of complexity O(n) | Type of Complexity
 ---- | ---------- | ------------------------ | ------------------
 1 | equals() | O(n) | Linear
 2 | toString() | O(n) | Linear
 3 | fill() | O(n) | Linear
 4 | sort() | O(n logn) | LinearLogarithmic
 5 | binarySearch() | O(log n) | Logarithmic
 6 | copyOf() | O(n) | Linear

#### LISTS

##### SINGULAR LINKED LIST (having head and next)

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

##### HYBRID SINGULAR LINKED LIST (having head,tail and next)

##### DOUBLE LINKED LIST (having head,tail and next,prev)

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

##### HYBRID DOUBLE LINKED LIST (having head,prev and next)

##### CIRCULAR LINKED LIST (having tail/head ,next and loop)

SNo. | Operations | Order and Type of Time Complexity O(n) | Order and Type of Space Complexity
 ---- | ---------- | -------------------------------------- | ----------------------------------
 1 | Traversing a list (from left to right to head) | O(n) -- Linear | O(1) -- Constant
 2 | Insertion at Head | O(1) -- Constant | O(1) -- Constant
 3 | Insertion at Tail | O(1) -- Constant | O(1) -- Constant
 4 | Deletion from Head | O(1) -- Constant | O(1) -- Constant
 5 | Deletion from Tail | O(n) -- Linear | O(1) -- Constant
 6 | Deletion from middle using value | O(n) -- Linear | O(1) -- Constant
 6 | Linear search | O(n) -- Linear | O(1) -- Constant
 7 | Clear list | O(1) -- Constant | O(1) -- Constant

##### MEMORY EFFICIENT (XOR) DOUBLE LINKED LIST

##### UNROLLED LINKED LIST

##### SKIP LIST

##### ARRAYLISTS (JAVA)

 SNo. | Operations | Order and Type of Time Complexity O(n) | Order and Type of Space Complexity
 ---- | ---------- | -------------------------------------- | ----------------------------------
 1 | Traversing a list | O(n) -- Linear | O(1) -- Constant
 2 | **add(element)** -- Insertion at Tail | O(1) -- Constant | O(1) -- Constant
 3 | **add(index,element)** -- Insertion at Middle using index | O(n) -- Linear | O(1) -- Constant
 4 | **remove(index)** -- Deletion from Middle using index | O(n) -- Linear | O(1) -- Constant
 5 | **contains(element)** -- Search List | O(n) -- Linear | O(1) -- Constant
 6 | **get(index)** -- Accessing random element | O(1) -- Constant | O(1) -- Constant

##### VECTORS (C++,JAVA)

 SNo. | Operations | Order and Type of Time Complexity O(n) | Order and Type of Space Complexity
 ---- | ---------- | -------------------------------------- | ----------------------------------

#### STACKS

##### ONE WAY STACK / TWO WAY STACK

 SNo. | Operations | Order of Complexity O(n) | Type of Complexity
 ---- | ---------- | ------------------------ | ------------------
 1 | Push an element or Insert element | O(1) | Constant
 2 | Pop an element or Delete element | O(1) | Constant
 3 | Get value of top | O(1) | Constant

#### QUEUES

#### HASHTABLE

#### HEAPS

##### DYNAMIC 1D ARRAYS (C,C++)

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

##### DYNAMIC 2D ARRAYS (C,C++)

 SNo. | Operations | Order of complexity O(n) | Type of Complexity
 ---- | ---------- | ------------------------ | ------------------
 1 | Use value by indexes | O(1) | Constant
 2 | Insertion at beginning | O(n^2) | Quadratic
 3 | Deletion at beginning | O(n^2) | Quadratic
 4 | Insertion at end (empty array) | O(n^2) | Quadratic
 5 | Deletion at end (empty array) | O(n^2) | Quadratic
 6 | Deletion of the value without having index | O(n^2) | Quadratic  
 7 | Update value without having index | O(n^2) | Quadratic
 8 | Update value having index | O(1) | Constant

##### DYNAMIC 3D ARRAYS (C,C++)

 SNo. | Operations | Order of complexity O(n) | Type of Complexity
 ---- | ---------- | ------------------------ | ------------------
 1 | Use value by indexes | O(1) | Constant
 2 | Insertion at beginning | O(n^3) | Cubic
 3 | Deletion at beginning | O(n^3) | Cubic
 4 | Insertion at end (empty array) | O(n^3) | Cubic
 5 | Deletion at end (empty array) | O(n^3) | Cubic
 6 | Deletion of the value without having index | O(n^3) | Cubic  
 7 | Update value without having index | O(n^3) | Cubic
 8 | Update value having index | O(1) | Constant

#### TREES

#### GRAPHS

### SEARCHING

 SNo. | Algorithm | Order of complexity O(n) | Type of Complexity | Recursive | Iterative
 ---- | --------- | ------------------------ | ------------------ | --------- | ---------
 1 | Linear Search | O(n) | Linear | :heavy_multiplication_x: | :heavy_check_mark:
 2 | Binary Search | O(log n) | Logarithmic | :heavy_check_mark: | :heavy_check_mark:

### SORTING

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