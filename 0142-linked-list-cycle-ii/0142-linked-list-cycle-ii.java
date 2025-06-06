/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode i = head;
        ListNode j = head;

        while(j!=null && j.next!=null) {
            i = i.next;
            j = j.next.next;

            if(i==j) {
                i = head;

                while(i!=j) {
                    i = i.next;
                    j = j.next;
                }

                return i;
            }
        }

        return null;
    }
}