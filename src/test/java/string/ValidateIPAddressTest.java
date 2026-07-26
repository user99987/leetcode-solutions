package string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ValidateIPAddressTest {

    @Test
    public void shouldIdentifyValidIPv4Address() {
        var queryIP = "172.16.254.1";
        var expected = "IPv4";
        assertThat(new ValidateIPAddress().validIPAddress(queryIP)).isEqualTo(expected);
    }

    @Test
    public void shouldIdentifyValidIPv6Address() {
        var queryIP = "2001:0db8:85a3:0:0:8A2E:0370:7334";
        var expected = "IPv6";
        assertThat(new ValidateIPAddress().validIPAddress(queryIP)).isEqualTo(expected);
    }

    @Test
    public void shouldReturnNeitherForOutOfRangeIPv4Segments() {
        var queryIP = "256.256.256.256";
        var expected = "Neither";
        assertThat(new ValidateIPAddress().validIPAddress(queryIP)).isEqualTo(expected);
    }
}
