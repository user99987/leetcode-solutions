package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DistinctSubsequencesTest {

    @Test
    public void shouldCountDistinctSubsequencesWithRepeatedLetters() {
        assertThat(new DistinctSubsequences().numDistinct("rabbbit", "rabbit")).isEqualTo(3);
    }

    @Test
    public void shouldCountDistinctSubsequencesForShorterTarget() {
        assertThat(new DistinctSubsequences().numDistinct("babgbag", "bag")).isEqualTo(5);
    }
}

