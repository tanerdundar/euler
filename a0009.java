package project.euler;

public class a0009 {

	public static void main(String[] args) {

		int sum =0;
		for(int p=0;p<501;p++) {
			for(int q =0;q<501;q++) {
				double x = p*p+q*q;
				double c= Math.sqrt(x);
				double f = q+p+c;
				if (f==1000 & p<q & q!=0 & p!=0 & c!=0) {
					System.out.println(p + "  " +q+ "  " + c);
				System.out.println(f);
				}
				sum++;
			}
		}
		
	}

}
