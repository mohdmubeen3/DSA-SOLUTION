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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp1 = head;
        if(head == null || head.next == null) return head;

        int cnt = 0;

        while(temp1 != null && cnt < k-1){
            temp1 = temp1.next;
            cnt++;

        }

        ListNode temp2 = head;

        int count = 0;

        while(temp2 != null){

            temp2 = temp2.next;
            count++;
        }

        cnt = 0;
        temp2 = head;

        while(temp2 != null && cnt < count - k ){

            temp2 = temp2.next;
            cnt++;

        }

        int temp = temp1.val;
        temp1.val = temp2.val;
        temp2.val = temp;

        return head;

        
    }
}