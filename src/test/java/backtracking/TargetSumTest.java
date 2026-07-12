package backtracking;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class TargetSumTest {

    @Test
    public void testCase1() {
        assertThat(new TargetSum().findTargetSumWays(new int[]{1, 1, 1, 1, 1}, 3)).isEqualTo(5);
    }

    @Test
    public void testCase2() {
        assertThat(new TargetSum().findTargetSumWays(new int[]{1}, 1)).isEqualTo(1);
    }

    @Test
    public void testCase3() {
        assertThat(new TargetSum().findTargetSumWays(new int[]{1, 2, 3}, 7)).isEqualTo(0);
    }
}
