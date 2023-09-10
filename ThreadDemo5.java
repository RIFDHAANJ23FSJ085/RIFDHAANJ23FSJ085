package threadpack;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo5 {

	public static void main(String[] args) {
		
		ExecutorService es=Executors.newFixedThreadPool(2);
		
		es.execute(()->{MySingleTon.getSingleTon();});
		
		es.execute(()->{MySingleTon.getSingleTon();});
		
		es.shutdown();
		
	}
}

class MySingleTon{
	private MySingleTon() {
		System.out.println("Cons called..");
	}
	private static MySingleTon mysingle;
	synchronized public static MySingleTon getSingleTon() {
		
		if(mysingle==null) {
			mysingle=new  MySingleTon();
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				
			}
			
		}
		return mysingle;
	}
	
}