package popular;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class EvaluateReversePolishNotationTest {

    @Test
    public void shouldEvaluateSimpleAdditionAndMultiplication() {
        assertThat(new EvaluateReversePolishNotation().evalRPN(
                new String[]{"2", "1", "+", "3", "*"})).isEqualTo(9);
    }

    @Test
    public void shouldEvaluateExpressionWithIntegerDivision() {
        assertThat(new EvaluateReversePolishNotation().evalRPN(
                new String[]{"4", "13", "5", "/", "+"})).isEqualTo(6);
    }

    @Test
    public void shouldEvaluateComplexExpressionWithNegativeNumbers() {
        assertThat(new EvaluateReversePolishNotation().evalRPN(
                new String[]{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"}))
                .isEqualTo(22);
    }
}
