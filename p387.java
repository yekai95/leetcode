package first;

public class p387 {
public int firstUniqChar(String s) {
	int judge[]=new int[26];
	for(int i=0;i<s.length();i++)
	{
		judge[s.charAt(i)-'a']++;
	}
	for(int i=0;i<s.length();i++)
	{
		if(judge[s.charAt(i)-'a']==1)
		return i;
	}
	return -1;
}
}
