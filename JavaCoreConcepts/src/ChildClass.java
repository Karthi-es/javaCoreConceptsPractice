
public class ChildClass extends ConstructorPractice {
	int age;
	String name;
	float weight;
	boolean male;
	
	ChildClass(){
		System.out.println("Child class constructor");
	}

	ChildClass(int age, String name, boolean male, float weight){
		this.age=age;
		this.name=name;
		this.male=male;
		this.weight=weight;
		
		System.out.println("Parameterised child class constructor");
	}
	
	public ChildClass(ChildClass obj, float weight) {
		// TODO Auto-generated constructor stub
		this();
		this.weight=weight;
		
		System.out.println("Parameterised child class constructor using 'this()'");
	}

	public void getDetails() {
		System.out.println("Name is:"+name);
		System.out.println(super.name);
		System.out.println("Age is:"+age);
		System.out.println(super.weight);
		System.out.println("Male is:"+male);
		System.out.println(super.male);
//		this is wrong method of invoking parent class attribute.
	}

	public static void main(StringPractice[] args) {
		// TODO Auto-generated method stub

//		ChildClass obj = new ChildClass(5,"Appu", true, 50.0f);
		
//		ChildClass obj2 = new ChildClass(obj,50.0f);
//		System.out.println(super.name); this is wrong..it'll be like static reference to the class...
//		obj.getDetails();
		
//		giving reference of a parent class to child class object
		ConstructorPractice obj3 = new ChildClass(5,"Appu", true, 50.0f);
//		overriding method of a parent class.
		obj3.getDetails();
		}

}
