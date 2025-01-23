package popular;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SingleNumberTest {

    @Test
    public void testCase1() {
        assertEquals(1, new SingleNumber().singleNumber(new int[]{2, 2, 1}));
    }

    @Test
    public void testCase2() {
        assertEquals(4, new SingleNumber().singleNumber(new int[]{4, 1, 2, 1, 2}));
    }

    @Test
    public void testCase3() {
        assertEquals(1, new SingleNumber().singleNumber(new int[]{1}));
    }
}
