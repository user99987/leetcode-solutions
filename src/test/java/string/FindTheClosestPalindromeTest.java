package string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FindTheClosestPalindromeTest {

    @Test
    public void shouldFindClosestSmallerPalindromeForThreeDigitNumber() {
        assertThat(new FindTheClosestPalindrome().nearestPalindromic("123")).isEqualTo("121");
    }

    @Test
    public void shouldReturnZeroAsClosestPalindromeForOne() {
        assertThat(new FindTheClosestPalindrome().nearestPalindromic("1")).isEqualTo("0");
    }

    @Test
    public void shouldFindClosestPalindromeForPowerOfTen() {
        assertThat(new FindTheClosestPalindrome().nearestPalindromic("1000")).isEqualTo("999");
    }

    @Test
    public void shouldFindClosestPalindromeWhenInputIsAlreadyPalindrome() {
        assertThat(new FindTheClosestPalindrome().nearestPalindromic("101")).isEqualTo("99");
    }

    @Test
    public void shouldFindClosestPalindromeForSingleDigit() {
        assertThat(new FindTheClosestPalindrome().nearestPalindromic("8")).isEqualTo("7");
    }
}
