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

    public ListNode middle(ListNode head){
        if(head == null || head.next == null) return head;

        ListNode slow = head;
        ListNode fast  = head;

        while(fast != null && fast.next != null ){
            slow = slow.next;
            fast = fast.next.next;
        }


        return slow;
    }

    public ListNode reverse(ListNode head){
        if(head == null || head.next == null) return head;

        ListNode front = head;
        ListNode prev = null;

        ListNode temp  = null;

        while(front != null){
            temp = front.next;
            front.next = prev;
            prev = front;

            front = temp;
        }

        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) return true;

        ListNode middle = middle(head);

        ListNode t1 = head;
        ListNode t2 = reverse(middle);

        while(t2 != null){
            if(t1.val != t2.val){
                return false;
            }

            t1 = t1.next;
            t2 = t2.next;
        }

        return true;

        
    }
}