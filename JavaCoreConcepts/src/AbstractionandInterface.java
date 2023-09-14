
public abstract class AbstractionandInterface {
	AbstractionandInterface(){
		System.out.println("Abstract class constructor");
	}
	
	/*
	 * AbstractionandInterface(int rollNo, int id, int year){ this.id=id;
	 * this.rollNo=rollNo; this.year = year; }
	 */

	int id=100;
	int rollNo = 30;
	int year = 1998;
	
	final void display() {
		System.out.println("Abstract final method");
	}
	
	void overRide(int id) {
		System.out.println(id);
	}
	abstract void display2();

	public void displayy() {
		// TODO Auto-generated method stub
		
	}

	}


