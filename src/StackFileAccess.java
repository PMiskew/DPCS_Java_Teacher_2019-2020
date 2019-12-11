import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Stack;

public class StackFileAccess {
//1. Reference Types
//2. Stacks 
//3. Try Catch
//4. Scope - Where a variable is accessible. 
//			 We define the scope of a variable from the 
//			 preceding brace to its pair
//		
//		{
//			int a = 9
//			{
//				int b = 10;
//				a = 44; //OKAY
//			}
//			a = 11; //OKAY
//			b = 12; //ERROR
//
//		}
	public static void main (String[] args) {
		
		//COPY THIS INTO YOUR MAIN!
		Stack<Integer> stack1 = readToIntStack("dataINT.txt");
		System.out.println(stack1);
		Stack<Integer> stack2 = new Stack<Integer>();
		
		
		int r = 10;
		
		for (int i = 0; i < r; i++ ) {
			int v = (int)(Math.random()*100); 
			stack2.add(v);
		}
		
		System.out.println(stack2);
		System.out.println("METHOD RUN");
		writeIntStackToFile(stack2,"dataInINT.txt");
		System.out.println(stack2);
		
	}
	
	/**
	 * 
	 * @param stack
	 * @param file
	 * Post-condition - stack is left unchanged 
	 */
	public static void writeIntStackToFile(Stack<Integer> stack, String file) {
		
		try {
			
			File f = new File(file);
			FileWriter fw = new FileWriter(f);
			PrintWriter pw = new PrintWriter(fw);
			
			
			//IB APPROACH - MORE LEARNING HERE!
			
			while (!stack.isEmpty()) {
				pw.println(stack.pop());
			}
			
			
			//ADAM'S APPROACH - JAVA SPECIFIC AND GREAT!
			/*
			int size = stack.size();
			
			for (int i = 0; i < size; i = i + 1) {
				pw.println(stack.get(i));
			}
			//*/
			
			pw.close();
			
		}
		catch(Exception e) {
			
			System.out.println("ERROR WRITE INTO TO STACK TO FILE");
		}
		
	}
	/**
	 * This method takes a string that represents a file name.
	 * It copies the content of the file into a stack and returns
	 * the stack.  If the file name is bad, null is returned. 
	 * @param file
	 * @return
	 */
	public static Stack<Integer> readToIntStack(String file) {
		
		try {
			File f = new File(file);
			Scanner s = new Scanner(f);
			
			Stack<Integer> stack = new Stack<Integer>();
			
			while (s.hasNext()) {
				stack.push(s.nextInt());
			}
			return stack;
		}
		catch(Exception e) {
			System.out.println("FILE NOT FOUND");
			
		}
		
		return null;
	}
}
