package first;

public class p4 {
public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    int m=nums1.length,n=nums2.length,i=0,j=0;
	int[] q=new int[m+n];
	for(int k=0;k<m+n;k++)
	{
		if(i<m&&j<n)
		{
			if(nums1[i]<nums2[j])
			{
				q[k]=nums1[i];
				i++;
			}
			else 
			{
				q[k]=nums2[j];
				j++;
			}
		}
		else if(i==m)
		{
			q[k]=nums2[j];
			j++;
		}
		else if(j==n)
		{
			q[k]=nums1[i];
			i++;
		}	
	}
	if((m+n)%2==0)
	return (double)(q[(m+n)/2]+q[(m+n)/2-1])/2;
	else
	return q[(m+n)/2];
}
}
