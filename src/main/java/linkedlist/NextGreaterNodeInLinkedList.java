package linkedlist;

import utils.ListNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

/**
 * Medium
 * <p>
 * You are given the head of a linked list with n nodes.
 * <p>
 * For each node in the list, find the value of the next greater node. That is, for each node, find the value of the first node that is next to it and has a strictly larger value than it.
 * <p>
 * Return an integer array answer where answer[i] is the value of the next greater node of the ith node (1-indexed). If the ith node does not have a next greater node, set answer[i] = 0.
 * <p>
 * Example 1:
 * <p>
 * Input: head = [2,1,5]
 * <p>
 * Output: [5,5,0]
 * <p>
 * Example 2:
 * <p>
 * Input: head = [2,7,4,3,5]
 * <p>
 * Output: [7,0,5,5,0]
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the list is n.
 * 1 <= n <= 10^4
 * 1 <= Node.val <= 10^9
 */
public class NextGreaterNodeInLinkedList {

    public int[] nextLargerNodes(ListNode head) {
        ArrayList<Integer> values = new ArrayList<>();
        while (head != null) {
            values.add(head.value);
            head = head.next;
        }

        int[] result = new int[values.size()];
        Deque<Integer> stack = new LinkedList<>();

        for (int i = 0; i < values.size(); i++) {
            while (!stack.isEmpty() && values.get(stack.peek()) < values.get(i)) {
                result[stack.pop()] = values.get(i);
            }
            stack.push(i);
        }

        return result;
    }

}
