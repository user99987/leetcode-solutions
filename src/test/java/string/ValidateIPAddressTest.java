package string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValidateIPAddressTest {

    @Test
    public void testCase1() {
        String queryIP = "172.16.254.1";
        String expected = "IPv4";
        assertEquals(expected, new ValidateIPAddress().validIPAddress(queryIP));
    }

    @Test
    public void testCase2() {
        String queryIP = "2001:0db8:85a3:0:0:8A2E:0370:7334";
        String expected = "IPv6";
        assertEquals(expected, new ValidateIPAddress().validIPAddress(queryIP));
    }

    @Test
    public void testCase3() {
        String queryIP = "256.256.256.256";
        String expected = "Neither";
        assertEquals(expected, new ValidateIPAddress().validIPAddress(queryIP));
    }
}
