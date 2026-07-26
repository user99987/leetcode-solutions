package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DungeonGameTest {

    @Test
    public void shouldFindMinimumInitialHealthForMultiRowDungeon() {
        assertThat(new DungeonGame().calculateMinimumHP(new int[][]{{-2, -3, 3}, {-5, -10, 1}, {10, 30, -5}})).isEqualTo(7);
    }

    @Test
    public void shouldReturnOneForSingleZeroCellDungeon() {
        assertThat(new DungeonGame().calculateMinimumHP(new int[][]{{0}})).isEqualTo(1);
    }
}
