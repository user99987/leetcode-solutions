package popular;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountAndSayTest {


    @Test
    void testCase1() {
        assertEquals("1", new CountAndSay().countAndSay(1));
    }

    @Test
    void testCase2() {
        assertEquals("1211", new CountAndSay().countAndSay(4));
    }
}
