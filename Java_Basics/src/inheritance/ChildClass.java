package inheritance;

public class ChildClass {
	
	String colour ="Green";

	public void engine() {
		System.out.println("new Engine");
	}

	public void colour() {
		System.out.println(colour);
	}

	public static void main(String args[]) {

		ChildClass cd = new ChildClass();
		newParentClass nb = new ParentClass(); 
		//WebDriver driver = new FirefoxDriver();
//		cd.colour();
		System.out.println(nb.color); // Since return type of nb is defined as newParentClass so color is yellow
	}
}
