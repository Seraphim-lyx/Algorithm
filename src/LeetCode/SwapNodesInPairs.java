package LeetCode;

import java.util.List;

public class SwapNodesInPairs {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        SwapNodesInPairs.swapPairs(node1);
    }

    public static ListNode swapPairs(ListNode head) {

        ListNode node = null;
        if(head != null && head.next != null){
            node = head.next;
            head.next = swapPairs(node.next);
            node.next = head;
        }
        return node == null ? head : node;
    }


    private static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
  }
}
