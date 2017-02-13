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
  Batch size: <# of times each dataset size was run>
  n=1       time: 
  n=10      time: 
  n=100     time: 
  ...
  n=<huge>  time: 

  ANALYSIS:
  <INSERT YOUR RESULTS ANALYSIS HERE>
  ======================================*/

public class MergeSortTester 
{

    /******************************
     * execution time analysis 
     * <INSERT YOUR DESCRIPTION HERE OF 
     *  YOUR APPARATUS FOR GENERATING EXECUTION 
     *  TIME DATA...>
     ******************************/
    public static void main( String[] args ) 
    {
	int n = 100; // number of elements to be generated

	// generate array with random ints from 0 to n
	int[] arr = new int[n];
	for (int i = 0; i < n; i++) {
	    arr[i] = (int)(Math.random()*n);
	}

	// begin sort
	long startTime = System.currentTimeMillis();
	MergeSort.sort(arr);
	long endTime = System.currentTimeMillis();
	long elapsedTime = endTime - startTime;

	System.out.print( "Runtime: " );
	System.out.println( elapsedTime );
        	
    }//end main

}//end class
