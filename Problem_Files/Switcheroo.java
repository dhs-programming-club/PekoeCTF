import java.util.Scanner;

public class Switcheroo {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String flag = s.nextLine();
		s.close();
		flag = switcheroo(flag, 28, 22);
		flag = switcheroo(flag, 15, 25);
		flag = switcheroo(flag, 3, 20);
		flag = switcheroo(flag, 2, 6);
		flag = switcheroo(flag, 30, 11);
		flag = switcheroo(flag, 12, 31);
		flag = switcheroo(flag, 21, 7);
		flag = switcheroo(flag, 11, 0);
		flag = switcheroo(flag, 8, 23);
		flag = switcheroo(flag, 29, 13);
		flag = switcheroo(flag, 6, 15);
		flag = switcheroo(flag, 33, 5);
		flag = switcheroo(flag, 16, 30);
		flag = switcheroo(flag, 7, 34);
		flag = switcheroo(flag, 19, 29);
		flag = switcheroo(flag, 13, 14);
		flag = switcheroo(flag, 9, 19);
		flag = switcheroo(flag, 0, 33);
		flag = switcheroo(flag, 22, 18);
		flag = switcheroo(flag, 1, 27);
		flag = switcheroo(flag, 31, 28);
		flag = switcheroo(flag, 34, 2);
		flag = switcheroo(flag, 10, 24);
		flag = switcheroo(flag, 27, 9);
		flag = switcheroo(flag, 5, 10);
		flag = switcheroo(flag, 14, 3);
		flag = switcheroo(flag, 20, 8);
		flag = switcheroo(flag, 23, 1);
		flag = switcheroo(flag, 35, 36);
		flag = switcheroo(flag, 17, 4);
		flag = switcheroo(flag, 36, 32);
		flag = switcheroo(flag, 24, 21);
		flag = switcheroo(flag, 4, 12);
		flag = switcheroo(flag, 26, 35);
		flag = switcheroo(flag, 25, 17);
		flag = switcheroo(flag, 18, 26);
		flag = switcheroo(flag, 32, 16);
		System.out.println(flag);
	}

	public static String switcheroo(String in, int a, int b) {
		return in.substring(0, a) + Character.toString((char) ((int) in.charAt(a) + (int) in.charAt(b))) + in.substring(a + 1);
	}
}