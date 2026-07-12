package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NumberOfDiceRollsWithTargetSumTest {

    @Test
    public void testCase1() {
        assertThat(new NumberOfDiceRollsWithTargetSum().numRollsToTarget(1, 6, 3)).isEqualTo(1);
    }

    @Test
    public void testCase2() {
        assertThat(new NumberOfDiceRollsWithTargetSum().numRollsToTarget(2, 6, 7)).isEqualTo(6);
    }

    @Test
    public void testCase3() {
        assertThat(new NumberOfDiceRollsWithTargetSum().numRollsToTarget(30, 30, 500)).isEqualTo(222616187);
    }

    @Test
    public void testCase4() {
        assertThat(new NumberOfDiceRollsWithTargetSum().numRollsToTarget(2, 6, 15)).isEqualTo(0);
    }
}
