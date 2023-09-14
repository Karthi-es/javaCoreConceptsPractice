
public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=3, num2=0;
		String str="";
		try {
		int div = num1/num2;
		int len= str.length();
		}
		
		catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.print("Can't divide a number by 0");
			
		}
		catch(NullPointerException e) {
			e.printStackTrace();
			System.out.println("Null pointer exception");
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.print("Exception is handled");
		}
		finally {
			System.out.println("\nfinally block executed");
		}
		
		
		

	}

}
