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
  n=1       time: 4500 ns
  n=10      time: 10000 ns
  n=100     time: 32500 ns
  ...
  n=10000   time: 1900000 ns

  ANALYSIS:
  <INSERT YOUR RESULTS ANALYSIS HERE>
  ======================================*/

public class MergeSortTester 
{
    
    public static final int[] NUMS = {1,10,100,1000,10000,100000,100000,1000000,10000000,200000000,300000000};
	
    /******************************
     * execution time analysis 
     * <INSERT YOUR DESCRIPTION HERE OF 
     *  YOUR APPARATUS FOR GENERATING EXECUTION 
     *  TIME DATA...>
     ******************************/
    public static void main( String[] args ) 
    {
	String retStr = "";
	
	for (int j = 0; j < NUMS.length; j++){
	    int n = NUMS[j];        // number of elements to be generated
	    int batchSize = 1000;   // number of times to repeat operation
	    double sum = 0;         // for calculating average of runtime

	    // repeat batchSize times
	    for (int times = 0; times < batchSize; times++) {
	
		// generate array with random ints from 0 to n
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
		    arr[i] = (int)(Math.random()*n);
		}

		// begin sort
		long startTime = System.currentTimeMillis();
		MergeSort.sort(arr);
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
