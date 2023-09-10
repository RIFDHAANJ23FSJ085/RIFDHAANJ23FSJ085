package threadpack;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo2 {
	
	public ThreadDemo2() {
		
		ExecutorService es=Executors.newFixedThreadPool(2);
		es.execute(()->{
			Thread t=Thread.currentThread();
			t.setName("Rifdhan");
			t.setPriority(9);
			
			System.out.println("Child Thread Called and my Name Is : "+t.getName());
			System.out.println(t);
		});
		
		es.execute(()->{
			Thread t=Thread.currentThread();
			t.setName("Ahmed");
			t.setPriority(9);
			
			System.out.println("Child thread Called and MyName Is : "+t.getName());
			System.out.println(t);
			
		});
		es.shutdown();
		
		
	}

	public static void main(String[] args) throws Exception{
		
		Thread t=Thread.currentThread();
		t.setPriority(10);
		t.setName("Rajesh");
		System.out.println(t);
		
		new ThreadDemo2();
		
		for(int i=0;i<5;i++) {
			System.out.println(i);
			t.sleep(1000);
		}		
		
	}
}

interface Doctor{
	public void cure();
}

class UseLambda{
	void main() {
		
//		Doctor ramu=new EyeDoctor();      // Old Way..
		
		
		
		// Lambda uses code Maintainability And Reusability..
		
		Doctor ramu=()->{
			System.out.println("Cure Metod Called...");
		};
		myFriendHouse(ramu);
		
	}
	void myFriendHouse(Doctor r) {
		r.cure();
	}
}
//
//class EyeDoctor implements Doctor{
//	@Override
//	public void cure() {
//		// TODO Auto-generated method stub
//		
//	}
//}





