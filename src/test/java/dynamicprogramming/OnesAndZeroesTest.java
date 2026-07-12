package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class OnesAndZeroesTest {

    @Test
    public void testCase1() {
        assertThat(new OnesAndZeroes().findMaxForm(
                new String[]{"10", "0001", "111001", "1", "0"}, 5, 3)).isEqualTo(4);
    }

    @Test
    public void testCase2() {
        assertThat(new OnesAndZeroes().findMaxForm(
                new String[]{"10", "0", "1"}, 1, 1)).isEqualTo(2);
    }

    @Test
    public void testCase3() {
        assertThat(new OnesAndZeroes().findMaxForm(
                new String[]{"10", "0001", "1"}, 4, 3)).isEqualTo(3);
    }
}
