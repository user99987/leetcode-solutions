package popular;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GenerateParenthesesTest {

    @Test
    public void testCase1() {
        assertEquals(Arrays.asList("((()))", "(()())", "(())()", "()(())", "()()()"), new GenerateParentheses().generateParenthesis(3));
    }

    @Test
    public void testCase2() {
        assertEquals(List.of("()"), new GenerateParentheses().generateParenthesis(1));
    }
}
