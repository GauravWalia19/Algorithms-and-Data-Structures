## import 'sys' library
import sys
## A is the input Array(Unsorted)
A = [64, 25, 12, 22, 11]

for i in range(len(A)):
    min_idx = i
    for j in range(i+1, len(A)):
        if A[min_idx] > A[j]:
            min_idx = j     
    A[i], A[min_idx] = A[min_idx], A[i]

## A is sorted Array

## This will print array elements line by line
print ("Sorted array")
for i in range(len(A)):
    print(A[i])
