package string;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReconstructOriginalDigitsFromEnglishTest {

    @Test
    public void testCase1() {
        String input = "owoztneoer";
        String expected = "012";
        assertEquals(expected, new ReconstructOriginalDigitsFromEnglish().originalDigits(input));
    }

    @Test
    public void testCase2() {
        String input = "fviefuro";
        String expected = "45";
        assertEquals(expected, new ReconstructOriginalDigitsFromEnglish().originalDigits(input));
    }
}
