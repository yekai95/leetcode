package first;

public class p334 {
	public boolean increasingTriplet(int[] nums) {  
	    int min = Integer.MAX_VALUE;  
	    int min2 = Integer.MAX_VALUE;  
	    for (int n : nums) 
	    {  
	        if (n <= min)  
	        min = n;  
	        else if (n <= min2)  
	        min2 = n;  
	        else  
	        return true;  
	    }  
	    return false;  
	}  
}
