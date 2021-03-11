class Parent{
	int a,b;
	void set(int x,int y) {
		a=x;
		b=y;
	}
}
class Child1 extends Parent{
	int sum;
	int sum() {
		sum = a+b;
		return sum;
	}
}
class Child2 extends Child1{
	int mul;
	int mul() {
		mul = a*b;
		return mul;
	}
}
public class inheritance {

	public static void main(String[] args) {
		Child2 ob =new Child2();
		ob.set(6, 7);
		System.out.println(ob.sum());
		System.out.println(ob.mul());
	}

}
