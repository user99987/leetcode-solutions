package backtracking;

import org.junit.jupiter.api.Test;

import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

public class ExpressionAddOperatorsTest {

    @Test
    public void shouldFindExpressionsEvaluatingToSix() {
        var result = new ExpressionAddOperators().addOperators("123", 6);
        List<String> expected = List.of("1+2+3", "1*2*3");
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void shouldFindExpressionsEvaluatingToEight() {
        var result = new ExpressionAddOperators().addOperators("232", 8);
        List<String> expected = List.of("2+3*2", "2*3+2");
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void shouldAvoidLeadingZeroOperandsWhenBuildingExpressions() {
        var result = new ExpressionAddOperators().addOperators("105", 5);
        List<String> expected = List.of("1*0+5", "10-5");
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyListWhenNoExpressionMatchesTarget() {
        assertThat(new ExpressionAddOperators().addOperators("3456237490", 9191)).isEmpty();
    }
}
