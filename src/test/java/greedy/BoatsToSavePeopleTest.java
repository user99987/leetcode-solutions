package greedy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BoatsToSavePeopleTest {

    @Test
    public void shouldUseOneBoatForTwoPeopleWithinLimit() {
        assertThat(new BoatsToSavePeople().numRescueBoats(new int[]{1, 2}, 3)).isEqualTo(1);
    }

    @Test
    public void shouldUseThreeBoatsForMixedWeights() {
        assertThat(new BoatsToSavePeople().numRescueBoats(new int[]{3, 2, 2, 1}, 3)).isEqualTo(3);
    }

    @Test
    public void shouldUseFourBoatsWhenPairingIsImpossible() {
        assertThat(new BoatsToSavePeople().numRescueBoats(new int[]{3, 5, 3, 4}, 5)).isEqualTo(4);
    }

    @Test
    public void shouldNeedOneBoatForSinglePerson() {
        assertThat(new BoatsToSavePeople().numRescueBoats(new int[]{3}, 3)).isEqualTo(1);
    }

    @Test
    public void shouldNeedOwnBoatForEachPersonAtLimit() {
        assertThat(new BoatsToSavePeople().numRescueBoats(new int[]{3, 3, 3}, 3)).isEqualTo(3);
    }

    @Test
    public void shouldPairUpAllLightPeopleCompletely() {
        assertThat(new BoatsToSavePeople().numRescueBoats(new int[]{1, 1, 1, 1}, 3)).isEqualTo(2);
    }

    @Test
    public void shouldFitEveryoneInOneBoatWhenLimitIsLarge() {
        assertThat(new BoatsToSavePeople().numRescueBoats(new int[]{1, 1}, 30000)).isEqualTo(1);
    }
}
