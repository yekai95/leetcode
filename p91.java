package first;

public class p91 {
	public int numDecodings(String s) {
		if(s.length()==0) return 0;
		if(s.charAt(0)=='0') return 0;
		char[] c=s.toCharArray();
		int[] num=new int[c.length];
		num[0]=1;
		for(int i=1;i<s.length();i++)
		{
			if(i==1)
			{
				if(c[0]=='1'&&c[1]!='0'||c[0]=='2'&&c[1]<='6'&&c[1]>'0') num[1]=2;
                else if(c[0]>'2'&&c[1]=='0') return 0;
				else num[1]=1;
			}
			else if(c[i]=='0'&&(c[i-1]=='1'||c[i-1]=='2')) num[i]=num[i-2];
			else if((c[i]<='6'&&c[i]>='0'&&c[i-1]=='2')||c[i-1]=='1') num[i]=num[i-1]+num[i-2];
            else if(c[i]=='0') return 0;
			else num[i]=num[i-1];
		}
		return num[s.length()-1];
}
}
