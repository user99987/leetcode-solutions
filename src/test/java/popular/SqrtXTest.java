package popular;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SqrtXTest {

    @Test
    public void testCase1() {
        assertEquals(2, new SqrtX().mySqrt(4));
    }

    @Test
    public void testCase2() {
        assertEquals(2, new SqrtX().mySqrt(8));
    }

    @Test
    public void testCase3() {
        assertEquals(0, new SqrtX().mySqrt(0));
    }

    @Test
    public void testCase4() {
        assertEquals(46340, new SqrtX().mySqrt(Integer.MAX_VALUE));
    }
}
