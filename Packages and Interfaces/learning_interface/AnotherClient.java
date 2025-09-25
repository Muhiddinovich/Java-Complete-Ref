package learning_interface;

public class AnotherClient implements Callback{
	public void callback(int param) {
		System.out.println("Another version of callback");
		System.out.println("p square is "+ (param*param));
	}
}
