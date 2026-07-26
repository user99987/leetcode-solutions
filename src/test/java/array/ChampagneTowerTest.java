package array;

import org.junit.jupiter.api.Test;
import org.assertj.core.data.Offset;
import static org.assertj.core.api.Assertions.assertThat;

public class ChampagneTowerTest {

    @Test
    public void shouldReturnZeroWhenGlassNotOverflowed() {
        assertThat(new ChampagneTower().champagneTower(1, 1, 1)).isCloseTo(0.0, Offset.offset(0.00001));
    }

    @Test
    public void shouldReturnHalfWhenOverflowSplitEvenly() {
        assertThat(new ChampagneTower().champagneTower(2, 1, 1)).isCloseTo(0.5, Offset.offset(0.00001));
    }

    @Test
    public void shouldReturnFullForMassiveOverflowDeepInTower() {
        assertThat(new ChampagneTower().champagneTower(100000009, 33, 17)).isCloseTo(1.0, Offset.offset(0.00001));
    }

    @Test
    public void shouldReturnZeroWhenNoChampagnePoured() {
        assertThat(new ChampagneTower().champagneTower(0, 0, 0)).isCloseTo(0.0, Offset.offset(0.00001));
    }

    @Test
    public void shouldReturnFullWhenTopGlassExactlyFullWithoutOverflow() {
        assertThat(new ChampagneTower().champagneTower(1, 0, 0)).isCloseTo(1.0, Offset.offset(0.00001));
    }

    @Test
    public void shouldCapTopGlassAtOneWhenQueryingRowZero() {
        assertThat(new ChampagneTower().champagneTower(5, 0, 0)).isCloseTo(1.0, Offset.offset(0.00001));
    }

    @Test
    public void shouldFillEdgeGlassesCompletelyOnMassiveOverflow() {
        assertThat(new ChampagneTower().champagneTower(1000000000, 5, 0)).isCloseTo(1.0, Offset.offset(0.00001));
        assertThat(new ChampagneTower().champagneTower(1000000000, 5, 5)).isCloseTo(1.0, Offset.offset(0.00001));
    }
}
