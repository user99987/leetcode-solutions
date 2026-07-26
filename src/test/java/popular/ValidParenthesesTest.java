package popular;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


public class ValidParenthesesTest {

    @Test
    public void shouldReturnTrueForSimpleValidPair() {
        assertThat(new ValidParentheses().isValid("()")).isTrue();
    }

    @Test
    public void shouldReturnTrueForMultipleValidPairTypes() {
        assertThat(new ValidParentheses().isValid("()[]{}")).isTrue();
    }

    @Test
    public void shouldReturnFalseForMismatchedBracketTypes() {
        assertThat(new ValidParentheses().isValid("(]")).isFalse();
    }

    @Test
    public void shouldReturnFalseForIncorrectlyNestedBrackets() {
        assertThat(new ValidParentheses().isValid("([)]")).isFalse();
    }

    @Test
    public void shouldReturnTrueForProperlyNestedBrackets() {
        assertThat(new ValidParentheses().isValid("{[]}")).isTrue();
    }
}
