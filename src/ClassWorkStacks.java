import java.util.Scanner;
import java.util.Stack;

public class ClassWorkStacks {

	public static void main(String[] args) {
		
		
		 // Creating a Stack
        //REFERENCE TYPE = new OBJECT TYPE
		Stack<String> s1 = new Stack<>();
        //Reference Type: 	It tells you what to expect
		//					when you follow the reference
		//					to the object. 
		//Object Type: 		This is what you actually find. 
		
		//Generally at this stage the object type and reference
		//type match.  Eventually they won't 
		Scanner s = new Scanner(System.in);
		Object os = new Scanner(System.in); //bad but valid
		//Scanner so = new Object(); //INVALID
	
		
		
		s1.push("one");
		s1.push("two");
		s1.push("three");
		System.out.println(s1);
		String result = findSmallest(s1);
		System.out.println(result);
		System.out.println(s1);
	}
	
	/**
	 * A stack S has an unknown number of strings.  Write pseudocode 
	 * to output the alphabetically smallest value.  The stack must 
	 * be left unchanged at the end. 
	 * @param s
	 * 
	 */
	public static String findSmallest(Stack<String> s) {
		
		//From a pure IB perspective there are a limited number of functions.  However, 
		//Java does have some additional instance methods that can be applied to stacks.
		//You can use these on your exam, however, ensure you comment what they do. For example
		//Java has the function peek() which looks at but doesn't pop the top element on the stack
		
		Stack<String> temp = new Stack<String>();
		
		String min = s.pop();
		s.push(min);
		
		while (!s.isEmpty()) {
			
			String strtemp = s.pop();
			temp.push(strtemp);
			
			if (min.compareToIgnoreCase(strtemp) > 0) {
				min = strtemp;
			}
			
		}
		
		//push everything back onto s
		while (!temp.isEmpty()) {
			
			s.push(temp.pop());
			
		}
		
		return min;
		//
		
		
		
	}

}
