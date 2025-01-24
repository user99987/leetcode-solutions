package bitmanipulation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HammingDistanceTest {

    @Test
    public void testCase1() {
        assertEquals(2, new HammingDistance().hammingDistance(1, 4));
    }

    @Test
    public void testCase2() {
        assertEquals(1, new HammingDistance().hammingDistance(3, 1));
    }
}
