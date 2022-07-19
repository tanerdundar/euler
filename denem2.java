package project.euler;

public class denem2 {
	
	int[] ppp = new int[10];

	public static void main(String[] args)  {
		
		denem2 s = new denem2();
		try {
			s.asd();	
		}
//		catch (Throwable ff){
//			System.out.println("asd");
//		} 
		catch (ArrayIndexOutOfBoundsException ff){
			System.out.println("add");
		
		}		
	}
	public void asd()  throws ArrayIndexOutOfBoundsException {
	fgh();
	}
	
	public void fgh () throws ArrayIndexOutOfBoundsException {
		ArrayIndexOutOfBoundsException xx = new ArrayIndexOutOfBoundsException();
		ppp[12] = 11;
		ppp[16] = 17;
		
		throw xx ;
		
	}
	
//	public static void main(String[] args)  {
//		
//		denem2 s = new denem2();
//			s.asd();	
//			
//	}
//	public void asd()   {
//	fgh();
//	}
//	
//	public void fgh ()  {
//
//		ppp[12] = 11;
//		ppp[16] = 17;
//		
//		
//	}

}
