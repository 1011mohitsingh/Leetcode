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
    public ListNode findMiddle(ListNode head){
        if(head == null || head.next == null){
            return head;
        }

        ListNode slow = head;
        ListNode fast = head;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode mergeTwoSortedLinkedList(ListNode list1, ListNode list2){
        ListNode dummyNode = new ListNode(-1);
        ListNode temp = dummyNode;

        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                temp.next = list1;
                list1 = list1.next;
            } else {
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
        }

        if(list1 != null){
            temp.next = list1;
        } else {
            temp.next = list2;
        }
        return dummyNode.next;

    }
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode mid = findMiddle(head);

        ListNode right = mid.next;
        mid.next = null;
        ListNode left = head;

        left = sortList(left);
        right = sortList(right);
        return mergeTwoSortedLinkedList(left, right);
    }
}


// class Solution {
// public ListNode sortList(ListNode head) {
//         PriorityQueue<Integer> pq = new PriorityQueue<>();
//         ListNode temp = head;
//         while(temp != null){
//             pq.add(temp.val);
//             temp = temp.next;
//         }
//         ListNode dummy = new ListNode(0);
//         ListNode curr = dummy;
//         while(!pq.isEmpty()){
//             curr.next = new ListNode(pq.poll());
//             curr = curr.next;
//         }
//         return dummy.next;
//     }
// }