package array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FruitIntoBasketsTest {

    @Test
    public void testCase1() {
        assertEquals(3, new FruitIntoBaskets().totalFruit(new int[]{1, 2, 1}));
    }

    @Test
    public void testCase2() {
        assertEquals(3, new FruitIntoBaskets().totalFruit(new int[]{0, 1, 2, 2}));
    }

    @Test
    public void testCase3() {
        assertEquals(4, new FruitIntoBaskets().totalFruit(new int[]{1, 2, 3, 2, 2}));
    }
}
