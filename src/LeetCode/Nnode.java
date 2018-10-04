/**
 * 
 */
package LeetCode;

import javax.swing.plaf.synth.SynthScrollBarUI;

/**
 * @author searphimlyx
 *
 */
public class Nnode {

	/**
	 * @param args
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);
		ListNode l4 = new ListNode(4);
		ListNode l5 = new ListNode(5);
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l5;
		Nnode n = new Nnode();
		ListNode l = n.removeNthFromEnd(l1, 5);
		while(true) {
			System.out.println(l.val);
			if(l.next!=null)
				l = l.next;
			else break;
		}
	}

	private static class ListNode {
		int val;

		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode removeNthFromEnd(ListNode head, int n) {
		Integer count = getLastNode(head, n);
		if(n == count+1) {
			head = head.next;
		}
		return head;
	}

	public Integer getLastNode(ListNode head, int n) {
		if (head.next != null) {
			Integer count = getLastNode(head.next,n)+1;
			if(count == n) head.next = head.next.next;
			return count;
		}
		return 0;
	}
}
