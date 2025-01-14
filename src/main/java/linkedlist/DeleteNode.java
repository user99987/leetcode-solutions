package linkedlist;

import utils.ListNode;

/**
 * Easy
 * <p>
 * Write a function to delete a node in a singly-linked list. You will not be given access to the head of the list, instead you will be given access to the node to be deleted directly.
 * <p>
 * It is guaranteed that the node to be deleted is not a tail node in the list.
 * <p>
 * Example 1:
 * <p>
 * <p>
 * <p>
 * Input: head = [4,5,1,9], node = 5
 * <p>
 * Output: [4,1,9]
 * <p>
 * Explanation: You are given the second node with value 5, the linked list should become 4 -> 1 -> 9 after calling your function.
 * <p>
 * Example 2:
 * <p>
 * <p>
 * <p>
 * Input: head = [4,5,1,9], node = 1
 * <p>
 * Output: [4,5,9]
 * <p>
 * Explanation: You are given the third node with value 1, the linked list should become 4 -> 5 -> 9 after calling your function.
 * <p>
 * Example 3:
 * <p>
 * Input: head = [1,2,3,4], node = 3
 * <p>
 * Output: [1,2,4]
 * <p>
 * Example 4:
 * <p>
 * Input: head = [0,1], node = 0
 * <p>
 * Output: [1]
 * <p>
 * Example 5:
 * <p>
 * Input: head = [-3,5,-99], node = -3
 * <p>
 * Output: [5,-99]
 * <p>
 * Constraints:
 * <p>
 * The number of the nodes in the given list is in the range [2, 1000].
 * -1000 <= Node.val <= 1000
 * The value of each node in the list is unique.
 * The node to be deleted is in the list and is not a tail node
 */
public class DeleteNode {

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);
        new DeleteNode().deleteNode(node.next.next);
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }

    public void deleteNode(ListNode node) {
        while (node.next.next != null) {
            node.val = node.next.val;
            node = node.next;
        }
        node.val = node.next.val;
        node.next = null;
    }

}
