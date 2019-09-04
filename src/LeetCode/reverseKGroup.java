package LeetCode;

public class reverseKGroup {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        ListNode n = reverseKGroup.reverseKGroup(l1, 2);

    }

    public static ListNode reverseKGroup(ListNode head, int k){
        return swap(head, head, k, k);
    }

    private static ListNode swap(ListNode head, ListNode node, int k, int total) {
        if (k == 1) {
            head.next = swap(node.next, node.next, total, total);
            return node;
        }
        if (node.next == null){
            return null;
        }
        ListNode newHead = swap(head, node.next, k - 1, total);

        if (newHead != null){

            if(k == total){
                newHead.next.next = head;
            }else {
                node.next.next = node;
            }
        }
        return newHead == null? head:newHead;
    }



    private static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
