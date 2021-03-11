abstract class n{
	abstract void y();
	void z() {
		System.out.println("Z");
	}
}
class p extends n{
	void y() {
		System.out.println("implementation of Y");
	}
}
public class Abstractclass {

	public static void main(String[] args) {
		p ob = new p();
        ob.y();
        ob.z();
	}

}
