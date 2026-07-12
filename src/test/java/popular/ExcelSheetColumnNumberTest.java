package popular;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ExcelSheetColumnNumberTest {

    @Test
    public void testCase1() {
        assertThat(new ExcelSheetColumnNumber().titleToNumber("A")).isEqualTo(1);
    }

    @Test
    public void testCase2() {
        assertThat(new ExcelSheetColumnNumber().titleToNumber("AB")).isEqualTo(28);
    }

    @Test
    public void testCase3() {
        assertThat(new ExcelSheetColumnNumber().titleToNumber("ZY")).isEqualTo(701);
    }

    @Test
    public void testCase4() {
        assertThat(new ExcelSheetColumnNumber().titleToNumber("FXSHRXW")).isEqualTo(2147483647);
    }
}
