class C implements Runnable{
	String name;
	Thread t;
	C(String s){
		name = s;
		t = new Thread(this,name);
		System.out.println("Child Thread " + t);
	}
	public void run() {
		for(int n =5;n>0;n--)
		{
			System.out.println(name+ ":" +n);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(name + "interrupted");
			}
			
		}
		System.out.println(name + "Exiting");
	}
}

public class isaliveandjoin {

	public static void main(String[] args) {
		C ob1=new C("one");
		C ob2=new C("two");
		C ob3=new C("three");
		ob1.t.start();
		ob2.t.start();
		ob3.t.start();
		System.out.println("Thread one is alive :" + ob1.t.isAlive());
		System.out.println("Thread two is alive :" + ob2.t.isAlive());
		System.out.println("Thread three is alive :" + ob3.t.isAlive());
		try {
			System.out.println("Waiting for threads to end");
			ob1.t.join();
			ob2.t.join();
			ob3.t.join();
		}catch(InterruptedException e) {
			System.out.println("Main Thread Interrupted");
		}
		System.out.println("Thread one is alive :" + ob1.t.isAlive());
		System.out.println("Thread two is alive :" + ob2.t.isAlive());
		System.out.println("Thread three is alive :" + ob3.t.isAlive());
		System.out.println("Main Thread Exiting");

	}

}
