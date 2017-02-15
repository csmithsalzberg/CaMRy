/*======================================
  class MergeSortTester

  ALGORITHM:
  The merge sort algorithm is a divide-and-conquer method utilizing
   recursion to sort an array. If the array length is one, then it is already 
   sorted, so it is added to the merging block. Otherwise, the array is split
   in half, and the halves are sorted and merged using the rsiu methodology.
   Once the recursion is complete, there will be multiple nested merge 
   calls, so the merges are merged until there is only one sorted array left.

  BIG-OH CLASSIFICATION OF ALGORITHM:
  O(nlogn) for most cases
  O(n) if one element in array

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
  n-2500000  time: 600.08 ms
  n=5000000  time: 1381.95 ms
  n=7500000  time: 2176.85 ms
  n=10000000 time: 2732.56 ms

  ANALYSIS:
  MergeSort seems to run at linear logarithmic time. Most of the data points,
  when plotted onto an Excel sheet and made into graphs, showed the strongest
  correlation to a linear logarithmic runtime.
  ======================================*/

public class MergeSortTester 
{
    
    public static final int[] NUMS = {1,10,100,1000,5000,10000,50000,100000,500000,1000000,2500000,5000000,7500000,10000000};

	
    /******************************
     * execution time analysis 
     * Random arrays are generated by producing arrays of n length, with each
     * element inside being an random integer from 0 to n.
     ******************************/
    public static void main( String[] args ) 
    {
	String retStr = "";
	
	for (int j = 0; j < NUMS.length; j++) {
	    int n = NUMS[j];        // number of elements to be generated
	    int batchSize = 100;   // number of times to repeat operation
	    double sum = 0;         // for calculating average of runtime

	    // repeat batchSize times
	    for (int times = 0; times < batchSize; times++) {
	
		// generate array with random ints from 0 to n
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
		    arr[i] = (int)(Math.random()*n);
		}

		// begin sort
		/*
		long startTime = System.currentTimeMillis();
		MergeSort.sort(arr);
		long elapsedTime = System.currentTimeMillis() - startTime;
		*/

		// O(n) operation for time reference
		long startTime = System.currentTimeMillis();
	        for (int t = 0; t < n; t++) {
		    arr[t]++;
		}
		long elapsedTime = System.currentTimeMillis() - startTime;
	    
		System.out.print( "Runtime merge " + (times+1) + " : " );
		System.out.println( elapsedTime );
		sum += elapsedTime;
	    }

	    // print average
	    retStr += NUMS[j] + "," + sum / batchSize + ",\n";
	    System.out.println( sum / batchSize );
	    
	}

	System.out.println( retStr );
	
    }//end main

}//end class
