package week3day1;

import java.util.TreeSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<String> unique = new TreeSet<String>();
		unique.add("One");
		unique.add("One");
		unique.add("Two");
		unique.add("Two");
		unique.add("TWO");
			
		System.out.println(unique);

	}

}
