package first;

public class p344 {
public String reverseString(String s) {
	if(s==null) return null;
	int len=s.length();
	char[] c=s.toCharArray();
	char temp;
	for(int i=0;i<len/2;i++)
	{
		temp=c[i];
		c[i]=c[len-1-i];
		c[len-1-i]=temp;
	}
	return String.valueOf(c);
}

}
