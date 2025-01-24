package backtracking;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RemoveInvalidParenthesesTest {

    @Test
    public void testCase1() {
        List<String> result = new RemoveInvalidParentheses().removeInvalidParentheses("()())()");
        List<String> expected = List.of("(())()", "()()()");
        assertTrue(result.containsAll(expected) && expected.containsAll(result));
    }

    @Test
    public void testCase2() {
        List<String> result = new RemoveInvalidParentheses().removeInvalidParentheses("(a)())()");
        List<String> expected = List.of("(a())()", "(a)()()");
        assertTrue(result.containsAll(expected) && expected.containsAll(result));
    }

    @Test
    public void testCase3() {
        List<String> result = new RemoveInvalidParentheses().removeInvalidParentheses(")(");
        List<String> expected = List.of("");
        assertEquals(expected, result);
    }
}
