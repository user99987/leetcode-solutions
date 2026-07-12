package array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class FindPivotIndexTest {

    @Test
    public void testCase1() {
        assertThat(new FindPivotIndex().pivotIndex(new int[]{1, 7, 3, 6, 5, 6})).isEqualTo(3);
    }

    @Test
    public void testCase2() {
        assertThat(new FindPivotIndex().pivotIndex(new int[]{1, 2, 3})).isEqualTo(-1);
    }

    @Test
    public void testCase3() {
        assertThat(new FindPivotIndex().pivotIndex(new int[]{2, 1, -1})).isEqualTo(0);
    }
}
