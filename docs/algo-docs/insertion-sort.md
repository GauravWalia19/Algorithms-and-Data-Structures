# INSERTION SORT

The insertion sort is yet another sorting algorithm with complexity O(n^2).But its better then both sorting techniques i.e Bubble Sort and Selection sort. As insertion sort don't swap elements it shifts elements. It uses less comparisions and steps to solve the problem. It also a Stable Sorting technique as compared to selection sort.

## PSEUDOCODE

```java
for(int i=1;i<n-1;i++)
{
    int sample = arr[i];
    int j;
    for(j=i;j>0 && arr[j-1] > sample;j--)
    {
        //shifting
        arr[j]=arr[j-1];
    }
    arr[j]=sample;
}
```

## IMPORTANT POINTS

 Sno | Points | ...
 --- | ------ | ---
 1 | **Time Complexity** | O(n^2)
 2 | **Type of Complexity** | Quadratic
 3 | Stable Sort |
 4 | In Place Algorithm |
 5 | **Space Complexity** | O(1)
 6 | Iterative Algorithm |

## DIFFERENT METHODS

* Ascending
  * from left
  * from right
* Descending
  * from left
  * from right

## ALGORITHM

Let the given array is { 20 , 35 , -15 , 7 , 55 , 1 , -22} we will do insertion sort on it. The sort is taken ascending you can do descending also. In this technique we will start traversing from left to right and start inserting to left and do sorting by shifting elements.

### Step 1 Let us start traversin array from left. So earlier let only one elment i.e 20 is there so no need to shift element to make it sorted. Then the algorithm starts from two elements i.e 20 35 we will shift smaller element to left and bigger elements to right of the array to make it sorted

* Firstly sample element here is 35 as it in correct position so need for shifting so array remain same
  >  { **20** , **35** , -15 , 7 , 55 , 1 , -22}

### Step 2 Now its turn of -15 to insert in two elements to the left

* So sample element is -15 so after shifting it becomes
  > { **20** , **35** , **35** , 7 , 55 , 1 , -22}
* One more shift
  > { **20** , **20** , **35** , 7 , 55 , 1 , -22}
* After shifting the final array i.e sample is inseted to the index 0 it becomes
  > { **-15** , **20** , **35** , 7 , 55 , 1 , -22}

### Step 3 Now its turn of 7 to left

* So now sample element is 7
  > { **-15** , **20** , **35** , 7 , 55 , 1 , -22}
* Shifting
  > { **-15** , **20** , **35** , **35** , 55 , 1 , -22}
* > { **-15** , **20** , **20** , **35** , 55 , 1 , -22}
* After shifting its time to insert 7 to its correct position i.e index 1
  > { **-15** , **7** , **20** , **35** , 55 , 1 , -22}

### Step 4 Now its turn of 55 as it is in correct position so no need to shift

* The array will be
  > { **-15** , **7** , **20** , **35** , **55** , 1 , -22}

### Step 5 Now its turn of 1 for insertion

* Sample element will be 1
  > { **-15** , **7** , **20** , **35** , **55** , 1 , -22}
* Shifting
  > { **-15** , **7** , **20** , **35** , **55** , **55** , -22}
* > { **-15** , **7** , **20** , **35** , **35** , **55** , -22}
* > { **-15** , **7** , **20** , **20** , **35** , **55** , -22}
* > { **-15** , **7** , **7** , **20** , **35** , **55** , -22}
* Now sample element is inserted to the index 1
  > { **-15** , **1** , **7** , **20** , **35** , **55** , -22}

### Step 6 Now its turn to insert -22 to its correct position

* Sample element is now -22 and array is
  > { **-15** , **1** , **7** , **20** , **35** , **55** , -22}
* Shifting
  > { **-15** , **1** , **7** , **20** , **35** , **55** , **55**}
* > { **-15** , **1** , **7** , **20** , **35** , **35** , **55**}
* > { **-15** , **1** , **7** , **20** , **20** , **35** , **55**}
* > { **-15** , **1** , **7** , **7** , **20** , **35** , **55**}
* > { **-15** , **1** , **1** , **7** , **20** , **35** , **55**}
* > { **-15** , **-15** , **1** , **7** , **20** , **35** , **55**}
* Now finally we will again insert sample to index 0 so final array becomes
  > { **-22** , **-15** , **1** , **7** , **20** , **35** , **55**}

## IMPLEMENTATIONS

1. [C](/C/Sorting/INSERTION-SORT/insertion.c)
2. [Java](/Java/Sorting/insertionSort.java)