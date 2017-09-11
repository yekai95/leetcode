package first;

public class p191 {
public int hammingWeight(int n) {
        int countone=0;
        while(n!=0)
        {
        	countone++;
        	n=n&(n-1);
        }
        return countone;
}
}
