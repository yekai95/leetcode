package first;
import java.util.ArrayList;
import java.util.List;
import java.util.Hashtable;
public class p347 {
	public List<Integer> topKFrequent(int[] nums, int k) {
       Hashtable<Integer,Integer> map=new Hashtable<Integer,Integer>();  
       for(int num:nums)
       {  
           if(map.get(num)==null)
               map.put(num, 1);  
           else  
               map.put(num, map.get(num)+1);
       }   
       List<Integer>[] bucket=new List[nums.length+1];
       for(int key:map.keySet())
       {  
           int count=map.get(key);
           if(bucket[count]==null)  
           bucket[count]=new ArrayList<Integer>();  
           bucket[count].add(key);  
       }  
       List<Integer> result=new ArrayList<Integer>();  
       for(int i=nums.length;i>0;i--)
       {  
           if(bucket[i]!=null&&result.size()<k)  
               result.addAll(bucket[i]);         
       }  
       return result;
   }
}
