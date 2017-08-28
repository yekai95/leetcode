package first;

public class p38 {
public String countAndSay(int n) {
       if(n==1) return "1";
       String s=countAndSay(n-1)+"*";
       int counter=1,i=0;
       String ss="";
       for(i=0;i<s.length()-1;i++)
       {
    	   if(s.charAt(i)==s.charAt(i+1)) counter++;
    	   else 
    	   {
    		   ss=ss+counter+s.charAt(i);
    		   counter=1;
    	   }
       }
       return ss;
}
}
