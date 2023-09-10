package zoho;

public class MethodOverrideDemo {

	public static void main(String[] args) {
		M ab=new M(20, 10, 50);
		ab.show();
	}
}

class S{
	int i,j;
	
	S(int a,int b){
		i=a;
		j=b;
	}
	void show() {
		System.out.println("i and j"+i+":"+j);
	}
}

class M extends S{
	int k;
	public M(int a,int b,int c) {
		super(a,b);
		k=c;
	}
	
	void show() {
		System.out.println("k: "+k);
	}
}
