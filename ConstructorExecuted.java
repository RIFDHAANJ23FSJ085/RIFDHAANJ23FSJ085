package zoho;

public class ConstructorExecuted {

	public static void main(String[] args) {
		
		C2 c=new C2(78);
		System.out.println(c.hashCode());
		C2 c3=new C2();
		System.out.println(c3.hashCode());
		D de=new D("Fuzail", 500);
		
		System.out.println(c.equals(c3));
		
	}
}

class A2{
	public A2() {
		System.out.println("inside A's Constructor");
	}
}

class B2 extends A2{
	public B2() {
		System.out.println("inside B's Constructor");
	}
}

class C2 extends B2{
	int cost;
	public C2() {
		System.out.println("inside C's Constructor");
	}
	
	public C2(int b){
		this.cost=b;
		System.out.println("Cost "+this.cost);
	}
}

class D extends C2{
	String item;
	public D(String s,int a) {
		super(a);
		item=s;
		System.out.println("cost "+cost);
		System.out.println(s);
	}
}
