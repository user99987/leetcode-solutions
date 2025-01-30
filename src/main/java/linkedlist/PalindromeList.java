package linkedlist;

import utils.ListNode;

/**
 * Easy
 * <p>
 * Given the head of a singly linked list, return true if it is a palindrome.
 * <p>
 * Example 1:
 * <p>
 * Input: head = [1,2,2,1]
 * <p>
 * Output: true
 * <p>
 * Example 2:
 * <p>
 * Input: head = [1,2]
 * <p>
 * Output: false
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the list is in the range [1, 10^5].
 * 0 <= Node.val <= 9
 */
public class PalindromeList {

    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }

        ListNode slow = head, fast = head, prev = null;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            ListNode next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }

        if (fast != null) {
            slow = slow.next;
        }

        while (prev != null) {
            if (prev.value != slow.value) {
                return false;
            }
            prev = prev.next;
            slow = slow.next;
        }

        return true;
    }

}
