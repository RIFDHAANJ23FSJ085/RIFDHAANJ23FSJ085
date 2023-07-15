package openlabbook1;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int tech=sc.nextInt();
		
		switch (tech) {
		case 1: {
			System.out.println("Java");
			break;
		}
		case 2:{
			System.out.println("Es6");
			break;
		}
		default:
			System.out.println("UnKnown Tech");
		}
	}
}
