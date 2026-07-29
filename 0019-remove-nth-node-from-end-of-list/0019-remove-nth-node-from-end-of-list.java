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
       /*
        if (head == null) {
            return head;
        }
        ListNode temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        if (count == n) {
            head = head.next;
            return head;
        }
        int move = count - n;
        temp = head;
        while (temp != null) {
            move--;
            if (move == 0)
                break;

            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
        */

        if(head==null){
            return head;
        }
        ListNode fastp=head;
        ListNode slowp=head;
        for(int i=0;i<n;i++){
            fastp=fastp.next;
        }
        if(fastp==null){
            return head.next;
        }
        while(fastp.next!=null){
            fastp=fastp.next;
            slowp=slowp.next;
        }
        slowp.next=slowp.next.next;

        return head;
    }
}