package popular;

import utils.ListNode;

/**
 * Easy
 * <p>
 * Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.
 * <p>
 * Example 1:
 * <p>
 * Input: head = [1,1,2]
 * <p>
 * Output: [1,2]
 * <p>
 * Example 2:
 * <p>
 * Input: head = [1,1,2,3,3]
 * <p>
 * Output: [1,2,3]
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the list is in the range [0, 300].
 * -100 <= Node.val <= 100
 * The list is guaranteed to be sorted in ascending order.
 */
public class RemoveDuplicates {

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode current = head;
        ListNode next = current.next;
        while (null != next) {
            if (current.val == next.val) {
                current.next = next.next;
            } else {
                current = next;
            }
            next = current.next;
        }
        return head;
    }

}
