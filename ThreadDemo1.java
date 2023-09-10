package threadpack;

public class ThreadDemo1 {

	public ThreadDemo1() {
		Runnable r=()->{System.out.println("child thread job here...");};
		
		Thread t1=new Thread(r);
		t1.start();
	}
	
	public static void main(String[] args) throws Exception{
		Thread t=Thread.currentThread();
		t.setPriority(10);
		t.setName("Rifdhan");
		System.out.println(t);
		new ThreadDemo1();
		
		for(int i=0;i<10;i++) {
			System.out.println(i);
			
			t.sleep(1000);
		}
	}
}

class MyThreadWork implements Runnable{
	@Override
	public void run() {
		System.out.println("Child Thread Job is here...");
		
	}
}