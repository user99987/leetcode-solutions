package array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SubarraySumEqualsKTest {

    @Test
    public void testCase1() {
        assertThat(new SubarraySumEqualsK().subarraySum(new int[]{1, 1, 1}, 2)).isEqualTo(2);
    }

    @Test
    public void testCase2() {
        assertThat(new SubarraySumEqualsK().subarraySum(new int[]{1, 2, 3}, 3)).isEqualTo(2);
    }
}
