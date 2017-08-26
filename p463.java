package first;

public class p463 {
public int islandPerimeter(int[][] grid) {
	int chang=grid.length;
	int kuan=grid[0].length;
	int sum=0;
	for(int i=0;i<chang;i++)
	{
		for(int j=0;j<kuan;j++)
		{
			if(grid[i][j]!=0)
			{
				if(i==0||grid[i-1][j]==0)sum++;
				if(i==chang-1||grid[i+1][j]==0)sum++;
				if(j==0||grid[i][j-1]==0)sum++;
				if(j==kuan-1||grid[i][j+1]==0)sum++;				
			}
		}
	}
	return sum;
}
}
