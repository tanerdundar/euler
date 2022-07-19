package project.euler;

import java.math.BigDecimal;
import java.math.BigInteger;

public class a0016 {

	public static void main(String[] args) {

		int result = 0;
		 
		BigInteger number = BigInteger.modPow(2, 1000);
		 
		while (number > 0) {
		    result += (int) (number % 10);
		    number /= 10;
		}
			
	}

}
