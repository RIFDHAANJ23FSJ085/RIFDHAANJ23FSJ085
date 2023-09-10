package zoho;

import java.util.Scanner;

public class ComparatorDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.err.println("Enter a String to compare");
		String s=sc.next();
		System.err.println("Enter a String to compare");
		String se=sc.next();
		Data1 d1=new Data1(s);
		Data1 d2=new Data1(se);
		sc.close();
		int n=d1.compareTo(d2);
		
//		String s1=new String("a");
//		String s2=new String("b");
//		
//		System.out.println(s1.compareTo(s2)); // Returns 0 = Equal // -1 = Ascending Order // 1= Descending
	
		switch (n) {
		case 0: {
			System.out.println("Equal");
			break;
		}
		case -1:{
			System.out.println("Ascending order (a-b)  a=97 b=98 ");
			break;
		}
		case 1:{
			System.out.println("Descending order (b-a) a=97 b=98 ");
		}
		
		}
		
	
	}
}

class Data1 implements Comparable{
	@Override
	public int compareTo(Object o) {
		Data1 ot=(Data1)o;
		int n=this.name.compareTo(ot.name);
		return n;
	}
	private String name;
	
	public Data1(String a) {
		this.name=a;
	}
	
	@Override
	public int hashCode() {
		return this.name.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		Data1 d=(Data1)obj;
		return this.name.equals(d.name);
	}
}
