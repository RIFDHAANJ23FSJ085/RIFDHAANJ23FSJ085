package openlabbook1;

import java.util.Scanner;

public class AreaOfSquare {

	public static void main(String[] args) {
		System.out.println("Enter side of Square: ");
		Scanner sc=new Scanner(System.in);
		double side=sc.nextDouble();
		
		double area=side*side;
		System.out.println("Area of square is:"+area);
	}
}
