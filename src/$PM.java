
public class $PM {

	
//START
//**************************CLASS WORK (Thursday, September 23rd (P4)*************************************
	
	/**
	 * 
	 * @param nums
	 * @param a
	 * @return
	 */
	public static boolean linearSearch(int[] nums, int a) {
		//CODE NEEDED
		for (int i = 0; i < nums.length; i = i + 1) {
			if (nums[i] == a) {
				return true;
			}
		}
		
		
		return false;
	}
	
	
	/**
	 * 
	 * @param n
	 * @return
	 * 
	 * precondition: n must be an integer containing only the values 0 or 1. 
	 * 
	 */
	public static int base2To10(int n) {
		//CODE NEEDED
		int power = 0;
		int result = 0;
		
				
		
		while (n > 0) {
			//Core Technique - Accessing units digit
			int x = n%10;  
			n = n /10;
			
			result = result + x * (int)(Math.pow(2,power));
			power = power + 1;
			
		
		}
		
		return result;
		
		
		

	}
	
	
	/**
	 * This method takes a positive base 10 integer and returns a binary representation. 
	 * 
	 * @param n
	 * @return
	 * 
	 * precondition: n must be a positive integer value. 
	 * 
	 */
	public static int base10To2(int n) {
		
		//Why does storing the result in string makes sense here?
		//
		String result = "0";
		
		while (n != 0) {
			
			int value = n % 2;
			System.out.println(value);
			n = n / 2; //integer division
			result = ""+value + result;
			
				
		}
		
		return Integer.parseInt(result);
		
	}
	
	
//**************************CLASS WORK (Thursday, September 23rd (P4)*************************************
//END
	
	
	public static void print(String s) {
		
		System.out.println(s);
	}
	
	/**
	 * This takes two strings a and b and returns a + b
	 * @param a
	 * @param b
	 * @return
	 * 
	 * preconditions - a and b are valid strings 
	 * postconditions - no post conditions
	 * 
	 */
	public static String addStrings(String a, String b) {
		
		return a + b;
	}
	
	/**
	 * This method takes a string as a parameter and returns
	 * true if it is even length and false if it is odd length
	 * @param a
	 * @return
	 */
	public static boolean isEvenString(String a) {
		
		return a.length() % 2 == 0;
		
	}
	
	/**
	 * 
	 * @param a
	 * @param n
	 * @return
	 */
	public static String pullN(String a, int n) {
		
		if (n > a.length()) {
			return a;
		}
		
		String result = a.substring(0,n);
		
		return result;
		
	}
	
	/**
	 * This function takes an array of integers and 
	 * returns the average as a double. 
	 * @param a
	 * @return
	 */
	public static double calcEvenAverage(int[] a) {
		
		double sum = 0;
		int ctr = 0;
		
		for (int i = 0; i < a.length; i = i + 1) {
			if (a[i] % 2 == 0) {
				sum = sum + a[i];
				ctr = ctr + 1;
			}
		}
		
		double average = sum/ctr;
		return average;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		print("Paul");
		//Test Code addString
		System.out.println(addStrings("Paul","Miskew"));
		
		int[] nums = {1,2,3,4,5,6};
		double value = calcEvenAverage(nums);
		System.out.println(value);
		
		
		//Test Code base2To10
		System.out.println(base2To10(100000));
		
		//Test Code base10To2
		System.out.println(base10To2(5));
		
	}

}
