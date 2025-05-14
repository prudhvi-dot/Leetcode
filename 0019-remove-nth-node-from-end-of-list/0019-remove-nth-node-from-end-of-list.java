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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = 0;

        ListNode current  = head;

        while(current!=null) {
            size++;
            current = current.next;
        }

        int count = 1;

        ListNode prev = head;

        while(count<size-n) {
            count++;
            prev = prev.next;
        }

        if(size-n==0) {
           return head.next;
        }


        if(prev!=null && prev.next!=null) {
         prev.next = prev.next.next;   
        }

        return head;
    }
}