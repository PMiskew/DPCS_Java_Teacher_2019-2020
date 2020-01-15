import java.util.Arrays;

public class Rule30 {

	
	
	
	public static void main(String[] args) {
		
		int[] seed = new int[100]; //seed array
		seed[seed.length/2] = 1; //initalize value to 1
		
		int[][] result = genRule30(seed,seed.length/2 + 1);
		
		for (int row = 0; row < result.length; row = row + 1) {
			for (int col = 0; col < result[row].length; col = col + 1) {
				System.out.print(result[row][col]);
			}
			System.out.println();
		}
	
		
	}
	
	public static int[][] genRule30(int[] a, int n) {
		
		int[][] result = new int[n][a.length];
		
		//Why not result[0] = a?
		for (int i = 0; i < a.length; i = i + 1) {
			result[0][i] = a[i];
		}
		
		for (int i = 1; i < n; i = i + 1) {
			//First element elements
			result[i][0] = ruleCheck(0,result[i - 1][0],result[i - 1][1]);	
			
			for (int j = 1; j < result[i].length - 1; j = j + 1) {
				
				result[i][j] = ruleCheck(result[i-1][j-1],result[i - 1][j],result[i - 1][j + 1]);	
			}
			
			//last elements

			result[i][result[i].length - 1] = ruleCheck(result[i - 1][result[i].length - 2],result[i - 1][result[i].length - 1],0);	
			
		}
		return result;
	}
	/*
	public static int[][] genRule30Right(int[][] result, int a) {
		
		for (int i = a+1; i < result[0].length; i = i + 1) {
			System.out.println("TEST");
			//First element elements
			result[0][i] = ruleCheck(0,result[0][i - 1],result[1][i - 1]);	
			
			for (int j = 1; j < result[i].length - 1; j = j + 1) {
				
				result[j][i] = ruleCheck(result[j - 1][i - 1],result[j][i - 1],result[j + 1][i - 1]);	
			}
			
			//last elements

			result[i][result.length - 1] = ruleCheck(result[i - 1][result[i].length - 2],result[i - 1][result[i].length - 1],0);	
			
		}
		
		for (int row = 0; row < result.length; row = row + 1) {
			for (int col = 0; col < result[row].length; col = col + 1) {
				System.out.print(result[row][col]);
			}
			System.out.println();
		}
		System.out.println();
		return result;
	}
		return result;
	}
	8*/
	
	public static int[][] genRule30(int[][] result, int a){
		
		for (int i = a+1; i < result.length; i = i + 1) {
			System.out.println("TEST");
			//First element elements
			result[i][0] = ruleCheck(0,result[i - 1][0],result[i - 1][1]);	
			
			for (int j = 1; j < result[i].length - 1; j = j + 1) {
				
				result[i][j] = ruleCheck(result[i-1][j-1],result[i - 1][j],result[i - 1][j + 1]);	
			}
			
			//last elements

			result[i][result[i].length - 1] = ruleCheck(result[i - 1][result[i].length - 2],result[i - 1][result[i].length - 1],0);	
			
		}
		
		for (int row = 0; row < result.length; row = row + 1) {
			for (int col = 0; col < result[row].length; col = col + 1) {
				System.out.print(result[row][col]);
			}
			System.out.println();
		}
		System.out.println();
		return result;
	}
	
	public static int ruleCheck(int a, int b, int c) {
		//Rules
		//111 110 101 100 011 010 001 000
		// 0   0   0   1   1   1   1   0
		int rand = (int)(Math.random()*10);
		if (rand < 5) {
			return 0;
		}
		if (a == 1 && b == 1 && c == 1) { return 0; }
		if (a == 1 && b == 1 && c == 0) { return 0; }
		if (a == 1 && b == 0 && c == 1) { return 0; }
		if (a == 1 && b == 0 && c == 0) { return 1; }
		if (a == 0 && b == 1 && c == 1) { return 1; }
		if (a == 0 && b == 1 && c == 0) { return 1; }
		if (a == 0 && b == 0 && c == 1) { return 1; }
		if (a == 0 && b == 0 && c == 0) { return 0; }
		
		return -1;
	}

}
