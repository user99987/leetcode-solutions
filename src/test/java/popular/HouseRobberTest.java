package popular;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class HouseRobberTest {

    @Test
    public void shouldMaximizeMoneyWithNonAdjacentHouses() {
        assertThat(new HouseRobber().rob(new int[]{1, 2, 3, 1})).isEqualTo(4);
    }

    @Test
    public void shouldMaximizeMoneyForLargerHouseList() {
        assertThat(new HouseRobber().rob(new int[]{2, 7, 9, 3, 1})).isEqualTo(12);
    }
}

