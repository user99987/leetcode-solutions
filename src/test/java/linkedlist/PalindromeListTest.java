package linkedlist;

import org.junit.jupiter.api.Test;
import utils.ListNode;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PalindromeListTest {

    @Test
    void testCase1() {
        ListNode head = ListNode.create(new int[]{1, 2, 2, 1});
        assertTrue(new PalindromeList().isPalindrome(head));
    }

    @Test
    void testCase2() {
        ListNode head = ListNode.create(new int[]{1, 2});
        assertFalse(new PalindromeList().isPalindrome(head));
    }
}
