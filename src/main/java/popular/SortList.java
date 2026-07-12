package popular;

import utils.ListNode;

/**
 * Medium
 * <p>
 * Given the head of a linked list, return the list after sorting it in ascending order.
 * <p>
 * Example 1:
 * <p>
 * Input: head = [4,2,1,3]
 * <p>
 * Output: [1,2,3,4]
 * <p>
 * Example 2:
 * <p>
 * Input: head = [-1,5,3,4,0]
 * <p>
 * Output: [-1,0,3,4,5]
 * <p>
 * Example 3:
 * <p>
 * Input: head = []
 * <p>
 * Output: []
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the list is in the range [0, 5 * 104].
 * -105 <= Node.val <= 105
 */
public class SortList {

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode middle = split(head);
        ListNode left = sortList(head);
        ListNode right = sortList(middle);
        return merge(left, right);
    }

    private ListNode split(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode middle = slow.next;
        slow.next = null;
        return middle;
    }

    private ListNode merge(ListNode left, ListNode right) {
        var dummy = new ListNode();
        ListNode tail = dummy;

        while (left != null && right != null) {
            if (left.value <= right.value) {
                tail.next = left;
                left = left.next;
            } else {
                tail.next = right;
                right = right.next;
            }
            tail = tail.next;
        }

        tail.next = left != null ? left : right;
        return dummy.next;
    }
}
