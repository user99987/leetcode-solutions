package binarysearch;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class FirstBadVersionTest {

    @Test
    public void testCase1() {
        assertThat(new FirstBadVersion().firstBadVersion(5, 4)).isEqualTo(4);
    }

    @Test
    public void testCase2() {
        assertThat(new FirstBadVersion().firstBadVersion(1, 1)).isEqualTo(1);
    }
}

