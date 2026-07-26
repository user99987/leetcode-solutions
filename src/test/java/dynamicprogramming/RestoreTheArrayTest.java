package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RestoreTheArrayTest {

    @Test
    public void shouldFindSingleWayWhenWholeNumberFitsUnderLimit() {
        assertThat(new RestoreTheArray().numberOfArrays("1000", 10000)).isEqualTo(1);
    }

    @Test
    public void shouldReturnZeroWhenLeadingZeroMakesSplitInvalid() {
        assertThat(new RestoreTheArray().numberOfArrays("1000", 10)).isEqualTo(0);
    }

    @Test
    public void shouldCountMultipleValidSplitsUnderLimit() {
        assertThat(new RestoreTheArray().numberOfArrays("1317", 2000)).isEqualTo(8);
    }

    @Test
    public void shouldReturnOneForSingleDigitString() {
        assertThat(new RestoreTheArray().numberOfArrays("1", 1)).isEqualTo(1);
    }

    @Test
    public void shouldCountSplitsForThreeDigitString() {
        assertThat(new RestoreTheArray().numberOfArrays("123", 12)).isEqualTo(2);
    }

    @Test
    public void shouldReturnZeroWhenStringIsAllZeros() {
        assertThat(new RestoreTheArray().numberOfArrays("000", 1000)).isEqualTo(0);
    }
}
