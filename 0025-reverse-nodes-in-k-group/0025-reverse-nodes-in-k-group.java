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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || k == 1) return head;
        ListNode temp = head;
        int count = 0;
        while(temp != null){
            count++;
            temp =  temp.next;
        }
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prevGroupEnd = dummy;

        while(count >= k){
            ListNode prev = null;
            ListNode curr = prevGroupEnd.next;
            ListNode next = null;

            for(int i=0;i<k;i++){
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            ListNode groupStart = prevGroupEnd.next;
            prevGroupEnd.next = prev;
            groupStart.next = curr;
            prevGroupEnd = groupStart;
            count = count-k;
        }
        return dummy.next;
    }
}