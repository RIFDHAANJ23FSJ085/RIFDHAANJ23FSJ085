package zoho;

public class PassByReference {

	public static void main(String[] args) {
		Laddu tladdu=new Laddu();
		PassByReference.vmet(tladdu.size);
		System.out.println(tladdu.size);
		PassByReference.rmet(tladdu);
		System.out.println(tladdu.size);
		
		
		
	}
	static void rmet(Laddu obj) {
		obj.size=5;
	}
	
	static void vmet(Object size) {
		size=5;
	}
	
}

class Laddu{
	int size=10;
}
