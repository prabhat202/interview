package interview;

import java.util.regex.Pattern;

public class IPAddrValidation {

	// Function for Validating IP
	static String Validate_It(String IP) {

		// Regex expression for validating IPv4 0-255
		String regex = "(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])";

		// Regex expression for validating IPv6 0-FFFF
		String regex1 = "((([0-9a-fA-F]){1,4})\\:){7}([0-9a-fA-F]){1,4}";

		Pattern p = Pattern.compile(regex);
		Pattern p1 = Pattern.compile(regex1);

		// Checking if it is a valid IPv4 addresses
		if (p.matcher(IP).matches())
			return "Valid IPv4";

		// Checking if it is a valid IPv6 addresses
		else if (p1.matcher(IP).matches())
			return "Valid IPv6";

		// Return Invalid
		return "Invalid IP";
	}

	// Driver Code
	public static void main(String args[]) {
		// IP addresses to validate
		String IP = "255.120.223.13";
		System.out.println(Validate_It(IP));

		IP = "fffe:3465:efab:23fe:2235:6565:aaab:0001";
		System.out.println(Validate_It(IP));

		IP = "2F33:12a0:3Ea0:0302";
		System.out.println(Validate_It(IP));

	}

}
