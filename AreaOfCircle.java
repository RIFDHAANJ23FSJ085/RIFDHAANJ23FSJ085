package openlabbook1;

import java.util.Scanner;

public class AreaOfCircle {
 public static void main(String[] args) {

	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the radius..");
	 
	 double radius=sc.nextDouble();
	 
	 double area=Math.PI*(radius*radius);
	 System.out.println("The Area Of Circle is.: "+area);
	 
	 double circumference=2*Math.PI*radius;
	 
	 System.out.println("The Circumference of the circle.: "+circumference);
}
}
