package project.euler;

public class a0007 {

	public static void main(String[] args) {

		int primeSýrasý = 1;
		for (int i = 3;; i++) {

			if (isPrime(i) == true)
				primeSýrasý++;
			if (primeSýrasý == 10001) {
				System.out.println(i);
				break;
			}
		}

	}

	public static boolean isPrime(int n) {
		boolean prime = true;
		int i = 2;
		int upperBound = (int) (Math.sqrt(n) + 1);
		for (; i < upperBound; i++) {
			if (n % i == 0) {
				prime = false;
				break;
			}
		}

		return prime;

	}

}
