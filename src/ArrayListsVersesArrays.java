import java.util.ArrayList;

public class ArrayListsVersesArrays {

	public static void main(String[] args) {
		
		//Reference Type: This means the memory location
		//				  stores a reference to where the 
		//				  data lives.
		//Static Data Structure:	This means the size is
		//							fixed.
		int[] arr = new int[10]; //10 elements, index 0 to 9
		
		//Reference Type: This means the memory location
		//				  stores a reference to where the 
		//				  data lives.
		//Dynamic Data Structure:	This mean the size changes
		//							as needed. 
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println(list);
		list.add(7);
		System.out.println(list);
		
		
		
		
		
	}

}
