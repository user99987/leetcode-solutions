package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NumberOfWaysToStayInTheSamePlaceTest {

    @Test
    public void shouldCountWaysWithMoreStepsThanArrayLength() {
        assertThat(new NumberOfWaysToStayInTheSamePlace().numWays(3, 2)).isEqualTo(4);
    }

    @Test
    public void shouldCountWaysWithFewerStepsThanArrayLength() {
        assertThat(new NumberOfWaysToStayInTheSamePlace().numWays(2, 4)).isEqualTo(2);
    }

    @Test
    public void shouldCountWaysWithMoreStepsThanTwiceArrayLength() {
        assertThat(new NumberOfWaysToStayInTheSamePlace().numWays(4, 2)).isEqualTo(8);
    }

    @Test
    public void shouldReturnOneForSingleStepSingleLengthArray() {
        assertThat(new NumberOfWaysToStayInTheSamePlace().numWays(1, 1)).isEqualTo(1);
    }

    @Test
    public void shouldReturnOneWhenArrayLengthIsOne() {
        assertThat(new NumberOfWaysToStayInTheSamePlace().numWays(500, 1)).isEqualTo(1);
    }

}
