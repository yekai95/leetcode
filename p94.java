package first;
import java.util.ArrayList;
import java.util.List;
public class p94 {
public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> arr=new ArrayList<Integer>();
        return inorderTraversal(root,arr);  
}
public List<Integer> inorderTraversal(TreeNode root,List<Integer> arr)
{
	if(root==null) return arr;
	inorderTraversal(root.left,arr);
	arr.add(root.val);
	inorderTraversal(root.right,arr);
	return arr;
}
}
public class TreeNode 
{
	 int val;
	 TreeNode left;
	 TreeNode right;
	 TreeNode(int x) { val = x; }
}