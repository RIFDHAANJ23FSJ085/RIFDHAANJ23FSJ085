package openlabbook1;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		
		int nu,sum=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any integer value below 10");
		
		nu=sc.nextInt();
		
		while(nu<10) {
			sum+=nu;
			nu++;
		}
		
		System.out.println(" Sum of The Numbers From the While Loop is: %d "+sum);
	}
}
