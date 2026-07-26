package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class KnightProbabilityInChessboardTest {

    @Test
    public void shouldCalculateProbabilityAfterTwoMoves() {
        assertThat(new KnightProbabilityInChessboard().knightProbability(3, 2, 0, 0)).isEqualTo(0.0625);
    }

    @Test
    public void shouldReturnOneWhenNoMovesAreMade() {
        assertThat(new KnightProbabilityInChessboard().knightProbability(1, 0, 0, 0)).isEqualTo(1.0);
    }
}
