package exceptions;

public class Throws {
static void demo() throws IllegalAccessException {
	System.out.println("inside demo");
	throw new IllegalAccessException();
}
	public static void main(String[] args) {
		try {
			demo();
		}catch(IllegalAccessException e) {
			System.out.println("caught " + e);
		}

	}

}
