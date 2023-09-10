package zoho;

public class DynamicMethodDispatch {

	public static void main(String[] args) {
		V v=new V();
		X x=new X();
		Z z=new Z();
		
		V g;
		
		g=v;
		g.callMe();
		g=x;
		g.callMe();
		g=z;
		g.callMe();
	}
}


class V{
	void callMe() {
		System.out.println("V met");
	}
}

class X extends V{
	void callMe() {
		System.out.println("X met");
	}
}

class Z extends V{
	void callMe() {
		System.out.println("Z met");
	}
}