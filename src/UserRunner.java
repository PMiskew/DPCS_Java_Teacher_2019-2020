public class UserRunner {



	public static void main(String[] args) {

		User u1 = new User();
		u1.setName("XXXX XXXXXXX");
		u1.setAge(99);
		u1.setEmail("XXXX.XXXXXXX@ucc.on.ca");
		u1.setCity("Toronto");

		System.out.println(u1.toString());

		//Since copyObject is static we invoke it with
		//the name of the class. The function returns a 
		//reference to an object that has the same fields. 

		User u3 = User.copyObject(u1);
		//Test code:
		//Approach 1: If you run approach 1 the function
		//takes the passed object and copies the fields 
		//into the new object.  It returns a brand new object
		//this means u1 and u3 are unique instances. 

		//Approach 2: If you run approach 2 the function
		//is copying the reference not the data.  This means
		//that u3 and u1 point to the same object.  Therefore
		//any changes to u1 are reflected in u2. 

		

		/*u1.outputUserInfo();

		System.out.println();

		u3.outputUserInfo();

		System.out.println("*****");

		u1.setName("monkey");

		u1.outputUserInfo();

		System.out.println();

		u3.outputUserInfo();

		//*/

		

	}

	

}