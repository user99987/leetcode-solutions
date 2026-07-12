package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LargestPlusSignTest {

    @Test
    public void testCase1() {
        assertThat(new LargestPlusSign().orderOfLargestPlusSign(5, new int[][]{{4, 2}})).isEqualTo(2);
    }

    @Test
    public void testCase2() {
        assertThat(new LargestPlusSign().orderOfLargestPlusSign(1, new int[][]{{0, 0}})).isEqualTo(0);
    }
}
