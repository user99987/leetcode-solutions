package bitmanipulation;

import org.junit.jupiter.api.Test;

import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

public class BinaryWatchTest {

    @Test
    public void testCase1() {
        var result = new BinaryWatch().readBinaryWatch(1);
        assertThat(result.containsAll(List.of("0:01", "0:02", "0:04", "0:08", "0:16", "0:32", "1:00", "2:00", "4:00", "8:00"))).isTrue();
    }

    @Test
    public void testCase2() {
        var result = new BinaryWatch().readBinaryWatch(9);
        assertThat(result.isEmpty()).isTrue();
    }
}
