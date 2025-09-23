package mypack;

public class Balance {
	String name;
	double balance;
	
	public Balance(String n, double b) {
		name=n;
		balance=b;
	}
	
	void show() {
		if(balance<0)
			System.out.println("-->");
		System.out.println(name+": $"+balance);
	}
}
