
public class Throw {
	static void demo() {
		try {
			throw new NullPointerException();
		}catch(NullPointerException e) {
			System.out.println("caught inside demo " + e);
		}
	}

	public static void main(String[] args) {
		demo();
}
}
