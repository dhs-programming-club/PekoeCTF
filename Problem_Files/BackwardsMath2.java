public class BackwardsMath2 {
	public static void main(String[] args) {
		String flag = "";
		int x = ...

		int k = 0;
		for (int i = 0; i < flag.length(); i++) {
			k += (i % 2 == 0 ? 1 : -1) * (int) flag.charAt(i);
			System.out.println(k / (float) x);
		}
	}
}