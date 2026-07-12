package array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ArrayPartitionTest {

    @Test
    public void testCase1() {
        assertThat(new ArrayPartition().arrayPairSum(new int[]{1, 4, 3, 2})).isEqualTo(4);
    }

    @Test
    public void testCase2() {
        assertThat(new ArrayPartition().arrayPairSum(new int[]{6, 2, 6, 5, 1, 2})).isEqualTo(9);
    }
}
