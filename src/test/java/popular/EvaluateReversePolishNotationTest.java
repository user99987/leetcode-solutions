package popular;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EvaluateReversePolishNotationTest {

    @Test
    public void testCase1() {
        assertEquals(9, new EvaluateReversePolishNotation().evalRPN(
                new String[]{"2", "1", "+", "3", "*"}
        ));
    }

    @Test
    public void testCase2() {
        assertEquals(6, new EvaluateReversePolishNotation().evalRPN(
                new String[]{"4", "13", "5", "/", "+"}
        ));
    }

    @Test
    public void testCase3() {
        assertEquals(22, new EvaluateReversePolishNotation().evalRPN(
                new String[]{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"}
        ));
    }

}
