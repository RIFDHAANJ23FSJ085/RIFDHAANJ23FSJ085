package threadpack;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TD5 {

	public static void main(String[] args) {

		ExecutorService es=Executors.newFixedThreadPool(1);
		es.execute(()->{met2();});
		es.shutdown();
		
		met1();
		
		met2();
		
		met3();
		
	}
	
	static void met1() {
		System.out.println("Met 1 called.");
	}
	
	static void met2() {
		try {
			Thread t=Thread.currentThread();
			t.setName("Rifdhan");
			System.out.println("Met 2 working"+t);
			Thread.sleep(4000);
			for(int i=0;i<=10;i++) {
				System.out.println("Finished. .. "+i);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	static void met3() {
		System.out.println("Met 3 called");
	}
}
