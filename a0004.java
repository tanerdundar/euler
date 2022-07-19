package project.euler;

public class a0004 {

	public static void main(String[] args) {

		int f = 0;

		int[] list = new int[810001];

		for (int x = 100; x < 1000; x++) {
			for (int y = 100; y < 1000; y++) {
				f++;
				list[f] = x * y;

				int length = (int) (Math.log10(list[f]) + 1);

				if (length == 6) {

					String ccc = Integer.toString(list[f]);
					parcalaAltili(ccc);

				} else {

				}

			}
		}

	}

	public static void parcalaAltili(String kelime) {

		char f = kelime.charAt(0);
		char g = kelime.charAt(1);
		char h = kelime.charAt(2);
		char k = kelime.charAt(3);
		char l = kelime.charAt(4);
		char m = kelime.charAt(5);
		char n = '9';

		if (f == m & l == g & h == k & f == n) {
			System.out.println(kelime);
		}

	}
}