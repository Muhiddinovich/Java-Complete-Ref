package p1;

public class SamePackage {
	public SamePackage() {
		Protection p=new Protection();
		System.out.println("SamePackage Constructor");
		System.out.println("n="+ p.n);
//		System.out.println("n_pri= " + p.pn_pri); //class only
		System.out.println("n_pro= " + p.n_pro);
		System.out.println("n_pub= " + p.n_pub);
	}
}
