package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NumberOfWaysToStayInTheSamePlaceTest {

    @Test
    public void testCase1() {
        assertThat(new NumberOfWaysToStayInTheSamePlace().numWays(3, 2)).isEqualTo(4);
    }

    @Test
    public void testCase2() {
        assertThat(new NumberOfWaysToStayInTheSamePlace().numWays(2, 4)).isEqualTo(2);
    }

    @Test
    public void testCase3() {
        assertThat(new NumberOfWaysToStayInTheSamePlace().numWays(4, 2)).isEqualTo(8);
    }

    @Test
    public void testCase4() {
        assertThat(new NumberOfWaysToStayInTheSamePlace().numWays(1, 1)).isEqualTo(1);
    }

    @Test
    public void testCase5() {
        assertThat(new NumberOfWaysToStayInTheSamePlace().numWays(500, 1)).isEqualTo(1);
    }

}
