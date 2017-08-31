package first;
public class p5 {
	private int lo,maxlen;
    public String longestPalindrome(String s) {
        int len=s.length();
        if (len<2)
        return s;
        for (int i=0;i<len-1;i++)
        {
            extendPalindrome(s,i,i); 
            extendPalindrome(s,i,i+1);
        }
        return s.substring(lo,lo + maxlen);
    }
    private void extendPalindrome(String s,int p,int q){
        while(p>=0 && q<s.length() && s.charAt(p)==s.charAt(q))
        {
            p--;      
            q++;
        }
        if(maxlen<q-p-1)
        {
            lo=p+1;
            maxlen=q-p-1; 
        }     
    }
}
