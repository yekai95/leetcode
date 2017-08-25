package first;

public class p69 {
public int mySqrt(int x) {
        long min=0,mid,max=x,temp;
        while(min<max)
        {
        	mid=(min+max)/2;
        	temp=mid*mid;
        	if(temp==x) break;
        	else if(temp<x)min=mid+1;
        	else max=mid-1;
        }
        mid=(max+min)/2;
        if(mid*mid>x) mid--;
        return (int)mid;
}
}
