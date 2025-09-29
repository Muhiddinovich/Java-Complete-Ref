package nested_interface;

public class NestedIfDemo {
	public static void main(String[] args) {
		A.NestedIf nif = new B();
		
		if(nif.isNotNegative(10)) {
			System.out.println("10 is not negative");
		}
		else {
			System.out.println("This will not be displayed");
		}
	}
}
