package popular;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ImplementStrStrTest {

    @Test
    public void testCase1() {
        assertEquals(2, new ImplementStrStr().strStr("hello", "ll"));
    }

    @Test
    public void testCase2() {
        assertEquals(-1, new ImplementStrStr().strStr("aaaaa", "bba"));
    }

    @Test
    public void testCase3() {
        assertEquals(0, new ImplementStrStr().strStr("", ""));
    }
}
