

class Gen1<T,V>{
	T ob1;
	V ob2;
	Gen1(T o1,V o2){
		ob1=o1;
		ob2=o2;
	}
	T getob1() {
		return ob1;
	}
	V getob2() {
		return ob2;
	}
	void Showtype() {
		System.out.println("Tyoe of T is" + ob1.getClass().getName());
		System.out.println("Tyoe of T is" + ob2.getClass().getName());
	}
}
public class two {

	public static void main(String[] args) {
		Gen1<Integer,String> iob;
		iob = new Gen1<Integer,String>(78,"Generics");
		iob.Showtype();
		int v=iob.getob1();
		System.out.println("Value:" + v);
		String s=iob.getob2();
		System.out.println("Value:" + s);

	}

}


