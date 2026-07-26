package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NumberOfDiceRollsWithTargetSumTest {

    @Test
    public void shouldFindSingleWayWithOneDie() {
        assertThat(new NumberOfDiceRollsWithTargetSum().numRollsToTarget(1, 6, 3)).isEqualTo(1);
    }

    @Test
    public void shouldCountWaysWithTwoDice() {
        assertThat(new NumberOfDiceRollsWithTargetSum().numRollsToTarget(2, 6, 7)).isEqualTo(6);
    }

    @Test
    public void shouldCountWaysForLargeNumberOfDice() {
        assertThat(new NumberOfDiceRollsWithTargetSum().numRollsToTarget(30, 30, 500)).isEqualTo(222616187);
    }

    @Test
    public void shouldReturnZeroWhenTargetIsUnreachable() {
        assertThat(new NumberOfDiceRollsWithTargetSum().numRollsToTarget(2, 6, 15)).isEqualTo(0);
    }
}
