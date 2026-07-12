package heap;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DistantBarcodesTest {

    @Test
    public void testCase1() {
        var distantBarcodes = new DistantBarcodes();
        int[] barcodes = {1, 1, 1, 2, 2, 2};
        var result = distantBarcodes.rearrangeBarcodes(barcodes);
        assertThat(isValidRearrangement(result)).isTrue();
    }

    @Test
    public void testCase2() {
        var distantBarcodes = new DistantBarcodes();
        int[] barcodes = {1, 1, 1, 1, 2, 2, 3, 3};
        var result = distantBarcodes.rearrangeBarcodes(barcodes);
        assertThat(isValidRearrangement(result)).isTrue();
    }

    private boolean isValidRearrangement(int[] barcodes) {
        for (var i = 1; i < barcodes.length; i++) {
            if (barcodes[i] == barcodes[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
