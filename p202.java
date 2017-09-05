package first;
import java.util.Hashtable;
public class p202 {
	public boolean isHappy(int n) {
		if(n==0) return false;
		Hashtable<Integer,Integer> h=new Hashtable<Integer,Integer>();
		while(true)
		{
			if(h.get(n)==null)
			h.put(n, calculate(n));
			else return false;
			if(calculate(n)==1) return true;
	        n=calculate(n);
		}
	}
	public int calculate(int n)
	{
		int sum=0;
		while(n!=0)
		{
			int digit=n%10;
			n/=10;
			sum+=digit*digit;
		}
		return sum;
	}
}
