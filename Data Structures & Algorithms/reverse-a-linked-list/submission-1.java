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
        // edge case: head is null
        if (head == null) {
            return null;
        }
        // 1. initialize stack containing list of values Stack;
        Stack<Integer> stk = new Stack<Integer>();
        ListNode ptr = head;

        // 2. while performing DFS on the original linked-list
        while (ptr != null) {
            // 2.1 int currValue = currNode.value
            int currValue = ptr.val;
            // 2.2. append currValue to stack
            stk.push(currValue);
            ptr = ptr.next;
        }
        System.out.println("Stack: " + stk);
        // 3. create new ListNode head for reversed ListNode reverseHead
        ListNode reverseHead = new ListNode();
        ptr = reverseHead; // reuse our ListNode ptr, point to newHead

        // 4. while Stack is not empty
        while (!stk.isEmpty()) {
            // Set current listnode ptr's value to whatever's on current index, use pop to get last
            int popped = stk.pop();
            System.out.println("Popped: " + popped);
            System.out.println("Stack: " + stk);
            ptr.val = popped;
            if(!stk.isEmpty()) {
                ptr.next = new ListNode();
                ptr = ptr.next;
            }
        }

        // return reverseHead
        return reverseHead;
    }
}
