# CaMRy

##**How it Works**

The merge sort algorithm is a divide-and-conquer method utilizing recursion to sort an array. If the array length is one, then it is already sorted, so it is added to the merging block. Otherwise, the array is split in half, and the halves are sorted and merged using the rsiu methodology. Once the recursion is complete, there will be multiple nested merge calls, so the merges are merged until there is only one sorted array left.

##**Big O Classification**
O(nlogn) for most cases.

O(n) if one element in array. HOWEVER: this violates the precondition of an unsorted array, as a one item array is always sorted.

##**Data Gathered**
Mean execution times for dataset of size n:

Batch size: 100

n=1        time: 0 ms

n=10       time: 0 ms

n=100      time: 0.02 ms

n=1000     time: 0.2 ms

n-5000     time: 0.86 ms

n=10000    time: 1.81 ms

n=50000    time: 8.64 ms

n=100000   time: 17.66 ms

n=500000   time: 107.49 ms

n=1000000  time: 236.34 ms

n=2500000  time: 600.08 ms

n=5000000  time: 1381.95 ms

n=7500000  time: 2176.85 ms

n=10000000 time: 2732.56 ms
