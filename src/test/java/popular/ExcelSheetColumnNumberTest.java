package popular;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ExcelSheetColumnNumberTest {

    @Test
    public void shouldConvertSingleLetterTitle() {
        assertThat(new ExcelSheetColumnNumber().titleToNumber("A")).isEqualTo(1);
    }

    @Test
    public void shouldConvertTwoLetterTitle() {
        assertThat(new ExcelSheetColumnNumber().titleToNumber("AB")).isEqualTo(28);
    }

    @Test
    public void shouldConvertTwoLetterTitleWithHighValueLetters() {
        assertThat(new ExcelSheetColumnNumber().titleToNumber("ZY")).isEqualTo(701);
    }

    @Test
    public void shouldConvertTitleUpToIntegerMaxValue() {
        assertThat(new ExcelSheetColumnNumber().titleToNumber("FXSHRXW")).isEqualTo(2147483647);
    }
}
