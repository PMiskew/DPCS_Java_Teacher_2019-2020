
public class ComparingStrings {

	public static void main(String[] args) {
		
		
		String str1 = "a";
		String str2 = "b";
		String str3 = "c";
		
		//Codes as correct, but there is a logic error here. 
		//Strings are not primitive types meaning we are not comparing the value
		//but the memory location. Most languages account for this and == works fine
		//one strings. 
		if (str1 == str3) {
			System.out.println("They are the same!!!");
		}
		else {
			System.out.println("They are different!!!");
		}
		
		
		//Two ways to compare String
		//Using equals method
		boolean b1 = str1.equals(str2); //str1 is implied object, str2 passed object. if str1 == str2
		boolean b2 = str1.equalsIgnoreCase(str2);
		
		//Compareto
		
		int x = str2.compareToIgnoreCase(str1);
		System.out.println(x);
		
		System.out.println("a".compareToIgnoreCase("b"));

		System.out.println("b".compareToIgnoreCase("a"));

		System.out.println("b".compareToIgnoreCase("b"));
		
		
		
		
	}

}
