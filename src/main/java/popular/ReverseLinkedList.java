package popular;

import utils.ListNode;

/**
 * Easy
 * <p>
 * Given the head of a singly linked list, reverse the list, and return the reversed list.
 * <p>
 * Example 1:
 * <p>
 * Input: head = [1,2,3,4,5]
 * <p>
 * Output: [5,4,3,2,1]
 * <p>
 * Example 2:
 * <p>
 * Input: head = [1,2]
 * <p>
 * Output: [2,1]
 * <p>
 * Example 3:
 * <p>
 * Input: head = []
 * <p>
 * Output: []
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the list is the range [0, 5000].
 * -5000 <= Node.val <= 5000
 */
public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        ListNode previous = null;
        ListNode currernt = head;
        while (currernt != null) {
            ListNode next = currernt.next;
            currernt.next = previous;
            previous = currernt;
            currernt = next;
        }
        return previous;
    }

}
