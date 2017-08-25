package first;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.LinkedList;
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class p515 {
public List<Integer> largestValues(TreeNode root) {
        List<Integer> mylist=new ArrayList<Integer>();
        Queue<TreeNode> myqueue=new LinkedList<TreeNode>();
        if(root!=null) myqueue.add(root);
        while(!myqueue.isEmpty())
        {
        	int size=myqueue.size();
        	int maxval=Integer.MIN_VALUE;
        	for(int j=0;j<size;j++)
        	{
        		TreeNode thisnode=myqueue.poll();
        		if(thisnode.val>maxval)
        		maxval=thisnode.val;
        		if(thisnode.left!=null)
        		myqueue.add(thisnode.left);
        		if(thisnode.right!=null)
        		myqueue.add(thisnode.right);
        	}
        	mylist.add(maxval);
        }
        return mylist;
    }

}
