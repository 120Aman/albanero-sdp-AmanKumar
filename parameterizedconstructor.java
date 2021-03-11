class B{
	int n1,n2;;
	 B(int a,int b){
		n1=a;
		n2=b;
	}
	int add() {
		return n1+n2;
	}
}
public class parameterizedconstructor {

	public static void main(String[] args) {
	int c;
	B ob= new B(5,4);
	c=ob.add();
	System.out.println(c);
	}

}
