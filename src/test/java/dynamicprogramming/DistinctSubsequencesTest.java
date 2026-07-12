package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DistinctSubsequencesTest {

    @Test
    public void testCase1() {
        assertThat(new DistinctSubsequences().numDistinct("rabbbit", "rabbit")).isEqualTo(3);
    }

    @Test
    public void testCase2() {
        assertThat(new DistinctSubsequences().numDistinct("babgbag", "bag")).isEqualTo(5);
    }
}

