package first;
import java.util.Stack;
public class p32 {
public int longestValidParentheses(String s) {
        if(s==null) return 0;
        int max=0,counter=0;
        int len=s.length();
        Stack<Integer> mystack=new Stack<Integer>();
        char ch;
        while(counter<len)
        {
        	ch=s.charAt(counter);
        	if(ch=='(') 
        	mystack.push(counter);
        	else
        	{
        		if(!mystack.isEmpty()&&s.charAt(mystack.peek())=='(')
        		{
        			mystack.pop();
        			max=Math.max(mystack.isEmpty()?counter+1:counter-mystack.peek(),max);
        		}
        		else mystack.push(counter);
        	}
        	counter++;
        }
        return max;
}
}
