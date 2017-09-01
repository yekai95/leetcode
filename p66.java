package first;

public class p66 {
public int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--)
        {
        	if(digits[i]==9)
        	{
        		digits[i]=0;
        		if(i==0)
        		{
        			int[] newarr=new int[digits.length+1];
        			for(int j=digits.length-1;j>=0;j--)
        			newarr[j+1]=digits[j];
        			newarr[0]=1;
        			return newarr;
        		}
        	}
        	else
        	{
        		digits[i]++;
        		break;
        	}
        }
        return digits;
}
}
