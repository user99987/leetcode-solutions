package array;

import org.junit.jupiter.api.Test;
import org.assertj.core.data.Offset;
import static org.assertj.core.api.Assertions.assertThat;

public class ChampagneTowerTest {

    @Test
    public void testCase1() {
        assertThat(new ChampagneTower().champagneTower(1, 1, 1)).isCloseTo(0.0, Offset.offset(0.00001));
    }

    @Test
    public void testCase2() {
        assertThat(new ChampagneTower().champagneTower(2, 1, 1)).isCloseTo(0.5, Offset.offset(0.00001));
    }

    @Test
    public void testCase3() {
        assertThat(new ChampagneTower().champagneTower(100000009, 33, 17)).isCloseTo(1.0, Offset.offset(0.00001));
    }
}
