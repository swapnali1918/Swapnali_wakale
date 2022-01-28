package core.programs.assissted.project;

public class LongestIncreasingSequence {
	 static int incre_subseq(int arr[], int size){
	      int seq_arr[] = new int[size];
	      int i, j, max = 0;
	      
	      for (i = 0; i < size; i++)
	         seq_arr[i] = 1;
	      for (i = 1; i < size; i++)
	      for (j = 0; j < i; j++)
	      if (arr[i] > arr[j] && seq_arr[i] < seq_arr[j] + 1)
	    	  seq_arr[i] = seq_arr[j] + 1;
	      for (i = 0; i < size; i++)
	    	  if (max < seq_arr[i])
	    		  max = seq_arr[i];
	      	  return max;
	   }
	   public static void main(String args[]){
	      int arr[] = { 57, 84, 65, 35, 58, 65, 45, 95, 21, 15, 85};
	      int size = arr.length;
	      System.out.println("The length of the longest increasing subsequence is " +  incre_subseq(arr, size));
	   }
}
