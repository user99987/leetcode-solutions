package popular;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FindPeakElementTest {

    @Test
    public void testCase1() {
        int peakIndex = new FindPeakElement().findPeakElement(new int[]{1, 2, 3, 1});
        assertEquals(2, peakIndex);
    }

    @Test
    public void testCase2() {
        int peakIndex = new FindPeakElement().findPeakElement(new int[]{1, 2, 1, 3, 5, 6, 4});
        assertTrue(peakIndex == 1 || peakIndex == 5);
    }
}
