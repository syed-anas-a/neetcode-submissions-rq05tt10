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
    public ListNode removeElements(ListNode head, int val) {
        if(head == null) return head;
        ListNode temp = head;
        while(temp != null && temp.next != null) {
            if(head.val == val) {
                head = head.next;
                temp = head;
                continue;
            }
            if(temp.next.val == val) {
                ListNode node = temp.next;
                while(node.next != null && node.val == val) {
                    node = node.next;
                }
                if(node.next == null && node.val == val) {
                    temp.next = null;
                    break;
                }
                temp.next = node;
            }
            temp = temp.next;
        }
        if(head.val == val) return null;
        return head;
    }
}