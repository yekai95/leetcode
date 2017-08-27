package first;
import java.util.LinkedList;


public class p109 {
	public TreeNode sortedListToBST(ListNode head) {
		if(head==null) return null;
        return build(head,null);
}
TreeNode build(ListNode begin,ListNode end)
{
	if(begin==end)return null;
	ListNode fast=begin;
	ListNode slow=begin;
	while(fast!=end&&fast.next!=end)
	{
		fast=fast.next.next;
		slow=slow.next;
	}
	TreeNode root=new TreeNode(slow.val);
	root.left=build(begin,slow);
	root.right=build(slow.next,end);
	return root;
	
}
}
class ListNode {
	 int val;
	 ListNode next;
	 ListNode(int x) { val = x; }
}
class TreeNode {
	 int val;
	 TreeNode left;
	 TreeNode right;
	 TreeNode(int x) { val = x; }
}