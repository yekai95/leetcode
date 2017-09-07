package first;

public class p108 {
public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0) return null;
        return sortedArrayToBST(nums,0,nums.length-1);
}
public TreeNode sortedArrayToBST(int[]nums,int start,int end)
{
	if(start>end) return null;
	int mid=(start+end)/2;
	TreeNode tr=new TreeNode(nums[mid]);
	tr.left=sortedArrayToBST(nums,start,mid-1);
	tr.right=sortedArrayToBST(nums,mid+1,end);
	return tr;
}
}
