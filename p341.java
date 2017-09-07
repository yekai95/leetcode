package first;
import java.util.List;
import java.util.Iterator;
public class p341 {
	public class NestedIterator implements Iterator<Integer> {

	    ArrayDeque<NestedInteger> stk;
	    
	    public NestedIterator(List<NestedInteger> nestedList) {
	        stk = new ArrayDeque<NestedInteger>();
	        for(int i = nestedList.size()-1; i >= 0; i--){
	            stk.addLast(nestedList.get(i));
	        }
	    }

	    @Override
	    public Integer next() {
	        return stk.pollLast().getInteger();
	    }

	    @Override
	    public boolean hasNext() {
	        while(!stk.isEmpty()){
	            NestedInteger cur = stk.peekLast();
	            if(cur.isInteger()){
	                return true;
	            }
	            List<NestedInteger> list = stk.pollLast().getList();
	            for(int i=list.size()-1; i>=0; i--){
	                stk.addLast(list.get(i));
	            }
	        }
	        return false;
	    }
	}
}
interface NestedInteger {
	     public boolean isInteger();
	     public Integer getInteger();
	     public List<NestedInteger> getList();
}
