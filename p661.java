package first;

public class p661 {
public int[][] imageSmoother(int[][] M) {
			int length=M.length;
			int width=M[0].length;
			int [][] newm=new int[length][width];
			int sum=0;
			for(int i=0;i<length;i++)
			{
				for(int j=0;j<width;j++)
				{
					sum=M[i][j];
					int count=1;
					if(i-1>=0)
					{
						sum+=M[i-1][j];
						count++;
						if(j-1>=0)
						{
							sum+=M[i-1][j-1];
							count++;
						}
						if(j<=width-2)
						{
							sum+=M[i-1][j+1];
							count++;
						}
					}
					if(j-1>=0)
					{
						sum+=M[i][j-1];
						count++;
					}
					if(j<width-1)
					{
						sum+=M[i][j+1];
						count++;
					}
					if(i<length-1)
					{
						sum+=M[i+1][j];
						count++;
						if(j-1>=0)
						{
							sum+=M[i+1][j-1];
							count++;
						}
						if(j<width-1)
						{
							sum+=M[i+1][j+1];
							count++;
						}
					}
					newm[i][j]=sum/count;
				}
			}
			return newm;
}
	
}
