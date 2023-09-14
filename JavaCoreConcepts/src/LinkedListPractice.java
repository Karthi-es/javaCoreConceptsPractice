import java.util.LinkedList;

public class LinkedListPractice {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Audi");
		ll.add("Benz");
		ll.add("Bently");
		ll.add("Jaguar");
		ll.add("Buggati");
		
		System.out.println(ll.get(2));
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		ll.addFirst("TATA");
		ll.addLast("Maruti");
		System.out.println(ll);
		
		System.out.println(ll.poll());
		System.out.println(ll.pollLast());
		System.out.println(ll);
		
		System.out.println(ll.pop());
		System.out.println(ll);
		
		System.out.println(ll);
		
		/*
		 * for(String str: ll) { System.out.println(str); }
		 */
	}

}
