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
 * The number of nodes in the list is in the range [1, 105].
 * 0 <= Node.val <= 9
 */
public class PaliandromeList {

    public static void main(String[] args) throws Exception {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        ;
        System.out.println(new PaliandromeList().isPalindrome(node));
    }

    public boolean isPalindrome(ListNode head) {
        int len = 0;
        ListNode right = head;
        // Culculate the length
        while (right != null) {
            right = right.next;
            len++;
        }
        // Reverse the right half of the list
        len = len / 2;
        right = head;
        for (int i = 0; i < len; i++) {
            right = right.next;
        }
        ListNode prev = null;
        while (right != null) {
            ListNode next = right.next;
            right.next = prev;
            prev = right;
            right = next;
        }
        // Compare left half and right half
        for (int i = 0; i < len; i++) {
            if (prev != null && head.val == prev.val) {
                head = head.next;
                prev = prev.next;
            } else {
                return false;
            }
        }
        return true;
    }

}
