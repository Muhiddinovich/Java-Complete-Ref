package p2;

public class Protection2 extends p1.Protection{
	Protection2(){
		System.out.println("Derived other package constructor");
//		System.out.println("n= " + n);// class or package only. Default
//		System.out.println("n_pri= " + n_pri); //class only
		System.out.println("n_pro= " + n_pro);
		System.out.println("n_pub= " + n_pub);
	}

}
