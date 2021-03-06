package first;

public class p328 {
	public ListNode oddEvenList(ListNode head) {  
        if(head == null || head.next == null) 
        {  
            return head;                      
        }   
        ListNode even = head.next, odd = head, evenHead = head.next;  
        while(even != null && even.next != null) 
        { 
            odd.next = even.next; 
            odd = odd.next;       
            even.next = odd.next;
            even = even.next; 
        }  
        odd.next = evenHead; 
        return head;  
}
}
class ListNode 
{
	 int val;
	 ListNode next;
	 ListNode(int x) 
	 { 
		 val = x; 
	 }
}