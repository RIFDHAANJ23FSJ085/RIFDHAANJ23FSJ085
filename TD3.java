package threadpack;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TD3 {

	public TD3() {
		ExecutorService es=Executors.newFixedThreadPool(2);
		es.execute(new MyR());
		es.execute(()->{System.out.println("Child Thread 2");});
		es.shutdown();
	}
	
	public static void main(String[] args) {
		new TD3();
		System.out.println("Main Thread.");
	}
}

class MyR implements Runnable{
	@Override
	public void run() {
		System.out.println("Child Thread..");
		try {
			Thread.sleep(7000);
			System.out.println("Child Thread Work Done..");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
