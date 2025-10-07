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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;

        ListNode dummyNode = new ListNode(-1);
        ListNode ptr = dummyNode;
        ListNode temp = head;
        ListNode forward = head.next;
        while(forward != null){
            if(temp.val != forward.val){
                ptr.next = temp;
                ptr = ptr.next;
                temp = temp.next;
                forward = forward.next;
            } else {
                while (forward != null && temp.val == forward.val) {
                    forward = forward.next;
                }
                ptr.next = temp;
                ptr = ptr.next;
                temp = forward;
                if(forward != null){
                    forward = forward.next;
                }
            }
        }
        if(temp != null){
            ptr.next = temp;
            ptr = ptr.next;
        }
        ptr.next = null;
        return dummyNode.next;
    }
}