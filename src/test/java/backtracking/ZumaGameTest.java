package backtracking;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ZumaGameTest {

    @Test
    public void testCase1() {
        assertThat(new ZumaGame().findMinStep("WRRBBW", "RB")).isEqualTo(-1);
    }

    @Test
    public void testCase2() {
        assertThat(new ZumaGame().findMinStep("WWRRBBWW", "WRBRW")).isEqualTo(2);
    }

    @Test
    public void testCase3() {
        assertThat(new ZumaGame().findMinStep("G", "GGGGG")).isEqualTo(2);
    }

    @Test
    public void testCase4() {
        assertThat(new ZumaGame().findMinStep("BBWWRRYYRRWWBB", "Y")).isEqualTo(1);
    }
}
