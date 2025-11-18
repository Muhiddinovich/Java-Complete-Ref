package enumeration;

public class ValuesVsValuesOf {
	public static void main(String[] args) {
		Apple apple;
		System.out.println("Here are all apples: ");
		
		for(Apple a:Apple.values()) System.out.println(a);
		
		System.out.println();
		
		apple=Apple.valueOf("Winesap");
		System.out.println("apple contains "+apple);
	}
}
