package array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class LargestNumberAtLeastTwiceTest {

    @Test
    public void testCase1() {
        assertThat(new LargestNumberAtLeastTwice().dominantIndex(new int[]{3, 6, 1, 0})).isEqualTo(1);
    }

    @Test
    public void testCase2() {
        assertThat(new LargestNumberAtLeastTwice().dominantIndex(new int[]{1, 2, 3, 4})).isEqualTo(-1);
    }

    @Test
    public void testCase3() {
        assertThat(new LargestNumberAtLeastTwice().dominantIndex(new int[]{1})).isEqualTo(0);
    }
}
