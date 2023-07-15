package openlabbook1;

public class TypeCasting {

	public static void main(String[] args) {
		
		byte b=10;
		
		int i=b; // will accept automatic type promotion
		
//		byte c=i; // will not accept - because lower type cannot be put in higher
		
		byte d=(byte)i;
		
		byte x=20;
		
		byte y=120;
		
		int sum=x*y;
		
		System.out.println(d+"  Sum "+sum);
	}
}
