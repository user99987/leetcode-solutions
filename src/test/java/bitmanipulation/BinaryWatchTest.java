package bitmanipulation;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class BinaryWatchTest {

    @Test
    public void shouldReturnAllTimesWithOneLedOn() {
        assertThat(new BinaryWatch().readBinaryWatch(1)).containsExactlyInAnyOrder(
                "0:01", "0:02", "0:04", "0:08", "0:16", "0:32", "1:00", "2:00", "4:00", "8:00");
    }

    @Test
    public void shouldReturnEmptyListWhenTooManyLedsAreOn() {
        assertThat(new BinaryWatch().readBinaryWatch(9)).isEmpty();
    }

    @Test
    public void shouldReturnMidnightOnlyWhenZeroLedsAreOn() {
        assertThat(new BinaryWatch().readBinaryWatch(0)).containsExactly("0:00");
    }

    @Test
    public void shouldReturnEmptyListWhenMaxLedsAreUnreachable() {
        assertThat(new BinaryWatch().readBinaryWatch(10)).isEmpty();
    }

    @Test
    public void shouldFormatAllResultsWithValidMinutePadding() {
        var results = new BinaryWatch().readBinaryWatch(2);
        assertThat(results).isNotEmpty();
        assertThat(results).allSatisfy(time -> {
            String[] parts = time.split(":");
            assertThat(parts[1]).hasSize(2);
        });
    }
}
