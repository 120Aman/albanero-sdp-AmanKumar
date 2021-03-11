class Gen<T>{
	T ob;
	Gen(T o){
		ob=o;
	}
	T getob() {
		return ob;
	}
	void Showtype() {
		System.out.println("Tyoe of T is" + ob.getClass().getName());
	}
}
public class example {

	public static void main(String[] args) {
		Gen<Integer> iob;
		iob = new Gen<Integer>(78);
		iob.Showtype();
		int v=iob.getob();
		System.out.println("Value:" + v);
		Gen<String> strob;
		strob = new Gen<String>("Generics");
		strob.Showtype();
		String s=strob.getob();
		System.out.println("Value:" + s);

	}

}
