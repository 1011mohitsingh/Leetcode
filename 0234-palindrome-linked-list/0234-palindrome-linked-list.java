class Solution {
    public ListNode findMid(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) return true;

        ListNode midNode = findMid(head);

        ListNode prev = null;
        ListNode curr = midNode;
        ListNode next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        ListNode left = head;
        ListNode right = prev;

        while(right != null){
            if(left.val != right.val){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
}



// class Solution {
//     public boolean isPalindrome(ListNode head) {
//         Stack<Integer> st = new Stack<>();

//         int count = 0;
//         ListNode temp = head;
//         while (temp != null) {
//             count++;
//             temp = temp.next;
//         }

//         temp = head;
//         for (int i = 0; i < count / 2; i++) {
//             st.push(temp.val);
//             temp = temp.next;
//         }

//         if (count % 2 != 0) {
//             temp = temp.next;
//         }

//         while (temp != null) {
//             if (st.pop() != temp.val) {
//                 return false;
//             }
//             temp = temp.next;
//         }

//         return true;
//     }
// }


// class Solution {
//     public boolean isPalindrome(ListNode head) {
//         Stack<Integer> st = new Stack<>();
//         ListNode temp = head;

//         while(temp != null){
//             st.push(temp.val);
//             temp = temp.next;
//         }

//         temp = head;
//         while(temp != null){
//             if(temp.val != st.pop()){
//                 return false;
//             }
//             temp = temp.next;
//         }
//         return true;
//     }
// }