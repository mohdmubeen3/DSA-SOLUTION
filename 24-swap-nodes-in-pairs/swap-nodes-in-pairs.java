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
        ListNode temp = head;

        if(head == null || head.next == null){
            return head;
        }

        head = head.next;

              ListNode prev = null;

        while(temp != null && temp.next != null){

           ListNode nh = temp.next.next; 
           ListNode second = temp.next;        
        

            second.next = temp;
            temp.next = nh;

            if(prev != null){
                prev.next = second;
            }

            prev = temp;

            temp = nh;
        }

        return head;
    }
}