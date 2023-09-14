
public class staticPractice {
	
	static final int age;
	final int id;
	
	staticPractice(){
		this.id = 100;
		System.out.println("Inside Parent constructor");
	}
	
	 void method1(int i) {
		System.out.println("Inside static method 1");
		System.out.println(age);
//		method2(); we can't call a non-static method from a static method 
	}
	 
	 void method3() {
		 System.out.println("Inside method 3 of parent class");
	 }
	 static{
		 age=60;
//		 id=100;
		 System.out.println("Inside static block");
	 }
	 static void method2() {
//		 age=10;
		 System.out.println("Inside non-static method");
//		 method1(); but we can call a static method from a non-static method
		 System.out.println(age);
	 }

	public static void main(StringPractice[] args) {
		// TODO Auto-generated method stub
//	static can be used in variables, methods, classes, blocks.
//		staticPractice obj = new staticPractice();
//		staticPractice.age=40;
//		obj.method1();
//	 ways to call a static method..
//		staticPractice.method1();
//		method1();
//		obj.method2();
	}
}




