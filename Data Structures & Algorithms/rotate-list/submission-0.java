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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || k == 0) return head;
        ListNode temp = head;
        int n = 0;
        while(temp.next != null) {
            temp = temp.next;
            n++;
        }
        n += 1;
        k = k % n;
        temp.next = head;
        ListNode prev = null; 
        temp = head;
        int c = 0;
        while(c != (n-k-1)) {
            temp = temp.next;
            c++;
        }
        head = temp.next;
        temp.next = null;
        return head;
    }
}