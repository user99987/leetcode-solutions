package backtracking;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExpressionAddOperatorsTest {

    @Test
    public void testCase1() {
        List<String> result = new ExpressionAddOperators().addOperators("123", 6);
        List<String> expected = List.of("1+2+3", "1*2*3");
        assertEquals(expected, result);
    }

    @Test
    public void testCase2() {
        List<String> result = new ExpressionAddOperators().addOperators("232", 8);
        List<String> expected = List.of("2+3*2", "2*3+2");
        assertEquals(expected, result);
    }

    @Test
    public void testCase3() {
        List<String> result = new ExpressionAddOperators().addOperators("105", 5);
        List<String> expected = List.of("1*0+5", "10-5");
        assertEquals(expected, result);
    }
}
