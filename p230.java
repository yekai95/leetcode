package first;

public class p230 {
	private TreeNode temp;  
	private int counter;  
	public int kthSmallest(TreeNode root, int k) {  
	    inorder(root, k);  
	    return temp.val;  
	}  
	public void inorder(TreeNode node, int k) 
	{  
	    if (node == null)  
	    return; 
	    inorder(node.left, k);  
	    if (++counter == k) 
	    {  
	        temp = node;  
	        return;  
	    }  
	    inorder(node.right, k);  
	}
}
class TreeNode 
{
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) { val = x; }
}