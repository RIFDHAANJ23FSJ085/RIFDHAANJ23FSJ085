package openlabbook1;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Width of triangle: ");
		double base=sc.nextDouble();
		
		System.out.println("Enter height of the triangle: ");
		double height=sc.nextDouble();
		double area=(base*height)/2;
		System.out.println("Area of triangle..: "+area);
	}
}
