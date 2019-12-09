
public class ArrayDemo {

	public static void main(String[] args) {

		//A DATA STRUCTURE is some way to organize data in a program
		//An array holds a COLLECTION of data of the same type
		//An array is a STATIC DATA STRUCTURE - The size must be set before using it. 
		//An array is a REFERENCE TYPE
		System.out.println("hello".substring(2));
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
		nums[1] = 5;  //accesses index 1 in array nums
		nums[3] = 2;  //acceses index 3 in array nums
		nums[lennums - 1] = 3; //accesses last index of nums and sets to 3
		
		
		//CAUTION: 
		//The below line will print out the memory reference to nums, not the values. 
		//This is because it is a reference variable with not built in function to print. 
		//We explore what this means more below. 
		
		System.out.println(nums);
		
		//PRINT OUT ARRAY QUICK
		//To print out the array quickly we use a built in method in the Arrays 
		
		//accesses last element in nums
		
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		
		
		
		//Looping Through an array

		//Why learn this?
		//	Learning how to loop through an array is essential for algorithm development. 
		//	By looping through an array you can check elements in sequence and perform a number
		//	of useful processes such as finding a totol, maximum, minimum or the average.  

		//How do I think of loops?
		//	I think of the count, check, change.  This was an approach shared by a student and it
		//	really resonated with many others in the class.  
		//	for (<count>, <check>, <change>)
		// 	count = the variable we use and where we start
		//	check = the check we do once at the start and each time the loop runs
		//	change = the change that is made at the end of the loop. 
		
		//Front to End
		
		System.out.println("PRINTED ELEMENTS FRONT TO END");
		for (int i = 0; i < nums.length; i = i + 1) {
			System.out.println(nums[i]);
			
		}
		
		//End to start
		System.out.println("PRINTED ELEMENTS END TO START");
		for (int i = nums.length - 1; i >= 0; i = i - 1) {
			System.out.println(nums[i]);
		}
		
		
		//REFERENCE VARIABLE:
		//  You hear this term reference variable a lot, but what does that mean. 
		//  What is this means is that the computer stores the location of the data 
		//  in the memory register for nums. When we print it out we are getting the 
		//	Hexadecimal value, which represents the location in memory.  
		
	}

}
