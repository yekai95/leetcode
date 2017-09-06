package first;

import java.util.Arrays;

public class p287 {
public int findDuplicate(int[] nums) {
		int low=1,high=nums.length-1;
		while(low<high)
		{
			int count=0;
			int mid=(low+high)/2;
			for(int i=0;i<nums.length;i++)
			{
				if(nums[i]<=mid) count++;
			}
			if(count>mid) high=mid;
			else low=mid+1;
		}
		return low;
}
}
