interface D{
	void b(int a); 
}
class E implements D{
	public void b(int p) {
		System.out.println(p);
	}
}
class C implements D{
	public void b(int p) {
		System.out.println(p*p);
	}
}
public class Interfaces2 {

	public static void main(String[] args) {
     D ob=new E();
		C ob1=new C();
		ob.b(5);
		ob1.b(6);
		

	}

}

