/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;
        ListNode temp = head;
        int len = 0;

        while(temp != null){
            len++;
            temp = temp.next;
        }

        k = k % len;
        if (k == 0) return head;

        int size = len-k;
        ListNode newTail = head;
        for(int i=1;i<size;i++){
            newTail = newTail.next;
        }

        ListNode newHead = newTail.next;
        newTail.next = null;

        ListNode oldTail = newHead;
        while(oldTail.next != null){
            oldTail = oldTail.next;
        }
        oldTail.next = head;
        return newHead;
    }
}