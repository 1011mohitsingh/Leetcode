class Solution {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> st = new Stack<>();

        int count = 0;
        ListNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }

        temp = head;
        for (int i = 0; i < count / 2; i++) {
            st.push(temp.val);
            temp = temp.next;
        }

        if (count % 2 != 0) {
            temp = temp.next;
        }

        while (temp != null) {
            if (st.pop() != temp.val) {
                return false;
            }
            temp = temp.next;
        }

        return true;
    }
}


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