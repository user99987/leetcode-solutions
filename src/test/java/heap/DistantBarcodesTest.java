package heap;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DistantBarcodesTest {

    @Test
    public void testCase1() {
        DistantBarcodes distantBarcodes = new DistantBarcodes();
        int[] barcodes = {1, 1, 1, 2, 2, 2};
        int[] result = distantBarcodes.rearrangeBarcodes(barcodes);
        assertTrue(isValidRearrangement(result));
    }

    @Test
    public void testCase2() {
        DistantBarcodes distantBarcodes = new DistantBarcodes();
        int[] barcodes = {1, 1, 1, 1, 2, 2, 3, 3};
        int[] result = distantBarcodes.rearrangeBarcodes(barcodes);
        assertTrue(isValidRearrangement(result));
    }

    private boolean isValidRearrangement(int[] barcodes) {
        for (int i = 1; i < barcodes.length; i++) {
            if (barcodes[i] == barcodes[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
