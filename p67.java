package first;

public class p67 {
public static void main(String args[])
{
	p67 p=new p67();
	String s=p.addBinary("11","1");
	System.out.println(s);
}
public String addBinary(String a, String b) {
		int len1=a.length();
		int len2=b.length();
		int carry=0,result;
		if(len1<len2) return addBinary(b,a);
		if(len2==0) return a;
		char[] c=a.toCharArray();
		System.out.println(c);
		for(int i=len1-1;i>=0;i--)
		{
			if(i>=len1-len2) 
			result=a.charAt(i)-'0'+b.charAt(i-len1+len2)-'0'+carry;
			else result=a.charAt(i)-'0'+carry;
			if(result==0);
			else if(result==1)
			{
				c[i]='1';
				carry=0;
			}
			else if(result==2)
			{
				c[i]='0';
				carry=1;
			}
			else
			{
				c[i]='1';
				carry=1;
			}
		}
		if(carry!=1) return String.valueOf(c);
		else
		{
			String s="1"+String.valueOf(c);
			return s;
		}
}
}
