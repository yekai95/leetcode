package first;
import java.util.Stack;
import java.util.List;
import java.util.LinkedList;
public class p42 {
	public int trap(int[] height) {
        Stack<Integer> heightStack = new Stack<>();
        List<Integer> indexList = new LinkedList<>();
        int length = height.length;
        int[] area = new int[length];
        for(int i = 0;i<length;i++)
        {
            if(heightStack.isEmpty())
            {
                heightStack.push(height[i]);
                indexList.add(i);
                continue;
            }
            int val = height[i];

            while(!heightStack.isEmpty())
            {
                int prev = heightStack.peek();
                if(val<prev) break;
                int prevIndex = indexList.remove(indexList.size() - 1);
                for(int j = prevIndex+1;j<i;j++){
                    area[j] = prev-height[j];
                }
                heightStack.pop();
            }
            heightStack.push(val);
            indexList.add(i);
        }
        int head;
        int headIndex;
        while(!heightStack.isEmpty())
        {
            head = heightStack.pop();
            headIndex = indexList.remove(indexList.size()-1);
            if(heightStack.isEmpty())
            break;
            int peekIndex = indexList.get(indexList.size()-1);
            for(int i = headIndex-1;i>peekIndex;i--)
            area[i] = head-height[i];
        }
        int count = 0;
        for(int i = 0;i<length;i++) 
        count += area[i];
        return count;
    }
}
