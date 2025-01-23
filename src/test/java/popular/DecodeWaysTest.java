package popular;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecodeWaysTest {

    @Test
    public void testCase1() {
        assertEquals(2, new DecodeWays().numDecodings("12"));
    }

    @Test
    public void testCase2() {
        assertEquals(3, new DecodeWays().numDecodings("226"));
    }

    @Test
    public void testCase3() {
        assertEquals(0, new DecodeWays().numDecodings("0"));
    }

    @Test
    public void testCase4() {
        assertEquals(0, new DecodeWays().numDecodings("06"));
    }
}
