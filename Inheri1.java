package zoho;

public class Inheri1 {

	public static void main(String[] args) {
		B b=new B();
		b.setij(10, 20);
		b.sum();
		
	}
}

class A{
	int i;
	private int k;
	
	void setij(int x,int y) {
		i=x;
		this.k=y;
		System.gc();
		System.out.println("private Value"+k);
	}
}

class B extends A {
	
		int total;
	
	void sum() {
//		total=i+this.k;
		
		System.out.println("i*i "+(i*i));
	}
}
	
