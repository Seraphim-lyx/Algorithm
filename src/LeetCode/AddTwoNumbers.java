package LeetCode;

import java.util.List;

public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode l11 = new ListNode(5);


        ListNode l21 = new ListNode(5);


        ListNode node = AddTwoNumbers.addTwoNumbers(l11, l21);
        while (true){
            System.out.println(node.val);
            if (node.next == null){
                break;
            }
            node = node.next;
        }

    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode root = new ListNode(0);
        ListNode curr = root;
        int plus = 0;
        while (true){
           int val1 = l1 != null ? l1.val : 0;
           int val2 = l2 != null ? l2.val : 0;
           int remainder = (val1 + val2 + plus) % 10;
           plus = (val1 + val2 + plus) >= 10 ? 1 : 0;
           ListNode listNode = new ListNode(remainder);
           curr.next = listNode;
           curr = listNode;
            if (l1.next == null && l2.next == null && plus == 0){
                break;
            }
           l1 = l1.next == null ? new ListNode(0) : l1.next;
           l2 = l2.next == null ? new ListNode(0) : l2.next;
       }
       return root.next;
    }

    private static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
