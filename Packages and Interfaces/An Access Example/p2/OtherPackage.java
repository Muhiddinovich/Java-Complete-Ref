package p2;

public class OtherPackage {
	public OtherPackage() {
		p1.Protection p = new p1.Protection();
		System.out.println("OtherPackage Constructor");
//		System.out.println("n="+ p.n);//class or package only
//		System.out.println("n_pri= " + p.pn_pri); //class only
//		System.out.println("n_pro= " + p.n_pro);//class, subclass or package only
		System.out.println("n_pub= " + p.n_pub);
	}

}
