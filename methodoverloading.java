class C{
	void test() {
		System.out.println("no parameters");
	}
	int test(int a) {
		System.out.println("one parameter");
		return a*a;
	}
	int test(int b,int c) {
		System.out.println("two parameters");
		return b+c;
	}
}
public class methodoverloading {

	public static void main(String[] args) {
	int d,e;
	C ob = new C();
	ob.test();
	d=ob.test(6);
	e=ob.test(7,9);
	System.out.println(d);
	System.out.println(e);
	}

}
