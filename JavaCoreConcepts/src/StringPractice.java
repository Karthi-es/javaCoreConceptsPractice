
public class StringPractice {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub

		StringBuffer str = new StringBuffer("karthi");
		
		str.append("esk");
		System.out.println(str);
		
		str.reverse();
		System.out.println(str);
		
		str.reverse();
		str.replace(6,9," Sampath");
		System.out.println(str);
		
		str.delete(7, 14);
		System.out.println(str);
		
		str.insert(2, "thir");
		System.out.println(str);
		
		str.delete(2, 6);
		System.out.println(str);
		
//		str.capacity();
		System.out.println(str.capacity());
	}

}
