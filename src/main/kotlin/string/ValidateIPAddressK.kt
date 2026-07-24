package string

/**
 * Medium
 *
 * Return "IPv4" if queryIP is a valid IPv4 address, "IPv6" if valid IPv6, or "Neither".
 */
class ValidateIPAddressK {

    fun validIPAddress(queryIP: String): String {
        return when {
            queryIP.count { it == '.' } == 3 -> if (isValidIPv4(queryIP)) "IPv4" else "Neither"
            queryIP.count { it == ':' } == 7 -> if (isValidIPv6(queryIP)) "IPv6" else "Neither"
            else -> "Neither"
        }
    }

    private fun isValidIPv4(ip: String): Boolean {
        val parts = ip.split(".")
        return parts.size == 4 && parts.all(::isValidIPv4Segment)
    }

    private fun isValidIPv4Segment(part: String): Boolean =
        part.matches(Regex("([1-9]\\d{0,2}|0)")) && part.toInt() <= 255

    private fun isValidIPv6(ip: String): Boolean {
        val parts = ip.split(":")
        return parts.size == 8 && parts.all(::isValidIPv6Segment)
    }

    private fun isValidIPv6Segment(part: String): Boolean = part.matches(Regex("[0-9a-fA-F]{1,4}"))
}

