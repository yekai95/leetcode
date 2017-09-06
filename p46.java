package first;
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
public class p46 {
	ArrayList<List<Integer>> arr=new ArrayList<List<Integer>>(); 
	public List<List<Integer>> permute(int[] nums) {  
	       dfs(nums,0);  
	       return arr;  
	}
	    public void dfs(int[] nums,int s)
	    {  
	        if(s==nums.length)
	        {  
	            List<Integer> list=new LinkedList<Integer>();  
	            for(int i=0;i<nums.length;i++)  
	                list.add(nums[i]);  
	            arr.add(list);  
	        }  
	        for(int i=s;i<nums.length;i++)
	        {  
	            boolean flag=false;               
	            for(int j=s+1;j<i;j++)
	            {           
	                if(nums[j]==nums[i])         
	                flag=true;                
	            }                                 
	            if(flag)                          
	            continue;                    
	            int tmp=nums[s];  
	            nums[s]=nums[i];  
	            nums[i]=tmp;  
	            dfs(nums,s+1);            
	            nums[i]=nums[s];  
	            nums[s]=tmp;  
	        }  
	    }  
}
