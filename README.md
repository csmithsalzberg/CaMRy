# CaMRy

##**How it Works**

The merge sort algorithm is a divide-and-conquer method utilizing recursion to sort an array. If the array length is one, then it is already sorted, so it is added to the merging block. Otherwise, the array is split in half, and the halves are sorted and merged using the rsiu methodology. Once the recursion is complete, there will be multiple nested merge calls, so the merges are merged until there is only one sorted array left.

##**Big O Classification**
O(nlogn) for most cases.

O(n) if one element in array.

##**Data Gathered**
Mean execution times for dataset of size n:

Batch size: 100

n=1       time: 4500 ns

n=10      time: 10000 ns

n=100     time: 32500 ns

...

n=10000   time: 1900000 ns
