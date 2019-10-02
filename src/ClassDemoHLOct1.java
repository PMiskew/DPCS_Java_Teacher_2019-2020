import java.util.Arrays;

public class ClassDemoHLOct1 {

	
	public static void main(String[] args) {
	
		//This was a simple warm-up program I asked 
		//students to write in class.  It highlights
		//some essential concepts. It sets the stage
		//to discuss Stacks. 
		
		int[] a = new int[5]; //Creates an array length 5 indexs 0-4
		//BT: Numeric Types are defaults to 0
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;
		
		int[] b = {1,2,3,4,5}; //Quick way to populate array. 
		System.out.println(a);
		
		for (int i = 0; i < a.length; i = i + 1) {
			System.out.println(a[i]);
		}
		
		for (int i = a.length - 1; i >= 0; i = i - 1) {
			System.out.println(a[i]);
		}
		
		//FOR EACH LOOP
		for (int n: a) {
			System.out.println(n);
		}
		
		// REALLY NICE SHORT CUT. 
		//toString is an overloaded method.  This means there are 
		//multiple versions that have different parameters. The program
		//knows which one to pick based on the parameters. 
		System.out.println(Arrays.toString(a));
		//BT: You must be very careful when writing methods that
		//have a reference type parameters.  If you change the 
		//parameter the change is permanent. 
		doThis(a);
		System.out.println(Arrays.toString(a));
		
		//int, double, Strings, booleans are a primitive type. 
		int x = 100;
		System.out.println(x);
		doThat(x);
		System.out.println(x);
		
		
	}
	
	public static void methodA() {
		methodB();
	}
	public static void methodB() {
		
	}
	public static void methodC() {
		
	}
	public static void doThat(int n) {
		n = 99;
	}
	/**
	 * 
	 * @param n
	 * post-condition: n is changed. 
	 */
	public static void doThis(int[] n) {
		n[0] = 99;
	}
	

}
