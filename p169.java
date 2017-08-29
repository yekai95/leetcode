package first;

public class p169 {
public int majorityElement(int[] nums) {
       int maxnum=nums[0],counter=0;
       for(int i=0;i<nums.length;i++)
       {
    	   if(counter==0)
    	   {
    		   maxnum=nums[i];
    		   counter++;
    	   }
    	   else if(nums[i]==maxnum)counter++;
    	   else counter--;
       }
       return maxnum;     
}
}
