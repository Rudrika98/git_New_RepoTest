
public class Parent {

	public static void main(String args[]) {

		System.out.println("I started learning Java");
		
		// Add two numbers
		int  a=2;
		int b = 3;
		System.out.println(a+b);
		
		// OOPS
		// While automating web application you have 4-5 pages and you have header section in each page you will
		//write block of code to check header is as expected. on each page you make sure you are writing same code 
		//there comes header validation block footer validation
		
		Methods m = new Methods(); // new is memory allocation operator
		m.ValidateHeader();
		
	}
}
