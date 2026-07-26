package popular;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;


public class GenerateParenthesesTest {

    @Test
    public void shouldGenerateAllCombinationsForThreePairs() {
        assertThat(new GenerateParentheses().generateParenthesis(3)).isEqualTo(Arrays.asList("((()))", "(()())", "(())()", "()(())", "()()()"));
    }

    @Test
    public void shouldGenerateSingleCombinationForOnePair() {
        assertThat(new GenerateParentheses().generateParenthesis(1)).isEqualTo(List.of("()"));
    }
}
