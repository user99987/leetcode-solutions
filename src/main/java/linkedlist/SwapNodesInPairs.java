package linkedlist;

import utils.ListNode;

/**
 * Medium
 * <p>
 * Given a linked list, swap every two adjacent nodes and return its head. You must solve the problem without modifying the values in the list's nodes (i.e., only nodes themselves may be changed.)
 * <p>
 * Example 1:
 * <p>
 * <p>
 * <p>
 * Input: head = [1,2,3,4]
 * <p>
 * Output: [2,1,4,3]
 * <p>
 * Example 2:
 * <p>
 * Input: head = []
 * <p>
 * Output: []
 * <p>
 * Example 3:
 * <p>
 * Input: head = [1]
 * <p>
 * Output: [1]
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the list is in the range [0, 100].
 * 0 <= Node.val <= 100
 * To solve the “Swap Nodes in Pairs” problem in Java with a Solution class, we can traverse the linked list while swapping pairs of nodes. Here are the steps:
 * <p>
 * Define a Solution class.
 * Define a method named swapPairs that takes the head of a linked list as input and returns the head of the modified list.
 * Create a dummy ListNode object and set its next pointer to the head of the input list. This dummy node will serve as the new head of the modified list.
 * Initialize three pointers: prev, first, and second.
 * Iterate through the list while first and second are not null:
 * Assign first to the next pointer of prev.
 * Assign second to the next pointer of first.
 * Assign the next pointer of prev to the next pointer of second.
 * Assign the next pointer of second to first.
 * Move prev to first.
 * Move first to first.next (which is the next pair of nodes).
 * Return the next pointer of the dummy node, which points to the head of the modified list.
 */
public class SwapNodesInPairs {

    public static void main(String[] args) throws Exception {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);
        node.next.next.next.next = new ListNode(5);
        node.next.next.next.next.next = new ListNode(6);
        ListNode head = new SwapNodesInPairs().swapPairs(node);
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }

    public ListNode swapPairs(ListNode head) {
        // Create a dummy node and point its next to the head
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // Initialize pointers
        ListNode prev = dummy;
        ListNode first, second;

        // Swap pairs of nodes
        while (prev.next != null && prev.next.next != null) {
            first = prev.next;
            second = first.next;

            // Swap nodes
            prev.next = second;
            first.next = second.next;
            second.next = first;

            // Move prev to the next pair of nodes
            prev = first;
        }

        return dummy.next;
    }

}
