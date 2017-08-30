package first;

public class p104 {
public int maxDepth(TreeNode root) {
        int counter=0;
        return dps(root,counter);
}
public int dps(TreeNode node,int counter)
{
	if(node==null) return counter;
	counter++;
	int a=dps(node.left,counter);
	int b=dps(node.right,counter);
	if(a>b) return a;
	else return b;
}
}
class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) { val = x; }
}