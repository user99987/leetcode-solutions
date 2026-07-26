package string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PushDominoesTest {

    @Test
    void shouldLeaveUnaffectedDominoesUnchanged() {
        var dominoes = "RR.L";
        var expected = "RR.L";
        assertThat(new PushDominoes().pushDominoes(dominoes)).isEqualTo(expected);
    }

    @Test
    void shouldResolveMixedPushesAndStandingDominoes() {
        var dominoes = ".L.R...LR..L..";
        var expected = "LL.RR.LLRRLL..";
        assertThat(new PushDominoes().pushDominoes(dominoes)).isEqualTo(expected);
    }

    @Test
    void shouldSplitEvenlyBetweenOpposingForces() {
        var dominoes = "R...L";
        var expected = "RR.LL";
        assertThat(new PushDominoes().pushDominoes(dominoes)).isEqualTo(expected);
    }
}
