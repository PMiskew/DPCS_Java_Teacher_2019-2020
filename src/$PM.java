import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class $PM {
	
	
//YEAR 12 HL FUNCTIONS
	
	/**
	 * This function takes a stack as an argument and does not return anything
	 * @param stack
	 * 
	 * pre-condition: stack is not null
	 * post-condition: argument stack is reversed.
	 * 
	 * LEARNING:  This highlights the power of reference variables.  Since a stack is a 
	 * reference variable there is no need to return it for changes to take effect. 
	 */
	public static void reverseStack(Stack<String> stack) {
		System.out.println("Test");
        Queue<String> waitingQueue = new LinkedList<String>();
        Stack<String> newStack = new Stack<String>();
        

        	
		while (!stack.isEmpty()) {
			
			waitingQueue.add(stack.pop());
			
		}
		
		while (!waitingQueue.isEmpty()) {
			stack.push(waitingQueue.remove());
		}
		

	}
	
	/**
	 * 
	 * @param stack
	 */
	public static void examQuestion2015_13(Stack<Object> stack) {
	
		while (!stack.isEmpty()) {
			
			int steps = (int) stack.pop();
			System.out.println("Take "+steps+" steps");
			int turn = (int) stack.pop();
			
			if (turn == 0) {
				System.out.println("Turn Left");
			}
			else {
				System.out.println("Turn Right");
			}
			
			
		}
		
		
		
		
	}
	
	
//START
//**************************CLASS WORK (Thursday, October 10th (P2)*************************************
	
	/**
	 * This function takes an array of integers and returns 
	 * the sum of the digits. 
	 * @param a
	 * @return
	 * 
	 * pre-condition: All elements are 2 digit in length
	 * post-condition: a is not changed when the function is done. 
	 * 
	 */
	public static int findArrayDigitSum(int[] a) {
	
		//I WILL MAKE A VIDEO SOLUTION TO THIS. 
		int sum = 0;
		
		//loop through array
		for (int i = 0; i < a.length; i = i + 1) {
			
			int temp = a[i]; //ASSIGNMENT STATEMENT
			int n1 = temp%10;
			int n2 = temp/10; //JAVA SPECIFIC INT/INT --> INT DIVISION
			sum = sum + n1 + n2;
		}
		
	
		return sum;
	}

	/**
	 * This function takes an array of integers and returns 
	 * the sum of the digits.  This is an alternate implementation
	 * that treats the digit as a string. 
	 * @param a
	 * @return
	 * 
	 * pre-condition: All elements are 2 digit in length
	 * post-condition: a is not changed when the function is done. 
	 * 
	 */
	public static int findArrayDigitSumSTR(int[] a) {
	
		int sum = 0;
		
		for (int i = 0; i < a.length; i = i + 1) {
			
			//CASTING - Process of changing type.
			String temp = "" + a[i];
			String n1 = temp.substring(0,1);
			
			String n2 = "0";
			
			if (temp.length() > 1) {
				n2 = temp.substring(1,2);
			}
			sum = sum + Integer.parseInt(n1) + Integer.parseInt(n2);
		
		}
		
		return sum;
		
		
	}
	
	
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Variables to use
		int[] arr = {23,12,89};
		int[] arr2 = {2,12,89};
		System.out.println(findArrayDigitSum(arr));
		System.out.println(findArrayDigitSumSTR(arr2));
	}
	
//START
//**************************CLASS WORK (Monday, September 30rd (P2)*************************************

	public static int base10ToBase2(int n) {
		
		/*
		 * If I divide two integers in java it automatically
		 * does integer division
		 * int x = 7;
		 * int y = 3;
		 * int z = x/y --> 2
		 */
		String r = "";
	
		
		while (n > 0) {
			
			int x = n%2;
			n = n / 2; //This is integer division. 
			r = x + r;
			
		}
		
		//Changing Type:
		//Changing type is called "casting"
		//In Java (and all languages) there are "shortcuts"
	
		return Integer.parseInt(r);
			
		
	}
	
	//If you fininsh this, create a version that does
	//base 10 to base n
	
	/**
	 * 
	 * @param n
	 * @param base
	 * @return
	 * 
	 * precondition: n < 10
	 * 
	 */
	public static int base10toBaseN(int n, int base) {
		
		/*
		 * If I divide two integers in java it automatically
		 * does integer division
		 * int x = 7;
		 * int y = 3;
		 * int z = x/y --> 2
		 */
		String r = ""; 
	
		
		while (n > 0) {
			
			int x = n%base;
			n = n / base; //This is integer division. 
			r = x + r;
			
		}
		
		//Changing Type:
		//Changing type is called "casting"
		//In Java (and all languages) there are "shortcuts"
	
		return Integer.parseInt(r);
			
		
	}
//START
//**************************CLASS WORK (Thursday, September 23rd (P4)*************************************
	
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
	
	
	
	
//**************************CLASS WORK (Thursday, September 23rd (P4)*************************************
//END
	

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
			result = ""+ value + result;
			
			
				
		}
		
		return Integer.parseInt(result);
		
	}
	
	
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
	


}
