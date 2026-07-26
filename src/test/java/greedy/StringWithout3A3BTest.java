package greedy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringWithout3A3BTest {

    @Test
    public void shouldBuildValidStringWithMoreBs() {
        var result = new StringWithout3A3B().strWithout3a3b(1, 2);
        assertValid(result, 1, 2);
    }

    @Test
    public void shouldBuildValidStringWithMoreAs() {
        var result = new StringWithout3A3B().strWithout3a3b(4, 1);
        assertValid(result, 4, 1);
    }

    @Test
    public void shouldBuildValidStringWithOnlyAs() {
        var result = new StringWithout3A3B().strWithout3a3b(2, 0);
        assertValid(result, 2, 0);
    }

    @Test
    public void shouldBuildValidStringWithOnlyBs() {
        var result = new StringWithout3A3B().strWithout3a3b(0, 2);
        assertValid(result, 0, 2);
    }

    @Test
    public void shouldReturnEmptyStringWhenBothCountsAreZero() {
        assertThat(new StringWithout3A3B().strWithout3a3b(0, 0)).isEmpty();
    }

    @Test
    public void shouldAvoidTripleRunsForEqualLargeCounts() {
        var result = new StringWithout3A3B().strWithout3a3b(10, 10);
        assertValid(result, 10, 10);
    }

    private void assertValid(String result, int a, int b) {
        assertThat(result).hasSize(a + b);
        assertThat((int) result.chars().filter(c -> c == 'a').count()).isEqualTo(a);
        assertThat((int) result.chars().filter(c -> c == 'b').count()).isEqualTo(b);
        assertThat(result).doesNotContain("aaa");
        assertThat(result).doesNotContain("bbb");
    }
}
