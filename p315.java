package first;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class p315 {
public List<Integer> countSmaller(int[] nums) {
	Integer[] ans=new Integer[nums.length];
	Node root=null;
	for(int i=nums.length-1;i>=0;i--)
	{
		root=insert(nums[i],root,ans,i,0);
	}
	return Arrays.asList(ans);
}
public Node insert(int num,Node node,Integer[] ans,int i,int preSum)
{
	if(node==null)
	{
		node=new Node(num);
		ans[i]=preSum;
	}
	else if(node.val==num)
	{
		node.dup++;
		ans[i]=preSum+node.leftsum;
	}
	else if(node.val>num)
	{
		node.leftsum++;
		node.left=insert(num,node.left,ans,i,preSum);
	}
	else
	node.right=insert(num,node.right,ans,i,preSum+node.dup+node.leftsum);
	return node;
}
class Node
{
	Node left,right;
	int val,leftsum,dup=1;
	public Node(int v)
	{
		val=v;
	}
}
}
