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
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode oddStart = head;
        ListNode evenStart = head.next;
        ListNode evenHead = evenStart;

        while(evenStart != null && evenStart.next != null){
            oddStart.next = evenStart.next;
            oddStart = oddStart.next;
            evenStart.next = oddStart.next;
            evenStart = evenStart.next;
        }
        oddStart.next = evenHead;
        return head;
    }
}