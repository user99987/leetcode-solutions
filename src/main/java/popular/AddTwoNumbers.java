package popular;

import utils.ListNode;

/**
 * Medium
 * <p>
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
 * <p>
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * <p>
 * Example 1:
 * <p>
 * Input: l1 = [2,4,3], l2 = [5,6,4]
 * <p>
 * Output: [7,0,8]
 * <p>
 * Explanation: 342 + 465 = 807.
 * <p>
 * Example 2:
 * <p>
 * Input: l1 = [0], l2 = [0]
 * <p>
 * Output: [0]
 * <p>
 * Example 3:
 * <p>
 * Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
 * <p>
 * Output: [8,9,9,9,0,0,0,1]
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in each linked list is in the range [1, 100].
 * 0 <= Node.val <= 9
 * It is guaranteed that the list represents a number that does not have leading zeros.
 * To solve the Add Two Numbers problem in Java using a Solution class, we'll follow these steps:
 * <p>
 * Define a ListNode class to represent nodes in a linked list.
 * Define a Solution class with a method named addTwoNumbers.
 * Inside the addTwoNumbers method, traverse both input linked lists simultaneously:
 * Keep track of a carry variable to handle cases where the sum of two digits exceeds 9.
 * Calculate the sum of the current nodes' values along with the carry.
 * Update the carry for the next iteration.
 * Create a new node with the sum % 10 and attach it to the result linked list.
 * Move to the next nodes in both input lists.
 * After finishing the traversal, check if there is any remaining carry. If so, add a new node with the carry to the result.
 * Return the head of the result linked list.
 */
public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();
        ListNode current = dummy;
        int carry = 0;

        while (l1 != null || l2 != null || carry > 0) {
            if (l1 != null) {
                carry += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                carry += l2.val;
                l2 = l2.next;
            }
            current.next = new ListNode(carry % 10);
            current = current.next;
            carry /= 10;
        }

        return dummy.next;
    }

}
