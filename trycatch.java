package exceptions;

public class trycatch {

	public static void main(String[] args) {
		int a,d=0;
			try {
				a=42/d;
				System.out.println("inside try");
			}catch(ArithmeticException e) {
				System.out.println("divide by zero");
				a=0;
			}
			System.out.print("outside of catch");
	}

}
