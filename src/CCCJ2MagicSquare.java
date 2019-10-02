import java.util.Arrays;
import java.util.Scanner;

public class CCCJ2MagicSquare {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		int[][] nums = {{16, 3, 2, 13},{5, 10, 11, 8},{9, 6, 7, 12},{4, 15, 14, 1}};]
		
		
		//loop 
		for (int r = 0; i < 4; r = r + 1) {
			for (int c = 0; c < 4; c = c + 1) {
				
				nums[r][c] = s.nextInt();
			}
			
		}
		
		int total = nums[0][0] + nums[0][1] + nums[0][2] + nums[0][3];
		
		for (int r = 0; r < 4; r++) {
			
			int tempTotal = 0;
			
			for (int c = 0; c < 4; c++) {
				tempTotal = tempTotal + nums[r][c];
			}
			
			
		}
	}

}
