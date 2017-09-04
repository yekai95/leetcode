package first;

import java.util.Arrays;

public class p134 {
public int canCompleteCircuit(int[] gas, int[] cost) {
        int debt=0;
        int remain=0;
        int start=0;
        for(int i=0;i<gas.length;i++)
        {
        	remain+=gas[i]-cost[i];
        	if(remain<0)
        	{
        		debt+=remain;
        		start=i+1;
        		remain=0;
        	} 	
        }
        return remain+debt>=0?start:-1;
}
}
