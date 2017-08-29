package first;

public class p547 {
	int[] id;
	int count;
public int findCircleNum(int[][] M) {
        int len=M.length,wid=M[0].length;
        id=new int[len];
        count=len;
        for(int i=0;i<len;i++)
        id[i]=i;
        for(int i=0;i<len;i++)
        	for(int j=0;j<wid;j++)
        	{
        		if(j==i);
        		else if(M[i][j]==1&&!isConnected(i,j))
        		union(i,j);
        	}
        return count;
}
public boolean isConnected(int p,int q)
{
	return find(p)==find(q);
}
public int find(int p)
{
	while(p!=id[p])
	p=id[p];
	return p;
}
public void union(int p,int q)
{
	int a=find(p);
	int b=find(q);
	if(a==b) return;
	else
	{
		id[a]=b;
		count--;
	}
}
}
