import java.util.Arrays;

public class TempToolWork {


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
		
		//BAD - WORKS BUT VIOLATES POST CONDITION
		//Arrays.sort(s);
		//return s[0];
		
		String min = s[0];
		
		for (int i = 0; i < s.length; i = i + 1) {
			if (s[i].compareToIgnoreCase(min) < 0) {
				min = s[i];
			}
		}
		
		return min;
		
	}
	
	public static void main(String[] args) {
		
		String[] arr = {"cat","dog","fish","apple"};
		String min = findAlphaSmallest(arr);
		System.out.println(min);
		
		System.out.println("cat".compareToIgnoreCase("dog"));
		System.out.println("dog".compareToIgnoreCase("dog"));
		System.out.println("dog".compareToIgnoreCase("cat"));
		
	}

}
