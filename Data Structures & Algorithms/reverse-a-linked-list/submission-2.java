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
        // 1. we need two pointers, one that points to the previous
        ListNode prev = null;
        // one for the current node
        ListNode curr = head;

        // 2. while the current node is not null
        while(curr != null) {
        // 2.1. save curr.next to temp ptr
            ListNode temp = curr.next;
        // 2.2. we point current's .next to prev.
            curr.next = prev;
        // - doing this removes our connection to the next node, so we have a temporary ptr
        // 2.3 move prev to current (traverse once in the linked list)
            prev = curr;
        // 2.4. move current to current.next aka temp
            curr = temp;
        }

        // when done, return prev because it isn't null and it contains the head
        return prev;
       
    }
}
