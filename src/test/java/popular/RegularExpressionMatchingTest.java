package popular;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


public class RegularExpressionMatchingTest {

    @Test
    public void shouldNotMatchWhenPatternHasNoWildcards() {
        assertThat(new RegularExpressionMatching().isMatch("aa", "a")).isFalse();
    }

    @Test
    public void shouldMatchUsingStarRepetition() {
        assertThat(new RegularExpressionMatching().isMatch("aa", "a*")).isTrue();
    }

    @Test
    public void shouldMatchUsingDotStarWildcard() {
        assertThat(new RegularExpressionMatching().isMatch("ab", ".*")).isTrue();
    }

    @Test
    public void shouldMatchUsingCombinedStarPatterns() {
        assertThat(new RegularExpressionMatching().isMatch("aab", "c*a*b")).isTrue();
    }

    @Test
    public void shouldNotMatchComplexPatternWithMismatch() {
        assertThat(new RegularExpressionMatching().isMatch("mississippi", "mis*is*p*.")).isFalse();
    }
}
