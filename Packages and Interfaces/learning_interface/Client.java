package learning_interface;

public class Client implements Callback{
	public void callback(int param) {
		System.out.println("callback called with "+ param);
	}
	
	void nonIfaceMeth() {
		System.out.println("may also define other memebers too");
	}
}
