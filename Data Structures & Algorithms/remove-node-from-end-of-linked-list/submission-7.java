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
        if(head.next == null) {
            head = null;
            return head;
        }
        int size = 0;
        ListNode temp = head;
        while(temp != null) {
            temp = temp.next;
            size++;
        }
        ListNode temp2 = head;
        if(size != n) {
            int c = 1;
            while(c < (size-n) && temp2.next != null) {
                temp2 = temp2.next;
                c++;
            }
            temp2.next = temp2.next.next;
        }
        else {
            head = head.next;
        }
        
        return head;
    }
}
