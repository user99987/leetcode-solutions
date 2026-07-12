package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LargestMultipleOfThreeTest {

    @Test
    public void testCase1() {
        assertThat(new LargestMultipleOfThree().largestMultipleOfThree(new int[]{8, 1, 9})).isEqualTo("981");
    }

    @Test
    public void testCase2() {
        assertThat(new LargestMultipleOfThree().largestMultipleOfThree(new int[]{8, 6, 7, 1, 0})).isEqualTo("8760");
    }

    @Test
    public void testCase3() {
        assertThat(new LargestMultipleOfThree().largestMultipleOfThree(new int[]{1})).isEqualTo("");
    }
}
