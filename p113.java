package first;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;
public class p113 {
public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        List<Integer>temp=new ArrayList<Integer>();
        if(root==null)return result;
        DFS(result,temp,root,sum);
        return result;
    }
void DFS(List<List<Integer>> result,List<Integer> temp,TreeNode root,int sum)
{
	if(root.left==null&&root.right==null) 
	{
		temp.add(root.val);
		if(pathSum(temp)==sum)
			result.add(new ArrayList(temp));
		temp.remove(temp.size()-1);
		return;
	}
	else
	{
		temp.add(root.val);
		DFS(result,temp,root.left,sum);
		DFS(result,temp,root.right,sum);
		temp.remove(temp.size()-1);
	}
}
int pathSum(List<Integer> temp)
{
	int sum=0;
	for(int i=0;i<temp.size();i++)
	{
		sum+=temp.get(i);
	}
	return sum;
}

}
class TreeNode {
	     int val;
	     TreeNode left;
	     TreeNode right;
	     TreeNode(int x) { val = x; }
	  }
