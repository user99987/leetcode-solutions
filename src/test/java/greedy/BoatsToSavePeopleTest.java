package greedy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BoatsToSavePeopleTest {

    @Test
    public void testCase1() {
        assertThat(new BoatsToSavePeople().numRescueBoats(new int[]{1, 2}, 3)).isEqualTo(1);
    }

    @Test
    public void testCase2() {
        assertThat(new BoatsToSavePeople().numRescueBoats(new int[]{3, 2, 2, 1}, 3)).isEqualTo(3);
    }

    @Test
    public void testCase3() {
        assertThat(new BoatsToSavePeople().numRescueBoats(new int[]{3, 5, 3, 4}, 5)).isEqualTo(4);
    }
}

