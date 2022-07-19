package project.euler;

public class deneme {

	public static void main(String[] args) {
		
		int[] xx = {		 1,
							2,3,
						   4,5,6,
						  7,8,9,10,
					   11,12,13,14,15 
					   					};
		
		int sum =0;
		int x=sum;
		int p=sum;
		

		for(int i=x;i<p+1;i++) {
			
			sum=sum+i;
			 p=sum;
		}
		System.out.println(sum);
		
		
	}

}
