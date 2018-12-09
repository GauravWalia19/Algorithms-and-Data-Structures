# SELECTION SORT

Selection sort is another sorting technique used in sorting. But its better than bubble sort as it takes less comparisions and swaps to sort than bubble sort. Though its complexity is O(n^2). Its also inplace algorithm. As its complexity is O(n^2) so its not used much by programmers as time complexity is the criteria which programmers used to decide which algorithm is good for doing solution. See [wiki](https://github.com/GauravWalia19/Algorithms-and-Data-Structures/wiki) for information.

## PSEUDOCODE

```java
for(int i=n-1;i>0;i--)
{
    int index=0;
    for(j=0;j<i;j++)
    {
        if(arr[j]>arr[index])
        {
            index=j;//finding max index
        }
    }
    //swap
    int temp=arr[i];
    arr[i] = arr[index];
    arr[index]=temp;
}
```

## IMPORTANT POINTS

 Sno | Points | ...
 --- | ------ | ---
 1 | **Time Complexity** | O(n^2)
 2 | **Type of Complexity** | Quadratic
 3 | Unstable Sort |
 4 | In Place Algorithm |
 5 | **Space Complexity** | O(1)
 6 | Iterative Algorithm |

## DIFFERENT METHODS

* Ascending
  * Using max element
  * Using min element
* Descending
  * Using max element
  * Using min element

## ALGORITHM

Let the given array is { 20 , 35 , -15 , 7 , 55 , 1 , -22} we will do selection sort on it. The sort is taken ascending you can do descending also. We will finding the maximum index and sort the array in ascending order by swapping the elements from right.

### Step 1 Firstly we will traversing the array upto length(i.e 7) and find max index and swapping the elements from right

Now the max element index is 4 so we will swap 55 and -22
> {20 , 35 , -15 , 7 , -22 , 1 , **55**}

### Step 2 Then now our element 55 is in correct position so we will again traverse the array from left to right but now to length 6

The max element index is 1 so we will swap 35 and 1
> {20 , 1 , -15 , 7 , -22 , **35** , **55**}

### Step 3 Now two elements 35 and 55 are in correct order so we will again do the same process

The max element index is 0 so we will swap 20 and -22
> {-22 , 1 , -15 , 7 , **20** , **35** , **55**}

### Step 4 Now 20 35 and 55 are in correct order so again we will traverse array upto length 4

Then the max element index is 3 so it will swap 7 with 7 as we double traversing from both sides respectively.This problem is solved in insertion sort or by doing some immprovements in it. So the array will be
> {-22 , 1 , -15 , **7** , **20** , **35** , **55**}

### Step 5 Now last four elements are in correct order so we will traverse upto length 3

Then the max element index is 1 we will swap -15 and 1
> {-22 , -15 , **1** , **7** , **20** , **35** , **55**}

### Step 6 Now -15 is in correct order so it will again swap it

Now the final array will be
> {-22 , **-15** , **1** , **7** , **20** , **35** , **55**}

## IMPLEMENTATIONS

1. [C](/C/Sorting/SELECTION-SORT/selection.c)
2. [C++](/C++/Sorting/selectionsort.cpp)
3. [Java](/Java/Sorting/SelectionSort.java)