package popular;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


public class ValidPalindromeTest {

    @Test
    public void shouldReturnTrueForPalindromeWithPunctuationAndCase() {
        assertThat(new ValidPalindrome().isPalindrome("A man, a plan, a canal: Panama")).isTrue();
    }

    @Test
    public void shouldReturnFalseForNonPalindromePhrase() {
        assertThat(new ValidPalindrome().isPalindrome("race a car")).isFalse();
    }

    @Test
    public void shouldReturnTrueForBlankString() {
        assertThat(new ValidPalindrome().isPalindrome(" ")).isTrue();
    }
}
