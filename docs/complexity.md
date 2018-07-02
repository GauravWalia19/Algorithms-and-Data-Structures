# [:arrow_left:](../README.md) COMPLEXITY

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

 SNo. | Algorithm | Order of complexity O(n) | Type of Complexity | Stable/Unstable Sort | In Place Algorithm
 ---- | --------- | ------------------------ | ------------------ | -------------------- | ------------------
 1 | Bubble Sort | O(n^2) | Quadratic | Stable / Can be Unstable but not an efficient way | :heavy_check_mark:
 2 | Selection Sort | O(n^2) | Quadratic | Unstable | :heavy_check_mark:
 3 | Insertion Sort | O(n^2) | Quadratic | Stable | :heavy_check_mark:
 4 | Shell Sort | Worst Case O(n^2) or better | Quadratic or other | Unstable | :heavy_check_mark:
 5 | Merge Sort | O(nlog(n)) log of base 2 | Logarithmic  | Stable | :heavy_multiplication_x:
 6 | Quick Sort | O(nlog(n)) log of base 2 | Logarithmic | Unstable | :heavy_check_mark:
 7 | Counting Sort | O(n) | Linear | Stable / Unstable | :heavy_multiplication_x:
 8 | Radix Sort | O(n) or slower than O(nlog(n)) log of base 2 | Linear / Logarithmic | Stable | Can Be

### :rocket: DATA STRUCTURES

 SNo. | DATA STRUCTURES | Operations | Order of complexity O(n) | Type of Complexity
 ---- | --------------- | ------------| ------------------------ | ------------------
 1.1 | Arrays | direct access using index | O(1) | Constant
 1.2 | Arrays | Using loop operation | O(n) | Linear  