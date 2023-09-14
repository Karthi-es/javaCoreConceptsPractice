
public class ChildClass3 extends AbstractionandInterface implements InterfacePractice {
	static int score=100;

	void display2(){
		System.out.println("Implemented abstract method");
		System.out.println(id);
		System.out.println(rollNo);
		System.out.println(year);
	}
	
	@Override
	void overRide(int i) {
		System.out.println(year);
	}
	
	@Override
	public void displayy() {
		// TODO Auto-generated method stub
		System.out.println("Implemented method display from interface");
		
	}
	public static void main(StringPractice[] args) {
		// TODO Auto-generated method stub

		AbstractionandInterface obj = new ChildClass3();
		obj.overRide(score);
		obj.display();
		obj.display2();
		
		InterfacePractice.displayy();
	}

}
