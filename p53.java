package first;

public class p53 {
public int maxSubArray(int[] nums) {
	int max=Integer.MIN_VALUE,curr=0;
	if(nums.length==0) return 0;
	for(int i=0;i<nums.length;i++)
	{
		if(nums[i]>0)
		{
			if(curr>0)
			curr+=nums[i];
			else curr=nums[i];	
		}
		else
		{
			curr+=nums[i];
			if(nums[i]>max)max=nums[i];
		}
		if(curr>max) max=curr;
	}
	return max;
}
}
