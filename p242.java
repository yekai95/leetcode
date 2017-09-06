package first;

public class p242 {
public boolean isAnagram(String s, String t) {
	if(s.length()!=t.length()) return false;
	int character[]=new int[26];
	for(int i=0;i<s.length();i++)
	{
		character[s.charAt(i)-'a']++;
	}
	for(int i=0;i<t.length();i++)
	{
		character[t.charAt(i)-'a']--;
		if(character[t.charAt(i)-'a']<0) return false;
	}
	return true;
}
}
