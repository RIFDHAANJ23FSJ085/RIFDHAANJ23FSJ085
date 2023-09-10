package zohoString;

public class MethodOverridingDemo {

	public static void main(String[] args) {
		Super2 obj=new Sub();
		obj.met();
		System.out.println(obj.i);
	}
}

class Super1{
	int i=100; // override not work on variable
	
	public void met() { // override work on methods.
		System.out.println("Super Met Called..");
	}
}

class Super2 extends Super1{
	int i=200;
	
	public void met() {
		System.out.println("Super2 Met Called..");
	}
}

class Sub extends Super2{
int i=300;
	
	public void met() {
		System.out.println("Sub Met Called..");
	}
}
