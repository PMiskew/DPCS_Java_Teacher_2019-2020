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
	
	public static void main(String[] args) {
		
		String[] arr = {"cat","dog","fish","apple"};
		String min = findAlphaSmallest(arr);
		System.out.println(min);
		
		System.out.println("cat".compareToIgnoreCase("dog"));
		System.out.println("dog".compareToIgnoreCase("dog"));
		System.out.println("dog".compareToIgnoreCase("cat"));
		
	}

}
