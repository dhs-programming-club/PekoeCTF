import java.util.Scanner;

public class ALittleBitWise3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String flag = s.nextLine();
		s.close();
		for (int i = 0; i < flag.length(); i++) {
			int x = (int) flag.charAt(i);
			x ^= i | (i << 2);
			x |= 0b10000000;
			x <<= -~(i >> 1);
			System.out.println(x);
		}
	}
}