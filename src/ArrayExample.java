
public class ArrayExample {

	public static void main(String[] args) {

		//A DATA STRUCTURE is some way to organize data in a program
		//An array holds a COLLECTION of data of the same type
		//An array is a STATIC DATA STRUCTURE - The size must be set before using it. 
		//An array is a REFERENCE TYPE
		
		//Creates an array called nums - Length = 4
		int[] nums = new int[4]; //Indexes - 0 to 3
		String[] words = new String[10]; //Length 10, Indexes 0 - 9
		boolean[] flags = new boolean[2]; //Length 2, Indexes 0 - 1
		double[] heights = new double[25]; //Length 25, Indexes 0 - 2
		
		//By default:
		//numeric types all get set to 0
		//booleans get set to false
		//Strings get set to null - null means there is nothing there
		
		//Predefine Values
		//You can create an array and predefine the values
		int[] nums2 = {1,2,3,4}; //Length = 4, indexes 0 - 3
		String[] words2 = {"Monkey","Fish"}; //Length = 2, Indexes 0 - 1
		
		//Finding the length
		//The length of an array is stored as a public constant in the Array Object.  
		//Why is the length so important:  
		//	The length is essential because when generalizing an approach we use the 
		//	length as a starting point to calculate a specific point in the array.  
		// 	This is then used for accessing a specific element or in a loop structure.
		//IB POINT: 
		//	The IB uses the generic term COLLECTION to represent a variety of data structures
		//	When using a collection the length is unknown and cannot be accessed.  Read questions
		//	very carefully and ensure you are working with an array and not a generic collection. 
		//	On the IB exam you can use any reasonable notation to indicate the length of an array. 
		
		
		int lennums = nums.length;
		//Accessing Elements
		nums[1] = 5;
		nums[3] = 2;
		
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		
	}

}
