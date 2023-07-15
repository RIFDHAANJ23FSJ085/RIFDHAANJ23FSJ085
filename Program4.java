package closeLabBook;

import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		int temp;
		boolean isprime=true;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number..");
		
		int num=sc.nextInt();
		sc.close();
		
		for(int i=2;i<=num/2;i++) {
			temp=num%i;
			if(temp==0) {
				isprime=false;
				break;

			}
		}
		if(isprime)
			System.out.println(num+ " is a Prime Number");
		else
			System.out.println(num+ " is Not a Prime Number");
	}}

