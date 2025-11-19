package enumeration_are_class_types;

public class EnumsAreClassTypes {
	public static void main(String[] args) {
		Apple ap;
		System.out.println("Winesap costs "+Apple.Winesap.getPrice()+" cents");
		
		System.out.println("All apple prices: ");
		for(Apple apple: Apple.values()) {
			System.out.println(apple.ordinal()+". "+apple+" costs "+apple.getPrice()+" cents");
		}
		
		System.out.println();
		System.out.println(Apple.Jonathan.compareTo(Apple.RedDel));
		
		System.out.println(Apple.Cortland.equals(Apple.Cortland));
	}
}
