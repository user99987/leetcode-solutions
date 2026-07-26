package popular;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


public class NumberOfIslandsTest {

    @Test
    public void shouldCountSingleConnectedIsland() {
        char[][] grid = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };
        assertThat(new NumberOfIslands().numIslands(grid)).isEqualTo(1);
    }

    @Test
    public void shouldCountMultipleSeparateIslands() {
        char[][] grid = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };
        assertThat(new NumberOfIslands().numIslands(grid)).isEqualTo(3);
    }
}
