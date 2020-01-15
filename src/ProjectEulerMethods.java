import java.math.BigInteger;
import java.util.ArrayList;

public class ProjectEulerMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("TEST");
		System.out.println(euler20(100));
		euler2(4000000);
	}
	
	public static void euler2(int max) {
		
		//Step 1: Create a list
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		
		int nTerm = list.get(0) + list.get(1);
		list.add(nTerm);
		
		while (nTerm < max) {
			int len = list.size();
			nTerm = list.get(len - 2) + list.get(len - 1);
			list.add(nTerm);
		}
		list.remove(list.size() - 1);
		
		//Question: Can you write a loop to go through a collection and 
		//			add the even numbers?
		
		
		System.out.println(list);
		
		
	}
	public static int euler19(int year) {
		
		//Write the code to find all the multiple of 3 and 5 less than n
		int num = year - 1990;
		
		return 1;
		
	}
	
	
	public static ArrayList<Integer> getFactorList(int n) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
	}
	public static int euler21(int n) {
		ArrayList<Integer> amNum = new ArrayList<Integer>();
		
		for (int i = 0; i < n; i = i + 1) {
			
		}
		
		return 1;
		
	}
	
	
	public static long euler20(int n) {
		BigInteger l = new BigInteger("1");
		long s = 0;
		
		for (int i = 1; i < n; i = i + 1) {
			l = l.multiply(BigInteger.valueOf(i));
		}
		
		String lstr = l.toString();
		for (int i = 0; i < lstr.length(); i = i + 1) {
			s = s + Integer.parseInt(""+lstr.charAt(i));
		}
		
		return s;
	}
	
	

}
