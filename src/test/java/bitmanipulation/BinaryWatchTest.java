package bitmanipulation;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class BinaryWatchTest {

    @Test
    public void testCase1() {
        List<String> result = new BinaryWatch().readBinaryWatch(1);
        assertTrue(result.containsAll(List.of("0:01", "0:02", "0:04", "0:08", "0:16", "0:32", "1:00", "2:00", "4:00", "8:00")));
    }

    @Test
    public void testCase2() {
        List<String> result = new BinaryWatch().readBinaryWatch(9);
        assertTrue(result.isEmpty());
    }
}
