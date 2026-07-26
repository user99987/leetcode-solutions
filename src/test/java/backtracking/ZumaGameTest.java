package backtracking;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ZumaGameTest {

    @Test
    public void shouldReturnMinusOneWhenBoardCannotBeCleared() {
        assertThat(new ZumaGame().findMinStep("WRRBBW", "RB")).isEqualTo(-1);
    }

    @Test
    public void shouldFindMinimumInsertionsToClearBoard() {
        assertThat(new ZumaGame().findMinStep("WWRRBBWW", "WRBRW")).isEqualTo(2);
    }

    @Test
    public void shouldFindMinimumInsertionsForSingleBallBoard() {
        assertThat(new ZumaGame().findMinStep("G", "GGGGG")).isEqualTo(2);
    }

    @Test
    public void shouldClearBoardWithMultipleColorGroupsUsingOneInsertion() {
        assertThat(new ZumaGame().findMinStep("BBWWRRYYRRWWBB", "Y")).isEqualTo(1);
    }
}
