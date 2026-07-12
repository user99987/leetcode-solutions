package popular;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


public class UniquePathsTest {

    @Test
    public void testCase1() {
        assertThat(new UniquePaths().uniquePaths(3, 7)).isEqualTo(28);
    }

    @Test
    public void testCase2() {
        assertThat(new UniquePaths().uniquePaths(3, 2)).isEqualTo(3);
    }

    @Test
    public void testCase3() {
        assertThat(new UniquePaths().uniquePaths(7, 3)).isEqualTo(28);
    }

    @Test
    public void testCase4() {
        assertThat(new UniquePaths().uniquePaths(3, 3)).isEqualTo(6);
    }
}
