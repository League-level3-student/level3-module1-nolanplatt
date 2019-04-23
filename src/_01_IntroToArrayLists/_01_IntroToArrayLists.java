package _01_IntroToArrayLists;

import java.util.ArrayList;

public class _01_IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class

		ArrayList<String> list = new ArrayList<String>();
		list.add("String 1");
		list.add("String 2");
		list.add("String 3");
		list.add("String 4");
		list.add("String 5");
		
		//3. Print all the Strings using a standard for-loop
		
		for (int i = 0; i < list.size(); i++) {
			String currentString = list.get(i);
			System.out.println("Element " + i + ": " + currentString);
			
		}
		
		//4. Print all the Strings using a for-each loop
		
		for(String currentString : list) {
			System.out.println(currentString);
		}
		
		//5. Print only the even numbered elements in the list.
		for (int i = 0; i < list.size(); i++) {
			String currentString = list.get(i);
			if(i % 2 == 0) {
				System.out.println("-----------------------");
			System.out.println( "Printing only even.\nCurrent element: "+i + "\n" + currentString);

			}

		}
		//6. Print all the Strings in reverse order.
		for (int i = list.size() - 1; i > 0; i--) {
			String currentString = list.get(i);
			System.out.println("-----------------------");
			System.out.println("Printing in reverse\nElement " + i + ": " + currentString);
			
		}
		
		//7. Print only the Strings that have the letter 'e' in them.
		for (int i = 0; i < list.size(); i++) {
			String currentString = list.get(i);
			if(currentString.contains("e")) {
				System.out.println("-----------------------");
			System.out.println( "Printing only with letter e.\nCurrent element: "+i + "\n" + currentString);
			}

		}
	}
}
