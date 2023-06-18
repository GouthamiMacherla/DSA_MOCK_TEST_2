/*
 * 
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.


Example 1:

Input: l1 = [2,4,3], l2 = [5,6,4] Output: [7,0,8]
Explanation: 342 + 465 = 807.

Example 2:

Input: l1 = [0], l2 = [0] Output: [0]

Example 3:

Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9] Output: [8,9,9,9,0,0,0,1] 
 * 
 * 
 * 
 * 
 * 
 * gouthami.504@gmail.com
 * 
 *
 * 
 * 
 * 
 */


package in.ineuron.ai;


class ListNode
{
	int val;
	ListNode next;
	
	ListNode(int val)
	{
		this.val = val;
	}
}
public class AddTwoNumbers {
	
	public  ListNode addTwoNumbers(ListNode l1 , ListNode l2)
	{
		ListNode head =new ListNode(0);
		ListNode current = head;
		int carry = 0;
		
		while(l1 != null || l2 != null)
		{
			int sum = carry;
			if(l1 != null)
			{
				sum += l1.val;
				l1 = l1.next;
			}
			
			if(l2 != null)
			{
				sum += l2.val;
				l2 = l2.next;
			}
			
			current.next = new ListNode(sum % 10);
			carry = sum / 10;
			current = current.next;
		}
		
		if( carry > 0)
		{
			current.next = new ListNode(carry);
		}
		
		return head.next;
	}

	public static void main(String[] args) 
	{
		// Example 1:
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        AddTwoNumbers solution = new AddTwoNumbers();
        ListNode result1 = solution.addTwoNumbers(l1, l2);
        printLinkedList(result1); // Output: [7, 0, 8]

        // Example 2:
        ListNode l3 = new ListNode(0);
        ListNode l4 = new ListNode(0);
        ListNode result2 = solution.addTwoNumbers(l3, l4);
        printLinkedList(result2); // Output: [0]

        // Example 3:
        ListNode l5 = new ListNode(9);
        l5.next = new ListNode(9);
        l5.next.next = new ListNode(9);
        l5.next.next.next = new ListNode(9);
        l5.next.next.next.next = new ListNode(9);
        l5.next.next.next.next.next = new ListNode(9);
        l5.next.next.next.next.next.next = new ListNode(9);

        ListNode l6 = new ListNode(9);
        l6.next = new ListNode(9);
        l6.next.next = new ListNode(9);
        l6.next.next.next = new ListNode(9);

        ListNode result3 = solution.addTwoNumbers(l5, l6);
        printLinkedList(result3); // Output: [8, 9, 9, 9, 0, 0, 0, 1]
    }

    // Utility method to print the values of a linked list
    private static void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}
