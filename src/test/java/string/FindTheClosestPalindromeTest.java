package string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FindTheClosestPalindromeTest {

    @Test
    public void testCase1() {
        assertThat(new FindTheClosestPalindrome().nearestPalindromic("123")).isEqualTo("121");
    }

    @Test
    public void testCase2() {
        assertThat(new FindTheClosestPalindrome().nearestPalindromic("1")).isEqualTo("0");
    }

    @Test
    public void testCase3() {
        assertThat(new FindTheClosestPalindrome().nearestPalindromic("1000")).isEqualTo("999");
    }

    @Test
    public void testCase4() {
        assertThat(new FindTheClosestPalindrome().nearestPalindromic("101")).isEqualTo("99");
    }

    @Test
    public void testCase5() {
        assertThat(new FindTheClosestPalindrome().nearestPalindromic("8")).isEqualTo("7");
    }
}
