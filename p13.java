package first;
import java.util.HashMap;
public class p13 {
public int romanToInt(String s) {
      HashMap<Character,Integer> h=new HashMap<Character,Integer>();
      h.put('I', 1);
      h.put('V', 5);
      h.put('X', 10);
      h.put('L', 50);
      h.put('C', 100);
      h.put('D', 500);
      h.put('M', 1000);
      int sum=0;
      int i;
      for(i=0;i<s.length()-1;i++)
      {
    	  if(h.get(s.charAt(i))<h.get(s.charAt(i+1)))
    	  sum-=h.get(s.charAt(i));
    	  else if(h.get(s.charAt(i))>=h.get(s.charAt(i+1)))
    	  sum+=h.get(s.charAt(i));
      }
      sum+=h.get(s.charAt(i));
      return sum;	
}
}
