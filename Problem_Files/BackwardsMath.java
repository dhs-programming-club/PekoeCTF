public class BackwardsMath {
	public static void main(String[] args) {
		String flag = "";
		int k = 0;
		for (int i = 0; i < flag.length(); i++) {
			k += (i % 2 == 0 ? 1 : -1) * (int) flag.charAt(i);
			System.out.println(k);
		}
	}
}