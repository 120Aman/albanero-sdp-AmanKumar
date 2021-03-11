package Synchronization;
class Q{
	int n;
	boolean b=false;
	synchronized int get() {
		while(!b) {
			try {
				wait();
			}catch(InterruptedException e) {
				System.out.println("interrupted");
			}
			System.out.println("Got:" + n);
			b=false;
			notify();
		}
		return n;
	}
	synchronized void put(int n) {
		while(b) {
			try {
				wait();
			}catch(InterruptedException e) {
				System.out.println("interrupted");
			}
		this.n=n;
		b=true;
		System.out.println("Put:" + n);
		notify();
	}
	}
}
class Producer implements Runnable{
	Q q;
	Thread t;
	Producer(Q q){
		this.q=q;
		t=new Thread(this,"producer");
	}
	public void run() {
		int i=0;
		while(true) {
			q.put(i++);
		}
	}
}
class Consumer implements Runnable{
	Q q;
	Thread t;
	Consumer(Q q){
		this.q=q;
		t=new Thread(this,"consumer");
	}
	public void run() {
		while(true) {
			q.get();
		}
	}
}
public class interthreadcomm {

	public static void main(String[] args) {
		Q q=new Q();
		Producer p=new Producer(q);
		Consumer c=new Consumer(q);
		p.t.start();
		c.t.start();
System.out.println("Press Control+c to stop");
	}

}
