package bitmanipulation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class GrayCodeTest {

    @Test
    public void testCase1() {
        List<Integer> result = new GrayCode().grayCode(2);
        assertEquals(List.of(0, 1, 3, 2), result);
    }

    @Test
    public void testCase2() {
        List<Integer> result = new GrayCode().grayCode(1);
        assertEquals(List.of(0, 1), result);
    }
}
