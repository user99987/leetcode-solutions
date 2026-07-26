package backtracking;

import org.junit.jupiter.api.Test;

import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

public class RemoveInvalidParenthesesTest {

    @Test
    public void shouldFindAllMinimalRemovalsForSimpleInvalidString() {
        var result = new RemoveInvalidParentheses().removeInvalidParentheses("()())()");
        List<String> expected = List.of("(())()", "()()()");
        assertThat(result.containsAll(expected) && expected.containsAll(result)).isTrue();
    }

    @Test
    public void shouldFindAllMinimalRemovalsForStringWithLetters() {
        var result = new RemoveInvalidParentheses().removeInvalidParentheses("(a)())()");
        List<String> expected = List.of("(a())()", "(a)()()");
        assertThat(result.containsAll(expected) && expected.containsAll(result)).isTrue();
    }

    @Test
    public void shouldReturnEmptyStringWhenAllParenthesesAreInvalid() {
        var result = new RemoveInvalidParentheses().removeInvalidParentheses(")(");
        List<String> expected = List.of("");
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void shouldReturnOriginalStringWhenAlreadyValid() {
        assertThat(new RemoveInvalidParentheses().removeInvalidParentheses("()()")).containsExactly("()()");
    }
}
