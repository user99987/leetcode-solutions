package array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class RelativeSortArrayTest {

    @Test
    public void testCase1() {
        assertThat(new RelativeSortArray().relativeSortArray(new int[]{2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19}, new int[]{2, 1, 4, 3, 9, 6})).containsExactly(new int[]{2, 2, 2, 1, 4, 3, 3, 9, 6, 7, 19});
    }

    @Test
    public void testCase2() {
        assertThat(new RelativeSortArray().relativeSortArray(new int[]{28, 6, 22, 8, 44, 17}, new int[]{22, 28, 8, 6})).containsExactly(new int[]{22, 28, 8, 6, 17, 44});
    }
}
