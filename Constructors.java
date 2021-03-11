class A{
	int n1,n2;;
	 A(){
		n1=5;
		n2=4;
	}
	int add() {
		return n1+n2;
	}
}
public class Constructors {

	public static void main(String[] args) {
		int c;
		A ob = new A();
		c=ob.add();
		System.out.println(c);
	}

}
