
public class mainthread {

	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println("Current Thread" + t);
		t.setName("My Thread");
		System.out.println("After name Change" + t);
			for(int n =5;n>0;n--)
			{
				System.out.println(n);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		
	}

}
