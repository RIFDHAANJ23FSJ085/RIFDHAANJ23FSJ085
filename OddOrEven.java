package openlabbook1;

import java.util.Scanner;

public class OddOrEven {
public static void main(String[] args) {
	int num;
	System.out.println("please enter a Number");
	Scanner sc=new Scanner(System.in);
	num=sc.nextInt();
	
	if(num%2==0) {
		System.out.println("Even Number");
	}
	else {
		System.out.println("Odd Number");
	}
}
}
