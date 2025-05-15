/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode A = headA;
        ListNode B = headB;

        int l1 = 0;
        int l2 = 0;

        while(A!=null) {
            l1++;
            A = A.next;
        }

        while(B!=null) {
            l2++;
            B = B.next;
        }

        int diff = Math.abs(l1-l2);

        while(diff>0) {
            if(l1>l2) {
                headA = headA.next;
            }
            else {
                headB = headB.next;
            }

            diff--;
        }

        while(headA!=null) {
            if(headA==headB) {
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }

        return null;

    }
}