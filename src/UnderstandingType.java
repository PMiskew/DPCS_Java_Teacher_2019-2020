import java.util.Arrays;

public class UnderstandingType {

	public static void main(String[] args) {

		//Broad Classifications
		// primitive types: This means the data is stored at 
		//					the location in memory. 
		// int x = 4; //A "box" is made in memory and 4 is stored in the box.
		//
		//Primitive types are simple there are clear rules that define them
		//For example all ints take 32 bits of memory. 
		//When we pass primitive types we pass a COPY of the data
		
		
		int x = 4;
		int y = x;
		y = y + 1;
		System.out.println("x: "+x);
		System.out.println("y: "+y);
		
		//Methods
		doThis(x);
		System.out.println("x: "+x);
		
		//Reference Types:
		//Reference types are complicated.  They have various memory requirements. 
		//You can't put it in the "box".  The memory location stores a refercne to where
		//the data lives. 
		int[] a = {1,2,3};
		int[] b = a;
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		b[0] = 99;
		System.out.println(Arrays.toString(a));
		
		//BUT WHY
		String s1 = "Paul";
		String s2 = s1;
		s2 = s2 + "!";
		System.out.println("s1: "+s1);
		System.out.println("s2: "+s2);
		
		//There are a couple special classes that act as primitive types.  These are 
		//String, Double, Integer, Boolean, Character
		
		
		
	}
	
	public static void doThis(int a) {
		a = a + 1;
	}
	
	

}
