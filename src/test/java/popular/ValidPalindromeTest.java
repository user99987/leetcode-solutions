package popular;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


public class ValidPalindromeTest {

    @Test
    public void testCase1() {
        assertThat(new ValidPalindrome().isPalindrome("A man, a plan, a canal: Panama")).isTrue();
    }

    @Test
    public void testCase2() {
        assertThat(new ValidPalindrome().isPalindrome("race a car")).isFalse();
    }

    @Test
    public void testCase3() {
        assertThat(new ValidPalindrome().isPalindrome(" ")).isTrue();
    }
}
