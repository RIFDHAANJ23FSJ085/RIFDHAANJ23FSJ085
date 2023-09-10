package zohoString;

public class MethodOverLoading {

	public static void main(String[] args) {
		met();
		met(20); // vmi - virtual method invocation
		
		BoysWithSccoty bw=new BoysWithSccoty();
		GirlsWithSccoty gw=new GirlsWithSccoty();
		
		Accident.helpAccident(bw);
		Accident.helpAccident(gw);
	}
	
	static void met() {
		System.out.println("Normal Met Called..");
	}
	static void met(int i) {
		System.out.println("Int Met Called"+i);
	}
	
}

class Accident{
	
	public static void helpAccident(BoysWithSccoty bs) {
	   bs.met();	
	}
	
	public static void helpAccident(GirlsWithSccoty gs) {
		gs.met();
	}
}

class BoysWithSccoty{
	public void met() {
		System.out.println("Accident Happened lesson Learned.");
	}
}
class GirlsWithSccoty{
	public void met() {
		System.out.println("Accident Happened to others Be Careful stay away from them.");
	}
}
