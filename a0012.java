package project.euler;

import java.util.Arrays;

public class a0012 {

	public static void main(String[] args) {

		long start = System.currentTimeMillis();
		int sum = 0;

		for (int i = 0;; i++) {

			sum = sum + i;
			int k = bolen(sum);
			if (k > 500) {
				System.out.println(sum);
				break;
			}
			
		}
		long end = System.currentTimeMillis();
		System.out.println("Time to solve problem is " + (end - start) + " ms.");
	}
	public static int bolen(int number) {
		
		
		double x = Math.sqrt(number);
		
		int p = 0;
		if (x == (int) x) { 
			p = 1;
			}

		for (int i = 1; i * i < number; i++) {

			if (number % i == 0) {
				p += 2;
			}
		}
		return p;
	}
}