package openlabbook1;

public class BoxingAndUnboxing {

	public static void main(String[] args) {
		
		int i=10;
		
		Integer t=1000;
		
		t=i;
		System.out.println(i);
		System.out.println(t);
		
		String st="Rifdhan";
		String temp=st;
		System.out.println(st);
		System.out.println();
		System.out.println(temp);
		 st="GAmer "+st;
		 System.out.println();
		 System.out.println(st);
	}
}
