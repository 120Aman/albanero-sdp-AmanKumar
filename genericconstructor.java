
//can be generic of non generic classes 
class GenCons{
		private double val;
		
		<T extends Number> GenCons(T arg) {
			val = arg.doubleValue();
		}
		void showval() {
			System.out.println("val: "+val);
		}
	}
public class genericconstructor {

public static void main(String[] args) {
	GenCons test = new GenCons(100);
	GenCons test2 = new GenCons(121.5F);
	test.showval();
	test2.showval();	
}
}

