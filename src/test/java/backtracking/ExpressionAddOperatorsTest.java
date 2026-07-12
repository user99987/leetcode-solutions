package backtracking;

import org.junit.jupiter.api.Test;

import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

public class ExpressionAddOperatorsTest {

    @Test
    public void testCase1() {
        var result = new ExpressionAddOperators().addOperators("123", 6);
        List<String> expected = List.of("1+2+3", "1*2*3");
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testCase2() {
        var result = new ExpressionAddOperators().addOperators("232", 8);
        List<String> expected = List.of("2+3*2", "2*3+2");
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testCase3() {
        var result = new ExpressionAddOperators().addOperators("105", 5);
        List<String> expected = List.of("1*0+5", "10-5");
        assertThat(result).isEqualTo(expected);
    }
}
