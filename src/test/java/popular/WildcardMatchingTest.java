package popular;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


public class WildcardMatchingTest {

    @Test
    public void testCase1() {
        assertThat(new WildcardMatching().isMatch("aa", "a")).isFalse();
    }

    @Test
    public void testCase2() {
        assertThat(new WildcardMatching().isMatch("aa", "*")).isTrue();
    }

    @Test
    public void testCase3() {
        assertThat(new WildcardMatching().isMatch("cb", "?a")).isFalse();
    }

    @Test
    public void testCase4() {
        assertThat(new WildcardMatching().isMatch("adceb", "*a*b")).isTrue();
    }

    @Test
    public void testCase5() {
        assertThat(new WildcardMatching().isMatch("acdcb", "a*c?b")).isFalse();
    }
}
