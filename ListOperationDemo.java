 
//1.a Develop a Java program for adding elements [Apple, Banana, Orange] into an ArrayList and a
//LinkedList to perform the following operations with different functions directed as follows
//1. Adding elements, 2. Adding element at specific index, 3. Adding multiple elements, 4. Accessing
//elements,5. Updating elements, 6. Removing elements, 7. Searching elements, 8. List size, 9. Iterating
//over list, 10. Using Iterator, 11. Sorting, 12. Sublist, 13. Clearing the list//

package firstprog;


	import java.util.*;

	public class ListOperationDemo {

	    public static void main(String[] args) {

	        // 1. Creating ArrayList and LinkedList
	        ArrayList<String> arrayList = new ArrayList<>();
	        LinkedList<String> linkedList = new LinkedList<>();

	        // 1. Adding elements
	        arrayList.add("Apple");
	        arrayList.add("Banana");
	        arrayList.add("Orange");

	        linkedList.add("Apple");
	        linkedList.add("Banana");
	        linkedList.add("Orange");

	        System.out.println("Initial ArrayList: " + arrayList);
	        System.out.println("Initial LinkedList: " + linkedList);

	        // 2. Adding element at specific index
	        arrayList.add(1, "Mango");
	        linkedList.add(1, "Mango");

	        // 3. Adding multiple elements
	        List<String> moreFruits = Arrays.asList("Grapes", "Pineapple");
	        arrayList.addAll(moreFruits);
	        linkedList.addAll(moreFruits);

	        // 4. Accessing elements
	        System.out.println("\nAccessing element at index 2 (ArrayList): " + arrayList.get(2));
	        System.out.println("Accessing element at index 2 (LinkedList): " + linkedList.get(2));

	        // 5. Updating elements
	        arrayList.set(0, "Green Apple");
	        linkedList.set(0, "Green Apple");

	        // 6. Removing elements
	        arrayList.remove("Banana");
	        linkedList.remove("Banana");

	        // 7. Searching elements
	        System.out.println("\nIs 'Orange' present in ArrayList? " + arrayList.contains("Orange"));
	        System.out.println("Index of 'Orange' in LinkedList: " + linkedList.indexOf("Orange"));

	        // 8. List size
	        System.out.println("\nSize of ArrayList: " + arrayList.size());
	        System.out.println("Size of LinkedList: " + linkedList.size());

	        // 9. Iterating over list (for-each loop)
	        System.out.println("\nIterating ArrayList:");
	        for (String fruit : arrayList) {
	            System.out.println(fruit);
	        }

	        // 10. Using Iterator
	        System.out.println("\nIterating LinkedList using Iterator:");
	        Iterator<String> itr = linkedList.iterator();
	        while (itr.hasNext()) {
	            System.out.println(itr.next());
	        }

	        // 11. Sorting
	        Collections.sort(arrayList);
	        Collections.sort(linkedList);

	        System.out.println("\nSorted ArrayList: " + arrayList);
	        System.out.println("Sorted LinkedList: " + linkedList);

	        // 12. Sublist
	        System.out.println("\nSublist of ArrayList (1 to 3): " + arrayList.subList(1, 3));
	        System.out.println("Sublist of LinkedList (1 to 3): " + linkedList.subList(1, 3));

	        // 13. Clearing the list
	        arrayList.clear();
	        linkedList.clear();

	        System.out.println("\nArrayList after clearing: " + arrayList);
	        System.out.println("LinkedList after clearing: " + linkedList);
	    }
	}


