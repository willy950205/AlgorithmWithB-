package leetcode;

public class LeetCode83 {
	public ListNode deleteDuplicates(ListNode head) {
        
		ListNode cur = head;
		
		while(cur!=null) {
			int cVal = cur.val;
			ListNode next = cur.next;
			
			while(true) {
				if(next==null) {
					break;
				}
				if(next.val!=cVal) {
					break;
				}
				next=next.next;
			}
			cur.next=next;
			cur = cur.next;
			
		}
		
		while(head.next!=null) {
			System.out.println();
			head = head.next;
		}
		
		return head;		
    }
}
