import java.util.Arrays;

public class TempToolWork {

	/**
	 * This function takes three ints.  It returns an array of size a of integers where b <= arr[n] <= c.
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
		
		if (a < 0) {
			return null;
		}
		
		int[] arr = new int[a];
		
		for (int i = 0; i < arr.length; i = i + 1) {
			
			int x = (int)(Math.random()*(c + 1 - b) + b);
			//Generating a random value
			arr[i] = x;
		
		}
		
		return arr;
	}
	
	
	public static boolean foundElement(int[] a, int b) {
	//THIS IS A LINEAR SEARCH!!!
		
		for (int i = 0; i < a.length; i = i + 1) {
			if (a[i] == b) {
				return true;
			}
		}
		
		return false;
	}
	
	
	public static void main(String[] args) {
	
		int[] result = createRandomArray(-7,1,9);
		System.out.println(Arrays.toString(result));
		
		
		
		
		
	}

}
