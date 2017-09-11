package first;
import java.util.List;
import java.util.ArrayList;
public class p295 {
List<Integer> l=new ArrayList<Integer>();
public MedianFinder() {
       
}
    
public void addNum(int num) {
	   int left=0;
	   int right=l.size()-1;
	   while(left<=right)
	   {
		   int mid=(left+right)/2;
		   if(num<l.get(mid))
		   right=mid-1;
		   else if(l.get(mid)==num)
		   {
			   l.add(mid+1,num);
			   return;
		   }
		   else left=mid+1;
	   }
	   l.add(left,num);
}
    
public double findMedian() {
	  if(l.size()==0) return 0;
	  if(l.size()%2==0)
	  return (double)(l.get((l.size()-1)/2)+l.get(l.size()/2))/2;
	  else
	  return l.get(l.size()/2);
}
}
