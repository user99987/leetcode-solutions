package popular;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


public class WildcardMatchingTest {

    @Test
    public void shouldNotMatchWhenPatternHasNoWildcards() {
        assertThat(new WildcardMatching().isMatch("aa", "a")).isFalse();
    }

    @Test
    public void shouldMatchWhenPatternIsSingleStar() {
        assertThat(new WildcardMatching().isMatch("aa", "*")).isTrue();
    }

    @Test
    public void shouldNotMatchWhenQuestionMarkPatternDiffers() {
        assertThat(new WildcardMatching().isMatch("cb", "?a")).isFalse();
    }

    @Test
    public void shouldMatchWithStarsAroundLiteral() {
        assertThat(new WildcardMatching().isMatch("adceb", "*a*b")).isTrue();
    }

    @Test
    public void shouldNotMatchComplexPatternWithMismatch() {
        assertThat(new WildcardMatching().isMatch("acdcb", "a*c?b")).isFalse();
    }
}
