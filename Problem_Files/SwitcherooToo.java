import java.util.Scanner;

public class SwitcherooToo {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String flag = s.nextLine();
		s.close();
		flag = switcheroo(flag, 5, 6);
		flag = switcheroo(flag, 19, 1);
		flag = switcheroo(flag, 4, 8);
		flag = switcheroo(flag, 12, 5);
		flag = switcheroo(flag, 0, 15);
		flag = switcheroo(flag, 6, 6);
		flag = switcheroo(flag, 3, 9);
		flag = switcheroo(flag, 13, 1);
		flag = switcheroo(flag, 15, 1);
		flag = switcheroo(flag, 7, 10);
		flag = switcheroo(flag, 10, 4);
		flag = switcheroo(flag, 16, 2);
		flag = switcheroo(flag, 18, 2);
		flag = switcheroo(flag, 17, 2);
		flag = switcheroo(flag, 14, 6);
		flag = switcheroo(flag, 1, 18);
		flag = switcheroo(flag, 9, 8);
		flag = switcheroo(flag, 2, 17);
		flag = switcheroo(flag, 11, 2);
		flag = switcheroo(flag, 8, 11);
		System.out.println(flag);
	}

	public static String switcheroo(String in, int a, int b) {
		int x = 0;
		for (int i = a; i < a + b; i++) {  x += (int) in.charAt(i);  }
		return in.substring(0, a) + Character.toString((char) x) + in.substring(a + 1);
	}
}