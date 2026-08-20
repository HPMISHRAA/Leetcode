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
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode temp=head;
        // Using Stack
        // Stack<Integer> sc=new Stack<>();
        // while(temp!=null){
        //     // arr.add(temp.val);
        //     sc.push(temp.val);
        //     temp=temp.next;
        // }
        // temp=head;
        // while(!sc.isEmpty()){
        //     temp.val=sc.pop();
        //     temp=temp.next;
        // }

        // -------using ArrayList

        /*
        ArrayList<Integer> arr = new ArrayList<>();
        while (temp != null) {
            arr.add(temp.val);
            temp = temp.next;
        }
        temp = head;

        for (int i = arr.size() - 1; i >= 0; i--) {
            temp.val = arr.get(i);
            temp = temp.next;
        }
        return head;
        */

        
        ListNode newHead=reverseList(head.next);
        ListNode front=head.next;
        front.next=head;
        head.next=null;

        return newHead;
    }
}