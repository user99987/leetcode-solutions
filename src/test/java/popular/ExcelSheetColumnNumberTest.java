package popular;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExcelSheetColumnNumberTest {

    @Test
    public void testCase1() {
        assertEquals(1, new ExcelSheetColumnNumber().titleToNumber("A"));
    }

    @Test
    public void testCase2() {
        assertEquals(28, new ExcelSheetColumnNumber().titleToNumber("AB"));
    }

    @Test
    public void testCase3() {
        assertEquals(701, new ExcelSheetColumnNumber().titleToNumber("ZY"));
    }

    @Test
    public void testCase4() {
        assertEquals(2147483647, new ExcelSheetColumnNumber().titleToNumber("FXSHRXW"));
    }
}
