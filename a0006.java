package project.euler;

import java.util.Scanner;

public class a0006 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Lütfen iþlem yapmak istediðiniz sayýyý girinz.");
		
		int p = sc.nextInt();
		int sumOfSquares = squares(p);
		int squareOfSum = squareOfSum(p);
		int lastSum = squareOfSum -sumOfSquares;
		System.out.println(lastSum);

	}
	public static int squares(int number) {
		int sum =0;
		for (int i =0;i<number+1;i++) {
			int x= i*i;
			sum += x;
		}
		return sum;
	}
	public static int squareOfSum(int number) {
		int sum =0;
		for (int i =0;i<number+1;i++) {
			sum += i;
		}
		int square = sum*sum;
		return square;
	}

}

