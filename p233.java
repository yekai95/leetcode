package first;

public class p233 {
public int countDigitOne(int n) {
	int sum=0;
	for(long m=1;m<=n;m*=10)
	{
		 int a=(int) (n/m);
		 int x=(int) ((a+8)/10*m);  
         int y=0;  
         if(a%10==1)  
         {  
             y=(int)(n%m)+1;  
         }  
         sum+=x;  
         sum+=y;  
	}
	return sum;
}
}
