package project.euler;

public class a0010 {

	public static void main(String[] args) {

		a0010 x = new a0010();
		long k = x.asalSayýsý(2_000_000);
		System.out.println(k);

	}

	boolean isPrime(int n) {
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

	long asalSayýsý(int n) {
		int numberOfPrimes = 0;
		long sum = 0L;
		for (int i = 2; i < n; i++) {
			boolean prime = isPrime(i);
			if (prime) {
				numberOfPrimes++;
				sum = sum + i;
			}
		}
		System.out.println(n + " sayýsýna kadar " + numberOfPrimes + " tane asal sayý var.");
		return sum;
	}

}