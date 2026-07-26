package popular;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


public class TwoSumTest {

    @Test
    public void shouldFindIndicesOfFirstTwoElements() {
        assertThat(new TwoSum().twoSum(new int[]{2, 7, 11, 15}, 9)).containsExactly(new int[]{0, 1});
    }

    @Test
    public void shouldFindIndicesInMiddleOfArray() {
        assertThat(new TwoSum().twoSum(new int[]{3, 2, 4}, 6)).containsExactly(new int[]{1, 2});
    }

    @Test
    public void shouldFindIndicesWhenBothValuesAreEqual() {
        assertThat(new TwoSum().twoSum(new int[]{3, 3}, 6)).containsExactly(new int[]{0, 1});
    }
}
