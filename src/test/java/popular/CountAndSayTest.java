package popular;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CountAndSayTest {


    @Test
    void testCase1() {
        assertThat(new CountAndSay().countAndSay(1)).isEqualTo("1");
    }

    @Test
    void testCase2() {
        assertThat(new CountAndSay().countAndSay(4)).isEqualTo("1211");
    }
}
