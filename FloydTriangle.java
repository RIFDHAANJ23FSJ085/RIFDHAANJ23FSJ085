package openlabbook1;

import java.util.Scanner;

public class FloydTriangle {

	public static void main(String[] args) {
		
		int rows,numbe=1,counter,j;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number of Rows for floyd triangle.");
		
		rows=sc.nextInt();
		System.out.println("Floyd Triangle.");
	
		System.out.println("**********");
		for( counter =1;counter<=rows;counter++) {
			
			for(j=1;j<=counter;j++) {
				System.out.println(numbe+" ");
				numbe++;
			}
			System.out.println();
		}
	}
}
