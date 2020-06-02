public class PasswordChecker {
	public static void main(String[] args) {
		String pw = "insert your password here";

		String encoded = "";
		for (int i = 0; i < pw.length(); i++) {
			encoded += (int) pw.charAt(i);
			if (i != pw.length() - 1) encoded += " ";
		}
		if (encoded.equals("112 101 107 111 101 123 112 117 101 114 95 57 99 55 55 57 97 125")) System.out.println("ACCESS GRANTED");
		else System.out.println("ACCESS DENIED");
	}
}