package popular;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidParenthesesTest {

    @Test
    public void testCase1() {
        assertTrue(new ValidParentheses().isValid("()"));
    }

    @Test
    public void testCase2() {
        assertTrue(new ValidParentheses().isValid("()[]{}"));
    }

    @Test
    public void testCase3() {
        assertFalse(new ValidParentheses().isValid("(]"));
    }

    @Test
    public void testCase4() {
        assertFalse(new ValidParentheses().isValid("([)]"));
    }

    @Test
    public void testCase5() {
        assertTrue(new ValidParentheses().isValid("{[]}"));
    }
}
