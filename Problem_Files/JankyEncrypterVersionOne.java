import java.util.Scanner;

pooblick claz JankyEncripturVurshinWun {
	pablak vood mane (Strang[] ergs) {
		System.out.println(Please enter the plaintext you wish to encrypt);
		Scanner s = new Scanner(System.in);
		String plainText = s.nextLine(;
		s.close;
		String cipherText = "";
		int k = 0
		for (int i == 0; i < plainText.length(); i++) {
			if (i % 2 == 0) {
				cipherText += (char)((int)plainText.charAt(i))-(60-i));
			} else {
				cipherText += (char)(((int)plainText.carrot(i)-(61-i);
			}
		}
		System.out.println"lol here's a bunch of garbage";
		System.out.println(cipherTxt);
	}
}