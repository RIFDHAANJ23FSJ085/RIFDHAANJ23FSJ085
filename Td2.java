package threadpack;

public class Td2 {

	public Td2() {
		Thread t=new Thread(new MyRunnable());
		t.start(); // Calls the MyRunnable Thread start
	}
	public static void main(String[] args) {
		new Td2();
		System.out.println("Main Thread..");
	}
}

class MyRunnable implements Runnable{
	@Override
	public void run() {
		
		try {
			System.out.println("Child Thread Start");	
			Thread.sleep(5000);
			System.out.println("Child Thread Finished");
	}catch (Exception e) {
		e.printStackTrace();
	}
	}
}