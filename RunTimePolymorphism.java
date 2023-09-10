package zoho;

import java.util.Scanner;

public class RunTimePolymorphism {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Value for dimension 1");
		double a=sc.nextDouble();
		System.out.println("Enter a value for dimension 2");
		double b=sc.nextDouble();
		sc.close();
		Figure f1=new Figure(a, b);
		Triangle t1=new Triangle(a, b);
		Rectangle r1=new Rectangle(a,b);
		
		Figure f;
		
		f=f1;
		System.out.println(f.area());
		
		f=t1;
		System.out.println(f.area());
		
		f=r1;
		System.out.println(f.area());
		
		
	}
}

class Figure{
	double dim1;
	double dim2;
	
	public Figure(double a,double b) {
		this.dim1=a;
		this.dim2=b;
	}
	
	double area() {
	System.out.println("Area of figure is undefined.");
		return 0;
	}
}


class Rectangle extends Figure{
	public Rectangle(double a,double b) {
		super(a,b);
	}
	
	double area() {
		System.out.println("Area of Rectangle");
		return  dim1*dim2;
	}
}

class Triangle extends Figure{
	public Triangle(double a,double b) {
		super(a,b);
	}
	
	double area() {
		System.out.println("Area of the Triangle is: ");
		return dim1*dim2/2;
	}
}
