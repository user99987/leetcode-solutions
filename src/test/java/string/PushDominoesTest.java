package string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PushDominoesTest {

    @Test
    void testCase1() {
        var dominoes = "RR.L";
        var expected = "RR.L";
        assertThat(new PushDominoes().pushDominoes(dominoes)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        var dominoes = ".L.R...LR..L..";
        var expected = "LL.RR.LLRRLL..";
        assertThat(new PushDominoes().pushDominoes(dominoes)).isEqualTo(expected);
    }

    @Test
    void testCase3() {
        var dominoes = "R...L";
        var expected = "RR.LL";
        assertThat(new PushDominoes().pushDominoes(dominoes)).isEqualTo(expected);
    }
}
