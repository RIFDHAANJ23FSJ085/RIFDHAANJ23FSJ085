package zoho;

public class AbstractDemo1 {

	public static void main(String[] args) {
		Super s=new Sub();
		s.callme();
		s.cMet();
	}
}

abstract class Super{
	abstract void callme();
	
	// concrete methods are still allowed
	void cMet() {
		System.out.println("This concrete methods of parent");
	}
}

class Sub extends Super{
	
	@Override
	void callme() {
		System.out.println("Abstract method override by parent class.");
	}
	
//	void cMet() {
//		System.out.println("Concrete method by sub class.");
//	}
}