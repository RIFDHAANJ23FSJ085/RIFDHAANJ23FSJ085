package zoho;

public class UseSuper {
public static void main(String[] args) {
	
	B1 b=new B1(10, 20);
	b.show();
}

}

class A1{
	int a;
}

class B1 extends A1{
	int a;
	
	B1(int n,int b){
		super.a=n;
		a=b;
	}
	
	void show() {
		System.out.println("i in super class "+super.a);
		System.out.println("i in sub class "+a);
	}
}
