package array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class FruitIntoBasketsTest {

    @Test
    public void testCase1() {
        assertThat(new FruitIntoBaskets().totalFruit(new int[]{1, 2, 1})).isEqualTo(3);
    }

    @Test
    public void testCase2() {
        assertThat(new FruitIntoBaskets().totalFruit(new int[]{0, 1, 2, 2})).isEqualTo(3);
    }

    @Test
    public void testCase3() {
        assertThat(new FruitIntoBaskets().totalFruit(new int[]{1, 2, 3, 2, 2})).isEqualTo(4);
    }
}
