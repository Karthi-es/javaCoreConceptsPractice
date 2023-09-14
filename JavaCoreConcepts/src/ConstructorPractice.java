
public class ConstructorPractice {

	int id;
	Integer rollNo;
//	if you put it as protected, same package but subclasses, it'll allow
	protected String name;
	float weight;
	double size;
	byte bloodGroup;
	boolean male;
	
	ConstructorPractice(){
		rollNo = 100;
		male = false;
		id=200;
		name = "Sampath";
		weight = 68.0f;
		System.out.println("Parent class constructor");
	}
	
	ConstructorPractice(int id, String name, boolean male) {
		// TODO Auto-generated constructor stub
		System.out.println("Parameterised parent class constructor");
		this.id=id;
		this.name=name;
		this.male=male;
	}

	public void getDetails() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(male);
	}
	public static void main(StringPractice[] args) {
		// TODO Auto-generated method stub

//		ConstructorPractice obj = new ConstructorPractice();
//		obj.getDetails();
		
		System.out.println();
		
		ConstructorPractice obj2 = new ConstructorPractice(100,"Karthi",true);
		obj2.getDetails();
	}
	

}

