interface A{
	void b(int a); 
}
class B implements A{
	public void b(int p) {
		System.out.println(p);
	}
}
public class Interfaces1 {

	public static void main(String[] args) {
		A ob= new B();
		ob.b(5);
		

	}

}
