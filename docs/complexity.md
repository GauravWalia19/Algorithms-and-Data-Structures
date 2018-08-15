# [:arrow_left:](../README.md) COMPLEXITY

Complexity tells us how much complex of an Algorithm.

## :octocat: TYPES OF COMPLEXITY

There are two types of Complexities:

### 1. TIME COMPLEXITY

Time Complexity tell about **how much time an algorithm will take to solve the problem**.

#### :rocket:ITERATIVE

For iterative solution the complexity is finded out by analysing the statements of the code.

#### :rocket:RECURSIVE

For recursive solution the complexity can be finded out using these six methods i.e

1. Back Substitution
2. Recursion Tree
3. Master Theorem (Divide and Conquer)
4. Master Theorem (Substract and Conquer)
5. Method of Guessing and Confirming
6. Amortised Analysis

### 2. SPACE COMPLEXITY

Space Complexity tells about **how much memory an algorithm will take to solve the problem**.

#### :rocket: ITERATIVE

For space complexity of iterative solution we will find the number of variables declared and used. If it remain constant than complexity is O(1) and if it increases or decreases than complexity is O(n).

#### :rocket: RECURSIVE

For space complexity of recursive solution we will find how much stack is used. For example four statements are gone in stack due to recursion so the space complexity can be finded out by checking the steps of stack i.e 4 in this case.

## :octocat: RELATION OF ORDER AND TYPE OF COMPLEXITY

 SNo. | Order of complexity | Type of complexity | Best(*******) / Worst(*)
 ---- | ------------------- | ------------------ | ----------------------
 1 | O(1) | Constant | *******
 2 | O(logn) log of base 2 | Logarithmic | ******
 3 | O(n) | Linear | *****
 4 | O(n logn) | n log - star n | ****
 5 | O(n^2) | Quadratic | ***
 6 | O(n^3) | Cubic | **
 7 | O(2^n) | Exponential | *

### :rocket: GRAPH

* n - Number of Inputs
* N - Number of Steps

![image](images/computational_complexity.png)

## :octocat: ORDER OF COMPLEXITY

### :rocket: SORTING

 SNo. | Algorithm | Order of complexity O(n) | Type of Complexity | Stable/Unstable Sort | In Place Algorithm | Space Complexity | Recursive | Iterative
 ---- | --------- | ------------------------ | ------------------ | -------------------- | ------------------ | ---------------- | --------- | ---------
 1 | Bubble Sort | O(n^2) | Quadratic | Stable / Can be Unstable but not an efficient way | :heavy_check_mark: | O(1) | :heavy_multiplication_x: |  :heavy_check_mark:
 2 | Selection Sort | O(n^2) | Quadratic | Unstable | :heavy_check_mark: |
 3 | Insertion Sort | O(n^2) | Quadratic | Stable | :heavy_check_mark: |
 4 | Shell Sort | Worst Case O(n^2) or better | Quadratic or other | Unstable | :heavy_check_mark: |
 5 | Merge Sort | O(nlog(n)) log of base 2 | Logarithmic  | Stable | :heavy_multiplication_x: |
 6 | Quick Sort | O(nlog(n)) log of base 2 | Logarithmic | Unstable | :heavy_check_mark: |
 7 | Counting Sort | O(n) | Linear | Stable / Unstable | :heavy_multiplication_x: |
 8 | Radix Sort | O(n) or slower than O(nlog(n)) log of base 2 | Linear / Logarithmic | Stable | Can Be |

### :rocket: DATA STRUCTURES

 SNo. | DATA STRUCTURES | Operations | Order of complexity O(n) | Type of Complexity
 ---- | --------------- | ------------| ------------------------ | ------------------
 1.1 | Arrays | direct access using index | O(1) | Constant
 1.2 | Arrays | Using loop operation | O(n) | Linear  