package enumeration_are_class_types;

public enum Apple {
	Jonathan(10),
	GoldenDel(11),
	RedDel(8),
	Winesap(15), 
	Cortland;
	
	private int price;
	Apple(){
		price=-1;
	}
	Apple(int p) {
		price=p;
	}
	
	int getPrice() {
		return price;
	}
}
