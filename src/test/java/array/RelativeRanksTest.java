package array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class RelativeRanksTest {

    @Test
    public void shouldAssignMedalsAndRanksForDecreasingScores() {
        assertThat(new RelativeRanks().findRelativeRanks(new int[]{5, 4, 3, 2, 1})).containsExactly(new String[]{"Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"});
    }

    @Test
    public void shouldAssignMedalsAndRanksForUnorderedScores() {
        assertThat(new RelativeRanks().findRelativeRanks(new int[]{10, 3, 8, 9, 4})).containsExactly(new String[]{"Gold Medal", "5", "Bronze Medal", "Silver Medal", "4"});
    }

    @Test
    public void shouldAssignGoldMedalForSingleAthlete() {
        assertThat(new RelativeRanks().findRelativeRanks(new int[]{50})).containsExactly(new String[]{"Gold Medal"});
    }

    @Test
    public void shouldAssignOnlyGoldAndSilverForTwoAthletes() {
        assertThat(new RelativeRanks().findRelativeRanks(new int[]{10, 20})).containsExactly(new String[]{"Silver Medal", "Gold Medal"});
    }

    @Test
    public void shouldAssignOnlyMedalsForExactlyThreeAthletes() {
        assertThat(new RelativeRanks().findRelativeRanks(new int[]{1, 2, 3})).containsExactly(new String[]{"Bronze Medal", "Silver Medal", "Gold Medal"});
    }
}
