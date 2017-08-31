package first;

public class p260 {
public int[] singleNumber(int[] nums) {
		int result[]=new int[2];
		int show=0;
        for(int i=0;i<nums.length;i++)
        {
        	show=show^nums[i];
        }
        show&=-show;
        for(int i=0;i<nums.length;i++)
        {
        	if((nums[i]&show)==0)
        	result[0]^=nums[i];
        	else 
        	result[1]^=nums[i];
        }
        return result;
}
}
