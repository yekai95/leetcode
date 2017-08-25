package first;
import java.util.List;
import java.util.ArrayList;
public class p442 {
public List<Integer> findDuplicates(int[] nums) {
        List<Integer> l=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++)
        {
        	int index=Math.abs(nums[i])-1;
        	if(nums[index]<0) l.add(index+1);
        	nums[index]=-nums[index];
        }
        return l;
 }
}
