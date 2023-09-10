package zoho;

public class SIngleton {

	public static void main(String[] args) {
//		Single s=new Single();
		
		Single s=Single.met();
		Single s2=Single.met();
		System.out.println(s);
		System.out.println(s2);
		
		
		
	}
	
}

class Single {
	private Single() {
		// TODO Auto-generated constructor stub
	}
	public static Single  s ;

	public static Single met() {  
	
	if(s==null) {
		s=new Single();
	}
		return s;
	}
	
}