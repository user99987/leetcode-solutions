package array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ArrayNestingTest {

    @Test
    public void testCase1() {
        assertThat(new ArrayNesting().arrayNesting(new int[]{5, 4, 0, 3, 1, 6, 2})).isEqualTo(4);
    }

    @Test
    public void testCase2() {
        assertThat(new ArrayNesting().arrayNesting(new int[]{0, 1, 2})).isEqualTo(1);
    }
}
