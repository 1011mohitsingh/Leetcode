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
    public ListNode swapPairs(ListNode head) {
        if(head == null){
            return null;
        }
        if(head.next == null){
            return head;
        }
        ListNode dummy = new ListNode(-1);
        ListNode prev = head;
        ListNode curr = head.next;
        dummy.next = curr;
        ListNode before = dummy;
        while(prev != null && prev.next != null){
            before.next = curr;
            ListNode nextStart = curr.next;
            curr.next = prev;
            prev.next = nextStart;

            before = prev;
            prev = nextStart;
            curr = (prev == null) ? null : prev.next; 
        }
        return dummy.next;
    }
}