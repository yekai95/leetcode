package first;
import java.util.List;
import java.util.ArrayList;
public class p22 {
public List<String> generateParenthesis(int n) {
        ArrayList<String> arr=new ArrayList<String>();
        int left=n;
        int right=n;
        String s="";
        generateParenthesis(arr,s,left,right);     
        return arr;
}
public void generateParenthesis(List<String> l,String s,int left,int right)
{
		if(left==0&&right==0)
		l.add(s);
		if(left>0)
		generateParenthesis(l,s+'(',left-1,right);
		if(right>0&&right>left)
		generateParenthesis(l,s+')',left,right-1);
}	 
}
