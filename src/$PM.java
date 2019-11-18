import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class $PM {
	
	
/***********************************************MAIN FUNCTION*******************************
	/**
	 * MAIN FUNCTION
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Variables to use
		
		
		int[] arr = {23,12,89};
		int[] arr2 = {2,12,89};
		
		//Test Code: 
		//System.out.println(findArrayDigitSum(arr));
		//System.out.println(findArrayDigitSumSTR(arr2));
		//System.out.println(Arrays.toString(inputIntArray()));
		
		
		Queue<String> q1 = new LinkedList<>();
		q1.add("one"); //
		q1.add("two");
		q1.add("three");
		System.out.println(q1);
		reverseQueue(q1);
		System.out.println(q1);
		
	}
	

/***********************************************MAIN FUNCTION*******************************/

	
/***********************************************Class November 18th (HL)**************************/
	


/**
 * This function takes three ints.  It returns and array of integers values where b <= a[n] <= c.
 * If a < 0 then the function should return a null reference. 
 * 
 *
 * @param a
 * @param b
 * @param c
 * @return
 * 
 * precondition b <= c
 * 
 */
public static int[] createRandomArray(int a, int b, int c)  {
	
	//Create an array of ints length a
	//type[] name = new type[size];
	
	int[] arr = new int[a];
	
	for (int i = 0; i < arr.length; i = i + 1) {
	
		arr[i] = b;
	
	}
	
	return arr;
}


/**
 * This function takes an array of integers and a single int.  It returns true if 
 * b is contained in the array a.  It returns false otherwise. 
 * @param a
 * @param b
 * @return
 */
public static boolean foundElement(int a[], int b) {
	//CODE HERE
	return false;
	
	
}

/**
 * This function takes two integers r and c.  It return a 2D array with dimensions [rows][columns]
 * The array is populated with integers from 1 to rows * columns in a ROW MAJOR ORDER
 * 
 * For example rows = 3, columns = 4 the below array is returned. 
 * 
 * 1,  2,  3,  4
 * 5,  6,  7,  8
 * 9, 10, 11, 12
 * 
 * @param rows
 * @param columns
 * @return
 */
public static int[][] createMatrix(int rows, int columns) {
	
	//CODE HERE
	return null;
}

/**
 * This function counts the number of primes that are less than the parameter a
 * @param a
 * @return
 */
public static int countPrime(int a) {
	
	return 0;
	
}
/***********************************************Class November 5th (HL)**************************/

	/**
	 * This method is a solution to test 1-3 #6.  Students struggled taking two
	 * nested for loops and writing it as a single while loop.  They missed the 
	 * idea that they need to duplicate the effect of structure, which was print
	 * 1 to n
	 * 
	 * @param n
	 */
	public void test1_3_6(int n) {
		
		int k = 1;
		while (k < n) {
			System.out.println(k);
			k = k + 1;
		}
		
		
	}//end test1_3_6
	
	
	
/***********************************************Class November 5th (HL)**************************/
	
	/**
	 * This function takes a queue as an argument and will reverse the queue
	 * 
	 * @param q
	 * 
	 * @postcondition: q is reversed. 
	 */
	public static void reverseQueue(Queue<String> q) {
		
		Stack<String> s = new Stack<String>();
		//Empty the queue and fill up the stack
		while (!q.isEmpty()) {
			s.push(q.remove());
		}
		//Empty stack and put it back in the queue
		while (!s.isEmpty()) {
			q.add(s.pop());
		}
		
	}

	
	
	
/**
 * This function takes an array of strings and a single string.  It returns true if the string l is 
 * contained within arr. 
 * @param arr
 * @param l
 * @return
 */
public static boolean containsString(String[] arr, String l) {
	
	
	return false;
}
	
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
//**************************CLASS WORK (Tuesday, October 15th (P3)*************************************
	/**
	 * This function takes an array of strings and finds the largest value 
	 * alphabetically. If the array is empty the function returns null
	 * @param s
	 * @return
	 * 
	 * precondition: The array can be any length but must exist
	 * postcondition: The array is left unchanged. 
	 */
	public static String findAlphaSmallest(String[] s) {
		
		//BAD - WORKS BUT VIOLATES POST CONDITION - By using the STATIC function
		//sort in the arrays class the order of s will be changed. 
		//Arrays.sort(s);
		//return s[0];
		
		/*
		//STUDENT QUESTION:
		// Question: Can't we create another array?
		//		
		// Answer: 	Yes.  However, be careful the below line of code
		//			copies the reference not the actual data so you 
		//			have 2 references and one object.  Meaning any 
		//			changes affect s
		
		 	String[] temps = s; //BAD!!!
		//
		// 
		 	//fine but inefficient. If you are looping through you might as well
		 	//find smallest. 
		 	 
		 	String[] temp = new String[s.length];
		 	for (int i = 0; i < s.length; i = i + 1) {
		 		temp[i] = s[i];
		 	}
		 	
		//*/
		
		
		String min = s[0];
		
		for (int i = 0; i < s.length; i = i + 1) {
			if (s[i].compareToIgnoreCase(min) < 0) {
				min = s[i];
			}
		}
		
		return min;
		
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
	
	/**
	 * Takes a single int that sets the size of an array
	 * Takes all integer inputs. Returns the array
	 * @return
	 */
	public static int[] inputIntArray() {
		
		//Step 1: Create Scanner
		Scanner s = new Scanner(System.in);
		
		System.out.print("How many elements: ");
		int n = s.nextInt(); //instance method, called with an instance s
		
		int[] result = new int[n];
		
		for (int i = 0; i < n; i = i + 1) {
			System.out.print("Input value: ");
			result[i] = s.nextInt();
			
		}
		
		return result;
		//Extension Suggestions:
		// - Create a method that randomly generates an array of ints
		// - Create a version that takes another type
		// - Create a version where the size is passed as a parameter. 
		// - Create a version where you have an upper and lower parameter that restrict inputs.
		
		
		
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
