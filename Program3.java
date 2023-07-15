package closeLabBook;

public class Program3 {

	public static void main(String[] args) {
		// Explicit and implicit
		
		byte b=12;
		System.out.println(b);
		
		short s=b;//(byte)43;
		System.out.println(s);
		
		int i=s;//(short)20; 
		System.out.println(i);

		long l=i;//(int)6543;
		System.out.println(l);
		
		float f=2343.3f;
		System.out.println(f);
		
		double d=f;//(float) 2432;
		System.out.println(d);
		
		//implicit
		int j=b*s;
		System.out.println(j);
		
		long ll=l*l;
		System.out.println(ll);
		
		double dd=f*d;
		System.out.println(dd);
	}
}
