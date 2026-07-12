package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FreedomTrailTest {

    @Test
    public void testCase1() {
        assertThat(new FreedomTrail().findRotateSteps("godding", "gd")).isEqualTo(4);
    }

    @Test
    public void testCase2() {
        assertThat(new FreedomTrail().findRotateSteps("godding", "godding")).isEqualTo(13);
    }
}
