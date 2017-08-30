package first;
import java.util.Arrays;
public class p198 {
public int rob(int[] nums) {
        if(nums.length==0) return 0;
        if(nums.length==1) return nums[0];
        if(nums.length==2) return Math.max(nums[0], nums[1]);
        int[] dp=new int[nums.length];
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0], nums[1]);
        int i;
        for(i=2;i<dp.length;i++)
        {
        	dp[i]=Math.max(dp[i-1],dp[i-2]+nums[i]);
        }
        return dp[i-1];
        
}
}
