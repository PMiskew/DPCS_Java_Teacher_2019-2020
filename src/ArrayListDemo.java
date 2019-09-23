import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(1);
		list.add(2);
		list.add(6);
		list.add(3);
		list.add(4);
		
		//write a simple algorithm to remove all even numbers
		//Without Thinking
		/*
		for (int i = 0; i < list.size(); i = i + 1) {
			if (list.get(i) % 2 == 0) {
				list.remove(i);
				i = i  - 1;
			}
		}
		
		System.out.println(list);
		//*/
		
		//Best Practice: Loop from end list
		for (int i = list.size() - 1; i >= 0; i = i - 1) {
			if (list.get(i) % 2 == 0) {
				list.remove(i);
			}
		}
		System.out.println(list);
		
	}

}
