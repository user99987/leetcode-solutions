package popular;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


public class ValidParenthesesTest {

    @Test
    public void testCase1() {
        assertThat(new ValidParentheses().isValid("()")).isTrue();
    }

    @Test
    public void testCase2() {
        assertThat(new ValidParentheses().isValid("()[]{}")).isTrue();
    }

    @Test
    public void testCase3() {
        assertThat(new ValidParentheses().isValid("(]")).isFalse();
    }

    @Test
    public void testCase4() {
        assertThat(new ValidParentheses().isValid("([)]")).isFalse();
    }

    @Test
    public void testCase5() {
        assertThat(new ValidParentheses().isValid("{[]}")).isTrue();
    }
}
