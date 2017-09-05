package first;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class p78 {
	public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(nums == null || nums.length == 0){
            return res;
        }
        res.add(new ArrayList<Integer>());
        Arrays.sort(nums);
        for(int i = 0; i<nums.length; i++)
        {
           int size = res.size();
           for(int j = 0; j<size; j++)
           {
               List<Integer> newItem = new ArrayList<Integer>(res.get(j));
               newItem.add(nums[i]);
               res.add(newItem);
           }
        }
       return res;
   }
}
