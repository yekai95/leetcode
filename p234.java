package first;

public class p234 {
public boolean isPalindrome(ListNode head) {
		int length=lengthOfList(head);
		Result p=isPalindromeRecurse(head,length);
		return p.result;
        
}
Result isPalindromeRecurse(ListNode head,int length)
{
	if(head==null||length<=0)
	{
		return new Result(head,true);
	}
	else if(length==1)
	return new Result(head.next,true);
	Result res=isPalindromeRecurse(head.next,length-2);
	if(!res.result||res.node==null)
	return res;
	res.result=(head.val==res.node.val);
	res.node=res.node.next;
	return res;
	
}
int lengthOfList(ListNode n)
{
	int size=0;
	while(n!=null)
	{
		size++;
		n=n.next;
	}
	return size;
}
}
class Result
{
	boolean result;
	ListNode node;
	public Result(ListNode head,boolean re)
	{
		node=head;
		result=re;
	}
}