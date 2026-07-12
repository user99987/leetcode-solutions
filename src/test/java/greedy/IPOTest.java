package greedy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class IPOTest {

    @Test
    public void testCase1() {
        assertThat(new IPO().findMaximizedCapital(2, 0, new int[]{1, 2, 3}, new int[]{0, 1, 1})).isEqualTo(4);
    }

    @Test
    public void testCase2() {
        assertThat(new IPO().findMaximizedCapital(3, 0, new int[]{1, 2, 3}, new int[]{0, 1, 2})).isEqualTo(6);
    }
}
