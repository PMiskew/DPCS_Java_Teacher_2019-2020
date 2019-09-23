import java.util.ArrayList;
import java.util.Stack;

public class OnePager08Stacks {

	public static void main(String[] args) {

		//Question 1: 
		//For this exercise assume an ArrayList is the "COLLECTION"
		//An extension here is think about if the question indicated which
		//element should be at the base of the stack. 
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		Stack<Integer> stack1 = new Stack<>();

		list1.add(1);
		list1.add(5);
		list1.add(99);
		list1.add(4);
		
		while (list1.size() > 0) {
			stack1.push(list1.remove(0));
		}
		System.out.println(stack1);
		
		
	}

}
