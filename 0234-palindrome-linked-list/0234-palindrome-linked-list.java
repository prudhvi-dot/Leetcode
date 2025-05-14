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
    public boolean isPalindrome(ListNode head) {
        ListNode i = head;
        ListNode j = head;

        while(j!=null && j.next!=null) {
            i = i.next;
            j = j.next.next;
        }

        ListNode prev = null;

        while(i!=null) {
            ListNode Next = i.next;
            i.next = prev;
            prev = i;
            i = Next;
        }

        ListNode curr = head;

        while(prev!=null && curr!=null) {
            if(prev.val!=curr.val) {
                return false;
            }

            prev = prev.next;
            curr = curr.next;
        }

        return true;
    }
}