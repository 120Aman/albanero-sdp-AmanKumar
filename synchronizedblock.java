package Synchronization;
class callme{
	 void call(String msg) {
		System.out.print("[" + msg );
		try {
			Thread.sleep(100);;
		}catch(InterruptedException e) {
			System.out.println("Interrupted");
		}
		System.out.println("]");
	}
}
class caller implements Runnable{
	String msg;
	callme Target;
	Thread t;
	public caller(callme targ,String s) {
		Target=targ;
		msg=s;
		t=new Thread(this);
	}
	public void run() {
		synchronized(Target) {
		Target.call(msg);
		}
	}
	
}
public class synchronizedblock {

	public static void main(String[] args) {
		callme target = new callme();
		caller ob1 = new caller(target,"Hello");
		caller ob2 = new caller(target,"Synchronized");
		caller ob3 = new caller(target,"World");
       ob1.t.start();
       ob2.t.start();
       ob3.t.start();
       try {
    	   ob1.t.join();
    	   ob2.t.join();
    	   ob3.t.join();
       }catch(InterruptedException e) {
    	   System.out.println("Interrupted");
       }
	}

}
