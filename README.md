# CaMRy

##**How it Works**

The merge sort algorithm is a divide-and-conquer method utilizing recursion to sort an array. If the array length is one, then it is already sorted, so it is added to the merging block. Otherwise, the array is split in half, and the halves are sorted and merged using the rsiu methodology. Once the recursion is complete, there will be multiple nested merge calls, so the merges are merged until there is only one sorted array left.

##**Big O Classification**
O(nlogn) for most cases.

O(n) if one element in array. HOWEVER: this violates the precondition of an unsorted array, as a one item array is always sorted.

Please refer to [here](https://docs.google.com/spreadsheets/d/1di-cIgPVuNcyNbaXlrJYO38TMVXGVqyL1_0YpZwaboE/pubhtml#) for graphs showing runtimes.
##**Data Gathered**
Mean execution times for dataset of size n:

Batch size: 100

  n        | time (ms)
  -------- | ---------
  1        | 0
  10       | 0
  100      | 0.02
  1000     | 0.2
  5000     | 0.86
  10000    | 1.81
  50000    | 8.64
  100000   | 17.66
  500000   | 107.49
  1000000  | 236.34
  2500000  | 600.08
  5000000  | 1381.95
  7500000  | 2176.85
  10000000 | 2732.56

##**Analysis**
On [this spreadsheet](https://docs.google.com/spreadsheets/d/1di-cIgPVuNcyNbaXlrJYO38TMVXGVqyL1_0YpZwaboE/pubhtml#), we have graphed a O(n) and O(nlogn) run times. It is clear from the expected runtime graph that a linear runtime is faster than a loglinear one, which is much faster than a quadratic runtime. Therefore, we expected a similar result from our tests. When graphed, our results matched what we expected: quadratic by far the slowest with loglinear next, and linear runtime the fastest. One interesting idea to note from the graph of our results is that the linear runtime appears to be a constant of 0. However, when multiplied by a constant, a more linear graph is seen (we can do this because O(n) times O(1) = O(n) ). 

##**Conclusion**##
Our results show clearly that the graph of the merge sort reuntime is a translation of a loglinear graph, and therefore the algorithm is O(nlogn).
