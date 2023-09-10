package threadpack;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo6 {
	
	// Class Lock
	
	// synchronized Handle Double Dip Problem..

	public static void main(String[] args) {
		
		House house1=new House();
		House house2=new House();
		
		ExecutorService es=Executors.newFixedThreadPool(2);
		
		es.execute(()->{
			synchronized (Toilet.class) {
				Thread.currentThread().setName("Rohit.");
				House.toilet.useToilet();
			}
		});
		
		es.execute(()->{
			synchronized (Toilet.class) {
				Thread.currentThread().setName("Mohit");
				House.toilet.useToilet();
			}
		});
	}
}

class House{
	public House() {
		System.out.println("House Object Created...");
	}
	
	static Toilet toilet=new Toilet(); //class variable.
}

class Toilet{
	public Toilet() {
		System.out.println("Toilet Object Created..");
	}
	
	public void useToilet() {
		Thread t=Thread.currentThread();
		System.out.println(" Toilet is now used by...: "+t.getName());
		try {
			Thread.sleep(5000);
		} catch (Exception e) {

		}
		System.out.println(t.getName()+" : is now out of toilet.. ");
	}
	
}