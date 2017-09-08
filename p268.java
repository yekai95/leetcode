package first;

public class p268 {
	public int missingNumber(int[] nums) {
	       int flag=0,count=0;
	       for(int i=0;i<nums.length;i++)
	       {
	    	   if(nums[i]==0) count=i;
	    	   if(Math.abs(nums[i])!=nums.length)
	    	   nums[Math.abs(nums[i])]=-nums[Math.abs(nums[i])];
	    	   else 
	    	   flag=1;

	       }
	       if(flag==0) return nums.length;
	       for(int i=0;i<nums.length;i++)
	       {
	    	   if(nums[i]>0)
	    	   return i;
	       }
	       return count;
	}
}
