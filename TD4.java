package threadpack;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TD4 {
public TD4() {
	ExecutorService es=Executors.newFixedThreadPool(2);
	es.execute(new MR());
	
	
	es.execute(()->{
		try {
			Thread a=Thread.currentThread();
			a.setName("Hamdhan");
			System.out.println("Child Thread 2 Work Start"+a);
			
			Thread.sleep(5000);
			for(int i=0;i<3;i++) {
				System.out.println(i+" ... "+a);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	});
	es.shutdown();
}
	public static void main(String[] args) {
		new TD4();
		try {
			Thread t=Thread.currentThread();
			t.setName("Rifdhan");
		
		System.out.println("Main Thread"+t);
		Thread.sleep(6000);
		for(int r=15;r>=0;r--) {
			for(int e=0;e<=10;e++) {
				System.out.println(r+".."+e+t);
			}
		}
	}catch (Exception e) {
		e.printStackTrace();
	}
	
}
}
class MR implements Runnable{
	@Override
	public void run() {
		try {
			Thread b=Thread.currentThread();
			b.setName("Rasik");
		System.out.println("MR.run()");
		System.out.println("Child Thread Called"+b);
		Thread.sleep(5000);
		for(int j=10;j>=0;j--) {
		System.out.println(j+"..." +b);
		}
	}catch (Exception e) {
		e.printStackTrace();
	}}
}
