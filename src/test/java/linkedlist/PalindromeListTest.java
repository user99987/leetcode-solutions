package linkedlist;

import org.junit.jupiter.api.Test;
import utils.ListNode;

import static org.assertj.core.api.Assertions.assertThat;

public class PalindromeListTest {

    @Test
    public void shouldReturnTrueForPalindromeList() {
        assertThat(new PalindromeList().isPalindrome(ListNode.create(new int[]{1, 2, 2, 1}))).isTrue();
    }

    @Test
    public void shouldReturnFalseForNonPalindromeList() {
        assertThat(new PalindromeList().isPalindrome(ListNode.create(new int[]{1, 2}))).isFalse();
    }

    @Test
    public void shouldReturnTrueForSingleNode() {
        assertThat(new PalindromeList().isPalindrome(ListNode.create(new int[]{5}))).isTrue();
    }

    @Test
    public void shouldReturnTrueWhenHeadIsNull() {
        assertThat(new PalindromeList().isPalindrome(null)).isTrue();
    }

    @Test
    public void shouldReturnTrueForOddLengthPalindrome() {
        assertThat(new PalindromeList().isPalindrome(ListNode.create(new int[]{1, 2, 3, 2, 1}))).isTrue();
    }

    @Test
    public void shouldReturnFalseForEvenLengthNonPalindrome() {
        assertThat(new PalindromeList().isPalindrome(ListNode.create(new int[]{1, 2, 3, 4}))).isFalse();
    }

    @Test
    public void shouldReturnTrueWhenAllValuesAreSame() {
        assertThat(new PalindromeList().isPalindrome(ListNode.create(new int[]{7, 7, 7, 7}))).isTrue();
    }
}
