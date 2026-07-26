package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FreedomTrailTest {

    @Test
    public void shouldFindMinimumStepsForShortKey() {
        assertThat(new FreedomTrail().findRotateSteps("godding", "gd")).isEqualTo(4);
    }

    @Test
    public void shouldFindMinimumStepsWhenKeyEqualsRing() {
        assertThat(new FreedomTrail().findRotateSteps("godding", "godding")).isEqualTo(13);
    }
}
