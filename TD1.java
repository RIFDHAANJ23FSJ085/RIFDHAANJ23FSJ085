package threadpack;

public class TD1 {

	public static void main(String[] args) {
		Thread t=Thread.currentThread();
		System.out.println(t);
		t.setName("Rifdhan");
		
		met1();
		met2(5000);
	}
	
	static void met1() {
		System.out.println("Met 1 called...");
		System.out.println("Met 1 Finished...");
	}
	
	static void met2(int a) {
		System.out.println("Met 2 called...");
		try {
			Thread.sleep(a);
			for(int i=0;i<=10;i++) {
			System.out.println("Working "+i);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Met 2 Completed..");
	}
}
