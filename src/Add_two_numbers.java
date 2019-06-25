
/*
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example:

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.
 */
public class Add_two_numbers {
	
	/**
	 * Definition for singly-linked list.
	 * public class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode(int x) { val = x; }
	 * }
	 */
	    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	        
	        ListNode l3 = new ListNode(0);
	        ListNode p3 = l3;
	        int y =0;
	        
	        while (l2 != null & l1 != null)
	        {
	            int x = l1.val + l2.val + y;
	            int val = x %10;
	            y = x/10;
	            p3.next = new ListNode(val);
	            p3 = p3.next;
	            l2 = l2.next;
	            l1 = l1.next;
	            
	        }
	        
	        while(l1 != null){
	            int x = l1.val + y;
	            int val = x % 10;
	            y = x /10;
	            p3.next = new ListNode(val);
	            p3 = p3.next;
	            l1 = l1.next;
	        }
	        while(l2 != null)
	        {
	            int x = l2.val + y;
	            int val = x % 10;
	            y = x /10;
	            p3.next = new ListNode(val);
	            p3 = p3.next;
	            l2 = l2.next;
	        }
	        if ( y != 0){
	            p3.next = new ListNode(y);
	        }
	        
	        return l3.next;
	        
	        
	    }
	}


