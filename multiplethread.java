class C implements Runnable{
	String name;
	Thread t;
	C(String s){
		name = s;
		t = new Thread(this,name);
		System.out.println("Child Thread" + t);
	}
	public void run() {
		for(int n =5;n>0;n--)
		{
			System.out.println(name+ ":" +n);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(name + "interrupted");
			}
			
		}
		System.out.println(name + "Exiting");
	}
}

public class multiplethread {

	public static void main(String[] args) {
		C ob1=new C("one");
		C ob2=new C("two");
		C ob3=new C("three");
		ob1.t.start();
		ob2.t.start();
		ob3.t.start();
	
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println("Main Thread interrupted");
			}
			
		System.out.println("Main Thread Exiting");
		
		

	}

}
