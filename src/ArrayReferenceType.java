import java.util.Arrays;

public class ArrayReferenceType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {5,3,7,9,5,2,-1,6,8,9,6,3};
		System.out.println("BEFORE FUNCTION: "+Arrays.toString(arr));
		int min = findMinB(arr);
		System.out.println("MIN = "+min);
		System.out.println("AFTER FUNTION: "+Arrays.toString(arr));
	
	}
	
	public static int findMinA(int[] arr) {
		
		int min = arr[0];
		
		for (int i = 0; i < arr.length; i = i + 1) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}
	
	public static int findMinB(int[] arr) {
		
		Arrays.sort(arr);
		int min = arr[0];
		return min;
	}
	
	

}
