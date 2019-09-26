
public class TempToolWork {

	/**
	 * This method takes a base 2 value and returns the base 10 value
	 * @param n
	 * @return
	 * 
	 * pre-condition: n can only contain 1 and 0 values. 
	 */
	public static int base2To10A(int n) {
		
		int pwr = 0;
		int r = 0;
		
		while (n > 0) {
			
			int x = n % 10;
			n = n / 10; //INTEGER DIVISION
			
			//Cast Math.pow(2,pwr) to an int
			//Casting is the process of changing type
			//When we cast a double to an int we chop off decimal
			r = r + x * (int)Math.pow(2, pwr);
			
			pwr = pwr + 1;
		
		}
		

		return r;
		
		
	}
	
	
	public static int base2To10B(int n) {
		
		/*
		 * Convert to a string instead of using the mod int div process
		 */
		//convert n into a string?
		String value = "" + n;
		int pwr = 0;
		int r = 0;
		
		//Bread and butter algorithm: looping through a string and accessing 
		//each element. Looping through string or array in reverse
		
		for (int i = value.length() - 1; i >= 0; i = i - 1) {
			
			//Step 1: access the right most digit cast to int
			//WORKS
			//int x = Integer.parseInt(value.substring(i,i + 1));
			//WORKS: MUST CAST char to stirng using "" + char
			int x = Integer.parseInt(""+value.charAt(i));
			
			r = r + x*(int)Math.pow(2,pwr);
			pwr = pwr + 1;
			
		}
		return r;
		
		
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		//Test code base2ToBase10A
		System.out.println("***********Base 2 to 10A**************");
		int x = base2To10A(1011);
		System.out.println(x);
		x = base2To10A(0);
		System.out.println(x);
		

		System.out.println("***********Base 2 to 10B**************");
		x = base2To10A(1011);
		System.out.println(x);
		x = base2To10B(0);
		System.out.println(x);
		

	}

}
