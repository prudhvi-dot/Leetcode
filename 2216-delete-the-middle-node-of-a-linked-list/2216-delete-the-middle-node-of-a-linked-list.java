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
    public ListNode deleteMiddle(ListNode head) {
        ListNode i = head;
        ListNode j = head;

        if(head==null || head.next==null) {
            return head.next;
        }

        while(j!=null && j.next!=null) {
            i = i.next;
            j = j.next.next;
        }

        ListNode current = head;

        while(current.next!=i) {
            current = current.next;
        }

        current.next = i.next;
        return head;
    }
}