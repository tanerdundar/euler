package project.euler;

public class a0019 {

			// day number of 1 jan 1900 - 31 dec 2000 = 36891  
			// day number of every 4 years = 1461
			// every		 31 , 59 , 90 , 120 , 151 , 181 , 212 , 243 , 273 , 304 , 334 , 365 is last day of a month in year
			// at leap years 31 , 60 , 91 , 121 , 152 , 182 , 213 , 244 , 274 , 305 , 335 , 366
			// every year that has 4 as divisor is leap year
	
	
	
	public static void main(String[] args) {
		
		int dayNumbers=0;

 
		
		
		for (int t = 1 ; t<36892;t++) {
			
			for (int k = 0;k<1462;k++) {
				if(t%7==0 ) {
					
			
					int i = 365;
					int f=  730;
					
					switch (k) {
					case 31,60,91,121,152,182,213,244,274,305,335,366 : dayNumbers++  ;
					case 397,425,455,486,516,547,578,609,639,670,700,731:dayNumbers++  ;
					case 365+397,365+425,365+455,365+486,365+516,365+547,365+578,365+609,365+639,365+670,365+700,365+731:dayNumbers++  ;
					case 730+397,730+425,730+455,730+486,730+516,730+547,730+578,730+609,730+639,730+670,730+700,730+731:dayNumbers++  ;
					}
			}
				
			}

		}
		System.out.println(dayNumbers);
		

	}

}
