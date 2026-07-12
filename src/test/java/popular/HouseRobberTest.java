package popular;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class HouseRobberTest {

    @Test
    public void testCase1() {
        assertThat(new HouseRobber().rob(new int[]{1, 2, 3, 1})).isEqualTo(4);
    }

    @Test
    public void testCase2() {
        assertThat(new HouseRobber().rob(new int[]{2, 7, 9, 3, 1})).isEqualTo(12);
    }
}

