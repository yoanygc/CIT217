package m3_linked_lists;

public class Main {

	public static void main(String[] args) {

		/* Start with the empty list. */
		LinkedList list = new LinkedList();

		//
		// ******INSERTION******
		//

		// Insert the values
		list = LinkedList.insert(list, 1);
		list = LinkedList.insert(list, 2);
		list = LinkedList.insert(list, 3);
		list = LinkedList.insert(list, 4);
		list = LinkedList.insert(list, 5);
		list = LinkedList.insert(list, 6);
		list = LinkedList.insert(list, 7);
		list = LinkedList.insert(list, 8);

		// Print the LinkedList
		LinkedList.printList(list);

	}

}
