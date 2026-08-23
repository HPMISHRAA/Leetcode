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
        /*
        HashSet<ListNode> set = new HashSet<>();
        while (headA != null) {
            set.add(headA);
            headA = headA.next;
        }
        while (headB != null) {
            if (set.contains(headB)) {
                return headB;
            }
            headB = headB.next;
        }
        return null;
        */

        ListNode temp1 = headA;
        ListNode temp2 = headB;
        int count1 = 0, count2 = 0;
        while (temp1 != null) {
            count1++;
            temp1 = temp1.next;
        }
        while (temp2 != null) {
            count2++;
            temp2 = temp2.next;
        }
        if (count1 < count2) {
            return collision(headA, headB, count2 - count1);
        } else {
            return collision(headB, headA, count1 - count2);
        }
    }

    public static ListNode collision(ListNode smaller, ListNode bigger, int step) {
        ListNode temp1 = smaller;
        ListNode temp2 = bigger;
        for (int i = 0; i < step; i++) {
            temp2 = temp2.next;
        }
        while (temp1 != temp2) {
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return temp1;
    }
}