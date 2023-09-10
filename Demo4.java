package zohoString;

import java.util.Scanner;

public class Demo4 {
	
		int sum(int a, int b){ //non-static method
		        return a + b;
		    }
		static int multiply(int a, int b){ //static method
		        return a * b;
		    }
		




public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		Demo4 ds=new Demo4();
	int s=	ds.sum(n1, n2);
	int m=	ds.multiply(n1, n2);
		System.out.println(s);
		System.out.println(m);
}
}