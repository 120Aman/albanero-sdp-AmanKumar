class B extends Thread{
	B(){
		super("Demo Thread");
		System.out.println("Child Thread" + this);
	}
	public void run() {
		for(int n =5;n>0;n--)
		{
			System.out.println(n);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println("Child Thread interrupted" + n);
			}
			
		}
		System.out.println("Exiting Child Thread");
	}
}
public class threaddemo2 {

	public static void main(String[] args) {
		B ob = new B();
		ob.start();
		for(int n =5;n>0;n--)
		{
			System.out.println(n);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Main Thread interrupted" + n);
			}
			
		}
		System.out.println("Exiting Main Thread");
	}

}

