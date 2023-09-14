
public class ChildClass2 extends staticPractice{
	ChildClass2(){
		System.out.println("Inside child class constructor");
	}

	void method1(int i) {
		System.out.println(i);
	}
	
	static void method2() {
		System.out.println("I'm trying to override the static method of parent class");
	}
	
	void method3() {
		System.out.println("Inside method 3 of child class");
	}
	public static void main(StringPractice[] args) {
		// TODO Auto-generated method stub

//		ChildClass2 obj = new ChildClass2();
		staticPractice obj = new ChildClass2();
		obj.method1(5);
		method2();
		
	}

}
