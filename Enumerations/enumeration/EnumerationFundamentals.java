package enumeration;

public class EnumerationFundamentals {
	public static void main(String[] args) {
		Apple apple ;
		apple= Apple.RedDel;
		
		if(apple==Apple.RedDel) {
			System.out.println("Worked");
		}
		System.out.println("Hello");
		switch (apple) {
		case RedDel:
			System.out.println("RedDel worked in switch");
			break;

		default:
			break;
		}
		
		System.out.println(Apple.Winesap);
	}
}
