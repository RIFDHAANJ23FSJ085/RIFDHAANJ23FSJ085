package zohoString;

public class BasicDemo1 extends Question {

	int a=1000;
	int b=2000;
	
	void add(int a,int b) {
		System.out.println(a+this.b-super.a);
	}
	
	public static void main(String[] args) {
		BasicDemo1 bd=new BasicDemo1();
		bd.add(100, 300);
	}
}

class Question{
	int a=400;
	int b=200;
}