package backtracking;

import org.junit.jupiter.api.Test;

import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

public class RemoveInvalidParenthesesTest {

    @Test
    public void testCase1() {
        var result = new RemoveInvalidParentheses().removeInvalidParentheses("()())()");
        List<String> expected = List.of("(())()", "()()()");
        assertThat(result.containsAll(expected) && expected.containsAll(result)).isTrue();
    }

    @Test
    public void testCase2() {
        var result = new RemoveInvalidParentheses().removeInvalidParentheses("(a)())()");
        List<String> expected = List.of("(a())()", "(a)()()");
        assertThat(result.containsAll(expected) && expected.containsAll(result)).isTrue();
    }

    @Test
    public void testCase3() {
        var result = new RemoveInvalidParentheses().removeInvalidParentheses(")(");
        List<String> expected = List.of("");
        assertThat(result).isEqualTo(expected);
    }
}
