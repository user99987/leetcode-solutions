package binarysearch;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class FirstBadVersionTest {

    @Test
    public void shouldFindBadVersionInMiddleOfRange() {
        assertThat(new FirstBadVersion().firstBadVersion(5, 4)).isEqualTo(4);
    }

    @Test
    public void shouldReturnOneWhenOnlyOneVersionExists() {
        assertThat(new FirstBadVersion().firstBadVersion(1, 1)).isEqualTo(1);
    }

    @Test
    public void shouldReturnOneWhenFirstVersionIsBad() {
        assertThat(new FirstBadVersion().firstBadVersion(10, 1)).isEqualTo(1);
    }

    @Test
    public void shouldReturnNWhenLastVersionIsBad() {
        assertThat(new FirstBadVersion().firstBadVersion(10, 10)).isEqualTo(10);
    }

    @Test
    public void shouldFindCorrectVersionInLargeRange() {
        assertThat(new FirstBadVersion().firstBadVersion(2000000000, 1702766719)).isEqualTo(1702766719);
    }
}
