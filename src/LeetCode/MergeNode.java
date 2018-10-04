/**
 * 
 */
package LeetCode;

import javax.swing.plaf.synth.SynthScrollBarUI;

/**
 * @author searphimlyx
 *
 */
public class MergeNode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1 = null;
		ListNode l11 = new ListNode(1);
		ListNode l12 = new ListNode(2);
		ListNode l13 = new ListNode(4);
		l11.next = l12;
//		l12.next = l13;
		ListNode l2 = null;
		ListNode l21 = new ListNode(3);
		ListNode l22 = new ListNode(4);
		ListNode l23 = new ListNode(4);
		l21.next = l22;
//		l22.next = l23;
		MergeNode mn = new MergeNode();
		ListNode l = mn.mergeTwoLists(l1, l2);
		while(true) {
			System.out.println(l.val);
			if(l.next == null) break;
			l = l.next;
			
		}

	}

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//		System.out.println(l1.val + ":" + l2.val);
		if(l1 == null && l2 == null) return l1;
		if(l1 == null) return l2;
		if(l2 == null) return l1;
		ListNode node = null;
		ListNode root = null;
		root = l1.val < l2.val ? l1 : l2;

		
		if (l1.val < l2.val) {
			if(l1.next != null)
				node = mergeTwoLists(l1.next, l2);
			else node = l2;
		} else {
			if(l2.next!=null)
				node = mergeTwoLists(l1,l2.next);
			else
				node = l1;
		}
//		System.out.println(root.val +":" +node.val);
		root.next = node;

		return root;
	}

	private static class ListNode {
		int val;

		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
}
