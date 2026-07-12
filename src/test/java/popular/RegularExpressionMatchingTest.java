package popular;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


public class RegularExpressionMatchingTest {

    @Test
    public void testCase1() {
        assertThat(new RegularExpressionMatching().isMatch("aa", "a")).isFalse();
    }

    @Test
    public void testCase2() {
        assertThat(new RegularExpressionMatching().isMatch("aa", "a*")).isTrue();
    }

    @Test
    public void testCase3() {
        assertThat(new RegularExpressionMatching().isMatch("ab", ".*")).isTrue();
    }

    @Test
    public void testCase4() {
        assertThat(new RegularExpressionMatching().isMatch("aab", "c*a*b")).isTrue();
    }

    @Test
    public void testCase5() {
        assertThat(new RegularExpressionMatching().isMatch("mississippi", "mis*is*p*.")).isFalse();
    }
}
