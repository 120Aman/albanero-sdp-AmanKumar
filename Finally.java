

public class Finally {
static void demoA() {
	try {
		System.out.println("inside A");
		throw new RuntimeException();
	}finally {
		System.out.println("finally A");
	}
}
	static void demoB() {
		try {
			System.out.println("inside B");
			throw new RuntimeException();
		}finally {
			System.out.println("finally B");
		}
	
}
	public static void main(String[] args) {
		try {
			demoA();
		}catch(RuntimeException e) {
			System.out.println("caught");
		}
demoB();
}
}
