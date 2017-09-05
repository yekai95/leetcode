package first;

import java.util.Arrays;

public class p378 {
public int kthSmallest(int[][] matrix, int k) {
	   int n=matrix.length;
	   int[] arr=new int[n*n];
	   for(int i=0;i<n;i++)
		   for(int j=0;j<n;j++)
		   {
			   arr[i*n+j]=matrix[i][j];
		   }
	   Arrays.sort(arr);
	   return arr[k-1];
}
}
