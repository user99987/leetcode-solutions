package linkedlist;

import org.junit.jupiter.api.Test;
import utils.ListNode;
import static org.assertj.core.api.Assertions.assertThat;

class PalindromeListTest {

    @Test
    void testCase1() {
        ListNode head = ListNode.create(new int[]{1, 2, 2, 1});
        assertThat(new PalindromeList().isPalindrome(head)).isTrue();
    }

    @Test
    void testCase2() {
        ListNode head = ListNode.create(new int[]{1, 2});
        assertThat(new PalindromeList().isPalindrome(head)).isFalse();
    }
}
