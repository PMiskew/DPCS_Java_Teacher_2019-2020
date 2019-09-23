import java.util.Scanner;

public class RandomNumberGuess {

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);//Creates Scanner Object
		int num = (int)(Math.random()*100); //Creates RandomNunmber
		
		System.out.println(num);
		
		System.out.println("What is your guess: ");
		
		int guess = s.nextInt();
		
		if (guess == num) {
			System.out.println("YEAH");
		}
		else {
			System.out.println("BOOO");
		}
		
	}

}
