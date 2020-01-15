
public class User extends Object{
	
	private String name;
	private int age;
	private String email;
	private String city;
	

	public User() {		

	}

	public User(String aa, int bb, String cc, String dd) {
		name = aa;
		age = bb;
		email = cc;
		city = dd;
	}

	public User(User other) { 

		//this copies all of the fields of other into the fields of the implied 
		//objects being constructed
		this.name = other.name;
		this.age = other.age;
		this.email = other.email;
		this.city = other.city;
	}

	public String getName() { return name; }
	public int getAge() { return age; }
	public String getEmail() { return email; }
	public String getCity() { return city; }

	public void setName(String aa) {
		name = aa;
	}

	public void setAge(int bb) {
		age = bb;
	}

	public void setEmail(String cc) {
		email = cc;
	}

	public void setCity(String dd) {
		city = dd;
	}

	public void outputUserInfo() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Email: " + email);
		System.out.println("Home City: " + city);
	}

	/*
	 * We made this functions static because
	 * we only use the passed object.  There 
	 * is no need for an implied object
	 */
	public static User copyObject(User other) {

		//Approach 1:
		//This approach creates a new object using the constructor
		//that takes an User parameter.  In the constructor it 
		//copies each value into the respective field for a new
		//object. 
		//User u2 = new User(other);
		//return u2;

		//Approach 2:
		User u2 = new User();
		
		//copies the reference of other into u2. 
		//This means that u2 and other point to
		//one object. 
		u2 = other;	

		//return not a NEW object, but a reference
		//to an existing object. 
		return u2;

	}

	public String toString() {
		//String construction, the process of building a string by adding parts together
		String result = "Name: " + name;
		result = result + "\nAge: " + age;
		result = result + "\nEmail: " + email;
		result = result + "\nHome City: " + city;

		if (age<=18) {
			result = result + "\nQualifies for Student Discount (-15%)";
		}else if(age>=65) {
			result = result + "\nQualifies for Senior Discount (-15%)";
		}
		
		return result;
	}

}