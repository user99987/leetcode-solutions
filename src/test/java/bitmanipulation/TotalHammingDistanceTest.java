package bitmanipulation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TotalHammingDistanceTest {

    @Test
    public void testCase1() {
        assertEquals(6, new TotalHammingDistance().totalHammingDistance(new int[]{4, 14, 2}));
    }

    @Test
    public void testCase2() {
        assertEquals(4, new TotalHammingDistance().totalHammingDistance(new int[]{4, 14, 4}));
    }
}
