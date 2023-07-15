package openlabbook1;

import java.util.Scanner;

public class AreaOfRectangle {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Length of Rectangle");
		double length=sc.nextDouble();
		System.out.println("Enter the Width of Rectangle");
		double width=sc.nextDouble();
		//Area=height*width
		double area=length*width;
		System.out.println("Area of Rectangle is "+area);
	}
}
