package first;
public class p474 {
public int findMaxForm(String[] strs, int m, int n) {
        int[][] max=new int[m+1][n+1];
        for(String str:strs)
        {
        	int[] counts=count(str);
        	for(int i=m;i>=counts[0];i--)
        	{
        		for(int j=n;j>=counts[1];j--)
        		max[i][j]=Math.max(1+max[i-counts[0]][j-counts[1]],max[i][j]);
        	}
        }
        return max[m][n];
}
public int[] count(String str)
{
	int[] count=new int[2];
	for(int i=0;i<str.length();i++)
	count[str.charAt(i)-'0']++;
	return count;
}
}
