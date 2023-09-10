package zoho;

import java.util.Scanner;

public class AbstractDemo2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value for a");
		double a=sc.nextDouble();
		System.out.println("Enter a value for b");
		double b=sc.nextDouble();
		sc.close();
		
		Fg rc=new Rc(a, b);
		Fg t1=new Ta(a, b);
		
		System.out.println(rc.area());
		System.out.println(t1.area());
		
		
//		Fg f;
//		f=rc;
//		
//		System.out.println(f.area());
//		
//		f=t1;
//		System.out.println(f.area());
	}
}

abstract class Fg{
	
	double d1;
	double d2;
	
	public Fg(double d1,double d2) {
		this.d1=d1;
		this.d2=d2;
	}
	
	abstract double area();
}

class Rc extends Fg{

	public Rc(double a,double b) {
		super(a,b);
}
	@Override
	double area() {
		System.out.println("Rectangle area is");
		return d1*d2;
	}
}

class Ta extends Fg{
	
	public Ta(double a,double b) {
		super(a,b);
	}
	
	@Override
	double area() {
		System.out.println("Area of Triangle.");
	return d1*d2/2;
	}
}
