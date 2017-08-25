package first;

public class p660 {
	public int newInteger(int n) {
        int result=0;  
        int base=1;  
        while(n>0)
        {  
            result=result+ n%9 * base;  
            base=base*10;  
            n=n/9;  
        }  
        return result;  
    }
}
