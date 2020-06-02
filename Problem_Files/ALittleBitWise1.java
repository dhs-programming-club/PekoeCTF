import java.util.Scanner;

public class ALittleBitWise1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String flag = s.nextLine();
		s.close();
		for (int i = 0; i < flag.length(); i++) {
			System.out.println("&: " + (((int) flag.charAt(i)) & 84));
			System.out.println("|: " + (((int) flag.charAt(i)) | 84));
			System.out.println();
		}
	}
}