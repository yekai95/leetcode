package first;
import java.util.ArrayList;
import java.util.List;

public class p448 {
public List<Integer> findDisappearedNumbers(int[] nums) {
	List<Integer> l=new ArrayList<Integer>();
	for(int i=0;i<nums.length;i++)
    {
    	int index=Math.abs(nums[i])-1;
    	if(nums[index]>0)
    	nums[index]=-nums[index];
    }
	for(int j=0;j<nums.length;j++)
	{
		if(nums[j]>0)
		l.add(j+1);
	}
	return l;
}
}
