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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        /*
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        while (temp1 != null) {
            arr.add(temp1.val);
            temp1 = temp1.next;
        }
        while (temp2 != null) {
            arr.add(temp2.val);
            temp2 = temp2.next;
        }
        Collections.sort(arr);
        ListNode dummyNode = new ListNode(-1);
        ListNode temp = dummyNode;
        for (int i = 0; i < arr.size(); i++) {
            temp.next = new ListNode(arr.get(i));
            temp = temp.next;
        }
        return dummyNode.next;
        */

        ListNode temp1 = list1;
        ListNode temp2 = list2;
        ListNode dummy = new ListNode(-1);
        ListNode dummyNext = dummy;
        while (temp1 != null && temp2 != null) {
            if (temp1.val < temp2.val) {
                dummyNext.next = temp1;
                dummyNext = dummyNext.next;
                temp1 = temp1.next;
            } else {
                dummyNext.next = temp2;
                dummyNext = dummyNext.next;
                temp2 = temp2.next;
            }
        }
        if (temp1 != null) {
            dummyNext.next = temp1;
        } else {
            dummyNext.next = temp2;
        }
        return dummy.next;
    }
}