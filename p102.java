package first;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
public class p102 {
public List<List<Integer>> levelOrder(TreeNode root) {
       ArrayList<List<Integer>> result=new ArrayList<List<Integer>>();
       Queue<TreeNode> myqueue=new LinkedList<TreeNode>();
       if(root==null) return result;
       myqueue.add(root);
       int size=0;
       while(!myqueue.isEmpty())
       {
    	   size=myqueue.size();
    	   ArrayList<Integer> myal=new ArrayList<Integer>();
    	   while(size>0)
    	   {
    		   TreeNode tr=myqueue.poll();
    		   myal.add(tr.val);
    		   if(tr.left!=null)
    		   myqueue.add(tr.left);
    		   if(tr.right!=null)
    		   myqueue.add(tr.right);
    		   size--;
    	   }
    	   result.add(myal);   
       }
       return result;
}
}
class TreeNode {
	  int val;
	  TreeNode left;
	  TreeNode right;
	  TreeNode(int x) { val = x; }
}