class A implements Runnable{
	Thread t;
	A(){
		t = new Thread(this,"Demo");//this is used for A to call run
		System.out.println("Child Thread" + t);
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
public class threaddemo1 {

	public static void main(String[] args) {
		A ob = new A();
		ob.t.start();
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

