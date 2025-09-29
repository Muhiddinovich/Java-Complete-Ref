package learning_interface;

abstract class Incomplete implements Callback {
	//if a class includes an interface but do not fully implement the methods required by that interface, then that class must be 
	//declared as abstract.
	
	int a, b;
	void show() {
		System.out.println(a+" "+b);
	}
	
	//Any class inherits Incomplete must implement callback() or be declared abstract
}
