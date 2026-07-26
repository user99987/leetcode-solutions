package popular;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GasStationTest {

    @Test
    public void shouldFindStartingStationWhenCircuitIsPossible() {
        assertThat(new GasStation().canCompleteCircuit(new int[]{1, 2, 3, 4, 5}, new int[]{3, 4, 5, 1, 2})).isEqualTo(3);
    }

    @Test
    public void shouldReturnMinusOneWhenCircuitIsImpossible() {
        assertThat(new GasStation().canCompleteCircuit(new int[]{2, 3, 4}, new int[]{3, 4, 3})).isEqualTo(-1);
    }
}
