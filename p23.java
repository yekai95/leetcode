package first;
import java.util.LinkedList;
public class p23 {
	public ListNode mergeKLists(ListNode[] lists) {
		int len=lists.length;  
        if(lists==null||len==0)  
            return null;  
        if(len==1)  
            return lists[0];     
        while(len>1)
        {  
            int mid=(len+1)/2;
            for(int i=0;i<len/2;i++)  
            {  
                lists[i]=mergemerge(lists[i],lists[i+mid]);  
            }  
            len=mid;  
        }  
        return lists[0];  	
	}
	public ListNode mergemerge(ListNode node1,ListNode node2)
	{
		ListNode head;
		if(node1==null) return node2;
		else if(node1!=null&&node2==null) return node1;
		if(node1.val<node2.val)
		{
			head=node1;
			node1=node1.next;
		}
		else
		{
			head=node2;
			node2=node2.next;
		}
		ListNode curr=head;
		while(node1!=null&&node2!=null)
		{
			if(node1.val<node2.val)
			{
				curr.next=node1;
				node1=node1.next;
	            curr=curr.next;
			}
			else
			{
				curr.next=node2;
				node2=node2.next;
	            curr=curr.next;
			}
		}
		if(node1==null)
		{
			while(node2!=null)
			{
				curr.next=node2;
				node2=node2.next;
	            curr=curr.next;
			}
		}
		else
		{
			while(node1!=null)
			{
				curr.next=node1;
				node1=node1.next;
	            curr=curr.next;
			}
		}
		return head;
	}
}
class ListNode 
{
	 int val;
	 ListNode next;
	 ListNode(int x) { val = x; }
}