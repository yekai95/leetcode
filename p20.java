package first;
import java.util.Stack;
public class p20 {
public boolean isValid(String s) {
        Stack<Character> mystack=new Stack<Character>();
        int i=0;
        mystack.push('#');
        while(i<s.length())
        {
        	if(mystack.peek()=='('&&s.charAt(i)==')'||mystack.peek()=='['&&s.charAt(i)==']'||mystack.peek()=='{'&&s.charAt(i)=='}')
        	{
        		mystack.pop();
        		i++;
        	}
        	else 
        	{
        		mystack.push(s.charAt(i));
        		i++;
        	}
        }
        if(mystack.pop()=='#')
        return true;
        else return false;
    }
}
