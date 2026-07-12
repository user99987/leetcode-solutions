package array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MinimumMovesToEqualArrayTest {

    @Test
    public void testCase1() {
        assertThat(new MinimumMovesToEqualArray().minMoves(new int[]{1, 2, 3})).isEqualTo(3);
    }

    @Test
    public void testCase2() {
        assertThat(new MinimumMovesToEqualArray().minMoves(new int[]{1, 1, 1})).isEqualTo(0);
    }
}
