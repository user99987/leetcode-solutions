package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CatAndMouseTest {

    @Test
    public void shouldReturnDrawForCyclicGraph() {
        assertThat(new CatAndMouse().catMouseGame(new int[][]{{2, 5}, {3}, {0, 4, 5}, {1, 4, 5}, {2, 3}, {0, 2, 3}})).isEqualTo(0);
    }

    @Test
    public void shouldReturnMouseWinForSimpleGraph() {
        assertThat(new CatAndMouse().catMouseGame(new int[][]{{1, 3}, {0}, {3}, {0, 2}})).isEqualTo(1);
    }
}
