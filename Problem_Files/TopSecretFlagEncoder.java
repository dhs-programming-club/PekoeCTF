import java.util.Scanner;

public class TopSecretFlagEncoder {
	public static void main(String[] args) {
		System.out.println("Input your flag here.");
		Scanner s = new Scanner(System.in);
		String plainText = s.nextLine();
		s.close();
		String cipherText = "";
		int k = 0;
		for (int i = 0; i < plainText.length(); i++) {
			if (i % 2 == 0) {
				cipherText += String.valueOf(plainText.charAt(k));
			} else {
				cipherText += String.valueOf(plainText.charAt(plainText.length() - k - 1));
				k++;
			}
		}
		System.out.println(cipherText);
	}
}