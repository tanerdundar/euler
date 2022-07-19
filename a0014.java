package project.euler;

import java.util.Arrays;

public class a0014 {

	public static void main(String[] args) {

		long p = findTheBiggest(1_000_000, 15555);
		findTheBiggest(1_000_000, (int) p);

	}

	public static long findTheBiggest(int number, long c) {

		int f;

		long[] list = new long[number];
		long[] listNumber = new long[number];

		for (long t = 2L; t < 1_000_000; t++) {
			long i = t;
			int g = (int) t;
			f = 0;

			for (;;) {
				if (i == 1) {
					f++;
					if (f == c) {
						System.out.println(g);
						break;
					}
					list[g] = f;
					break;
				} else if (i % 2 == 0) {
					i /= 2;
					f++;
				} else {
					i = i * 3 + 1;
					f++;
				}
			}

		}

		Arrays.sort(list);
		long p = list[number - 1];

		return p;

	}

}
