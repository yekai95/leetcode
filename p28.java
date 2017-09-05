package first;

public class p28 {
	public int strStr(String haystack, String needle) {
        if(haystack.length()<needle.length()) return -1;
        if(needle.length()==0||haystack.length()==0) return 0;
        char[] hay=haystack.toCharArray();
        char[] nee=needle.toCharArray();
        int j;
        for(int i=0;i<hay.length;i++)
        {
        	if(hay[i]==nee[0])
        	{
        		int count=i;
        		for(j=0;j<nee.length&&hay.length-count>=nee.length;j++)
        		{
        			if(hay[i]==nee[j])
        			i++;
        			else 
                    {
                        i=count;
                        break;
                    }
        		}
        		if(j==nee.length&&i!=count) return count;
        	}
        }
        return -1;
}
}
