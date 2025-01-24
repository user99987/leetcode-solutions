package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RestoreTheArrayTest {

    @Test
    public void testCase1() {
        assertEquals(1, new RestoreTheArray().numberOfArrays("1000", 10000));
    }

    @Test
    public void testCase2() {
        assertEquals(0, new RestoreTheArray().numberOfArrays("1000", 10));
    }

    @Test
    public void testCase3() {
        assertEquals(8, new RestoreTheArray().numberOfArrays("1317", 2000));
    }

    @Test
    public void testCase4() {
        assertEquals(1, new RestoreTheArray().numberOfArrays("1", 1));
    }

    @Test
    public void testCase5() {
        assertEquals(2, new RestoreTheArray().numberOfArrays("123", 12));
    }

    @Test
    public void testCase6() {
        assertEquals(0, new RestoreTheArray().numberOfArrays("000", 1000));
    }
}
