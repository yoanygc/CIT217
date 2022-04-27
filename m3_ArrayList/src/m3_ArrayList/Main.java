package m3_ArrayList;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(34); // autoboxing
		list.add(89); // autoboxing
		list.add(65); // autoboxing

		System.out.println("Using the traditional for loop:");
		for (int i = 0; i < list.size(); i++)
			System.out.print(list.get(i) + "\t");
		System.out.println();

		System.out.println("\nUsing the enhanced for loop:");
		for (Integer currentInteger : list)
			System.out.print(currentInteger + "\t");
		System.out.println();

		System.out.println("\nUsing unboxing and enhanced for loop:");
		for (int currentInt : list) // unboxing
			System.out.print(currentInt + "\t");
		System.out.println();

		list.set(1, 100);
		System.out.println("\nAfter calling set( 1, 100 ):");
		for (int currentInt : list) // unboxing
			System.out.print(currentInt + "\t");
		System.out.println();

		int removed = list.remove(0);
		System.out.println("\nAt index 0, " + removed + " was removed");
		System.out.println("\nAfter removing the element at index 0:");
		for (int currentInt : list) // unboxing
			System.out.print(currentInt + "\t");
		System.out.println();

	}

}
