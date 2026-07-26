package bitmanipulation;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class GrayCodeTest {

    @Test
    public void shouldGenerateGrayCodeForTwoBits() {
        assertThat(new GrayCode().grayCode(2)).containsExactly(0, 1, 3, 2);
    }

    @Test
    public void shouldGenerateGrayCodeForOneBit() {
        assertThat(new GrayCode().grayCode(1)).containsExactly(0, 1);
    }

    @Test
    public void shouldHaveCorrectSizeAndStartAtZero() {
        var result = new GrayCode().grayCode(3);
        assertThat(result).hasSize(8);
        assertThat(result.get(0)).isZero();
    }

    @Test
    public void shouldHaveAdjacentValuesDifferByExactlyOneBit() {
        var result = new GrayCode().grayCode(4);
        for (int i = 1; i < result.size(); i++) {
            int xorResult = result.get(i) ^ result.get(i - 1);
            assertThat(Integer.bitCount(xorResult)).isEqualTo(1);
        }
        // first and last also differ by exactly one bit (cyclic property)
        int wrapXor = result.get(0) ^ result.get(result.size() - 1);
        assertThat(Integer.bitCount(wrapXor)).isEqualTo(1);
    }

    @Test
    public void shouldHaveUniqueValuesWithinRange() {
        var result = new GrayCode().grayCode(3);
        assertThat(result).doesNotHaveDuplicates();
        assertThat(result).allSatisfy(value -> assertThat(value).isBetween(0, 7));
    }
}
