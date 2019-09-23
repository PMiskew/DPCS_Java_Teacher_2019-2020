import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class OnePager08Stacks {

	public static void main(String[] args) {

		//Question 1: 
		//Why did I ask this?
		// I want to check you understand the basic push and 
		//For this exercise assume an ArrayList is the "COLLECTION"
		//An extension here is think about if the question indicated which
		//element should be at the base of the stack. 
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		Stack<Integer> stack1 = new Stack<>();

		list1.add(8);
		list1.add(1);
		list1.add(5);
		list1.add(99);
		list1.add(4);
	
		//ArrayList key point.  If you ever remove elements form the list
		//loop from the end to the start. This is because every time you 
		//remove something the indexes shift. 
		//{1,2,3,4,5,6,7} Remove 2 --> {1,3,4,5,6,7}
		for (int i = 0; i < list1.size(); i = i + 1) 
			if (list1.get(i) % 2 == 0)
				stack1.push(list1.get(i));
	
		
		System.out.println(stack1);
		
		//Question 2:
		//An array of strings called WORDS contains an unknown number of elements. 
		//Push all the elements from the array into the stack S. 

		
		String[] words2 = {"cat","fish","dog","monkey","string"};
		Stack<String> stack2 = new Stack<>();
		
		for (int i = 0; i < words2.length; i = i + 1) {
			
			stack2.push(words2[i]);
		}
		
		System.out.println(stack2);
		
		
		
		//Question 3:
		String[] words3 = {"cat","fish","dog","monkey","string"};
		Stack<String> stack3 = new Stack<>();
		
		//Loops through elements of the array. 
		for (int i = 0; i < words3.length; i =i + 1) {
			//Loop through the characters in words3[i]
			for (int j = 0; j < words3[i].length(); j = j + 1) {
				stack3.push(""+words3[i].charAt(j));
			}
		}
		
		System.out.println(stack3);
		
		//Question 4:
		Stack<Integer> stack4A = new Stack<>();
		Stack<Integer> stack4B = new Stack<>();
		Stack<Integer> stack4C = new Stack<>();

		stack4A.push(0);
		stack4A.push(1);
		stack4A.push(2);
		stack4A.push(3);
		stack4A.push(4);
		stack4A.push(5);
		
	
		//Step 1: Pop everything out into Stack4B and 4C
		int ctr = 0;
		while (!stack4A.isEmpty()) {
			if (ctr % 2 == 0) {
				stack4B.push(stack4A.pop());
			}
			else {
				stack4C.push(stack4A.pop());
			}
			ctr = ctr + 1;
		}
		
		if (ctr %2 == 0) { //
		
			//WRONG: You will end up with the stack in the wrong order. 
			//stack4A = stack4C;
			while(!stack4C.isEmpty()) {
				stack4A.push(stack4C.pop());
			}
		}	
		else {
	
			
			//WRONG: You will end up with the stack in the wrong order. 
			//stack4A = stack4B;
			while(!stack4B.isEmpty()) {
				stack4A.push(stack4B.pop());
			}
	
		
		
		}
		
		System.out.println(stack4A);
	}

}
