package backtracking;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class TargetSumTest {

    @Test
    public void shouldCountAllExpressionsForFiveOnes() {
        assertThat(new TargetSum().findTargetSumWays(new int[]{1, 1, 1, 1, 1}, 3)).isEqualTo(5);
    }

    @Test
    public void shouldReturnOneForSingleElementMatchingTarget() {
        assertThat(new TargetSum().findTargetSumWays(new int[]{1}, 1)).isEqualTo(1);
    }

    @Test
    public void shouldReturnZeroWhenTargetIsUnreachable() {
        assertThat(new TargetSum().findTargetSumWays(new int[]{1, 2, 3}, 7)).isEqualTo(0);
    }
}
