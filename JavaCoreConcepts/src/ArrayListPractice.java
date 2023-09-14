import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListPractice {
	public void arrayListMethod() {
//		using the <> is called generics which shows the datatype to be added into the collection.
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Karthi");
		arrayList.add("Sumathi");
		arrayList.add("Sampath");
		arrayList.add("Indhu");
		arrayList.add("Karthi");
		
		System.out.println(arrayList.get(2));
		System.out.println(arrayList.indexOf("Indhu"));
		System.out.println(arrayList.lastIndexOf("Karthi"));
		System.out.println(arrayList.indexOf("Arul"));
		System.out.println(arrayList);
		
		ArrayList<String> arrayList2 = new ArrayList<String>();
//		copies from one list to another
		arrayList2.addAll(arrayList);
		System.out.println(arrayList2);
		
//		removes element by element
		arrayList2.remove(2);
		arrayList2.remove("Indhu");
		System.out.println(arrayList2);
//		removes all the elements
		arrayList2.removeAll(arrayList2);
		System.out.println(arrayList2);
		System.out.println(arrayList2.isEmpty());
		
//		adding null to arrayList
		arrayList.add(null);
		System.out.println(arrayList);
		arrayList.add(5, "Miley");
		System.out.println(arrayList);
		
		arrayList.set(5, "Michelle");
		System.out.println(arrayList);
		
//		we can iterate loop through for-each and for loop, but also with iterator
		ListIterator<String> iterator = arrayList.listIterator();
		System.out.println("\nPrinting list through iterator");
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("\nPrinting list through iterator but backwards");
		while(iterator.hasPrevious()) {
//			this is only possible in listiterator..there is one more class/interface known as iterator only
			System.out.println(iterator.previous());
//			concurrent modification exception will occur here, as we're adding one more process here simultaneously. Since arraylist is not thread-safe, it's returning this exception.
			arrayList.add("esk");
		}
		
	}
	public static void main(String[] args) {
		
		ArrayListPractice obj = new ArrayListPractice();
		obj.arrayListMethod();
	}

}
