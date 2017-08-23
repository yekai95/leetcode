package first;
import java.util.Stack;
public class p155 {
	Stack<Integer> normals=new Stack<Integer>();
	Stack<Integer> mins=new Stack<Integer>();
	public p155() {
        
    }
    
    public void push(int x) {
    	if(mins.isEmpty()||x<=mins.peek())
        mins.push(x);
        normals.push(x);
    }
    
    public void pop() {
        if(mins.peek().equals(normals.peek()))
        mins.pop();
        normals.pop();
    }
    
    public int top() {
        return normals.peek();
    }
    
    public int getMin() {
        return mins.peek();
    }
}
