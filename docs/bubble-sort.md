# BUBBLE SORT

Bubble sort is the Beginners Sorting Algorithm because it is mostly used by the Beginners for sorting. Although this is not the best Algorithm for sorting as is Complexity is O(n^2). As we know that O(n^2) is not good for our solution to some simpler problems. So some Professional Programmers avoid using this sort. Moreover the the book "Introduction to ALgorithm" by Cormen doesn't have this Algorithm. Basically this sort gets its name from its technique to sort i.e bubble shape.

## PSEUDOCODE

```java
for(int i=n-1;i>=0;i--)
{
    for(int j=0;j<i;j++)
    {
        if(arr[j] > arr[j+1])
        {
            //swap
        }
    }
}
```

## IMPORTANT POINTS

 Sno | Points | ...
 --- | ------ | ---
 1 | **Time Complexity** | O(n^2)
 2 | **Type of Complexity** | Quadratic
 3 | Stable but can be Unstable Sort |
 4 | In Place Algorithm |
 5 | **Space Complexity** | O(1)
 6 | Iterative Algorithm |

## DIFFERENT METHODS

* Ascending
  * Stable
  * Unstable
* Descending
  * Stable
  * Unstable

## ALGORITHM

Let the given array is { 20 , 35 , -15 , 7 , 55 , 1 , -22} we will do bubble sort on it. The sort is taken ascending you can do descending also.

### Step 1 Firstly we will traverse the array of given length(i.e 7) and compare the adjacent elements. So comparisons will be 6

* compare 20 35 (no swap as 20 < 35)
  > {*20 , 35* , -15 , 7 , 55 , 1 , -22}
* compare 35 -15 (swap as 35 > -15)
  > {20 , *-15 , 35* , 7 , 55 , 1 , -22}
* compare 35 7 (swap as 35 > 7)
  > {20 , -15 , *7 , 35* , 55 , 1 , -22}
* compare 35 55 (no swap as 35 < 55)
  > {20 , -15 , 7 , *35 , 55* , 1 , -22}
* compare 55 1 (swap as 55 > 1)
  > {20 , -15 , 7 , 35 , *1 , 55* , -22}
* compare 55 -22 (swap as 55 > -22)
  > {20 , -15 , 7 , 35 , 1 , *-22 , **55***}

### Step 2 Then we will traverse the array of length 6. Now see 55 is in correct position so there is no need for going on that position. So comparisons will be 5

* compare 20 -15 (swap as 20 > -15)
  > {*-15 , 20* , 7 , 35 , 1 , -22 , **55**}
* compare 20 7 (swap as 20 > 7)
  > {-15 , *7 , 20* , 35 , 1 , -22 , **55**}
* compare 20 35 (no swap as 20 < 35)
  > {-15 , 7 , *20 , 35*, 1 , -22 , **55**}
* compare 35 1 (swap as 35 > 1)
  > {-15 , 7 , 20 , *1 , 35* , -22 , **55**}
* compare 35 -22 (swap as 35 > -22)
  > {-15 , 7 , 20 , 1 , *-22 , **35*** , **55**}

### Step 3 Then we will traverse the array of length 5. Now see 2 elements are in ascending order 35 and 55. So comparisons will be 4

* compare -15 7 (no swap as -15 < 7)
  > {*-15 , 7* , 20 , 1 , -22 , **35** , **55**}
* compare 7 20 (no swap as 7 < 20)
  > {-15 , *7 , 20* , 1 , -22 , **35** , **55**}
* compare 20 1 (swap as 20 > 1)
  > {-15 , 7 , *1 , 20* , -22 , **35** , **55**}
* compare 20 -22 (swap as 20 > -22)
  > {-15 , 7 , 1 , *-22 , **20*** , **35** , **55**}

### Step 4 Then we will traverse the array of length 4. Now 3 elements are in ascending order 20 35 and 55. So comparsions will be 3

* compare -15 7 (no swap as -15 < 7)
  > {*-15 , 7* , 1 , -22 , **20** , **35** , **55**}
* compare 7 1 (swap 7 > 1)
  > {-15 , *1 , 7* , -22 , **20** , **35** , **55**}
* compare 7 -22 (swap as 7 > -22)
  > {-15 , 1 , *-22 , **7*** , **20** , **35** , **55**}

### Step 5 Then we will traverse the array of length 3. Now 4 elements are in right order 7 20 35 and 55 . So comparsions will be 2

* compare -15 1 (no swap as -15 < 1)
  > {*-15 , 1* , -22 , **7** , **20** , **35** , **55**}
* compare 1 -22 (swap as 1 > -22)
  > {-15 , *-22 , **1*** , **7** , **20** , **35** , **55**}

### Step 6 Then we will traverse the array of length 2. Now almost all array is sorted. So comparsion will be only 1

* compare -15 -22 (swap as -15 < -22)
  > {**-22** , **-15** , **1** , **7** , **20** , **35** , **55**}

## IMPLEMENTATIONS

1. [C](/C/Sorting/BUBBLE-SORT/bubblesort.c)
2. [C++](/C++/Sorting/bubblesort.cpp)
3. [JAVA](/Java/Sorting/BubbleSort.java)