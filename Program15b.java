package closeLabBook;

import java.util.Scanner;

public class Program15b {

	public static void main(String[] args) {
		System.out.println("Enter the Number to check armstrong number.");
		Scanner sc=new Scanner(System.in);
		int mn=sc.nextInt();
		if(Armstrong.isArmstrong(mn)) {
			System.out.println("Armstrong");
		}
		else {
			System.out.println("Not Armstrong");
		}
		System.out.println();
		
		System.out.println("Enter Number for perfect Number..: // ex 28 is perfect number.");
		long n,s;	
		n=sc.nextLong();
		s=PerfectNumber.isPerfect(n);
		if(s==n)
			System.out.println(n+" is a Perfect Number");
		else
			System.out.println(n+" is not a perfect Number.");
	
	
		System.out.println("Enter Number to check Palindrome number.Or Not.");
		int t=sc.nextInt();
		
		Palindrome.PalindromeCheck(t);
		
		sc.close();
	
	
	
	}
}

class Armstrong{
	
	
	static boolean isArmstrong(int n) {
		
		int temp,digits=0,last=0,sum=0;
		
		temp=n;
		
		while(temp>0) {
			temp=temp/10;
			digits++;
		}
		temp=n;
		while(temp>0) {
			last=temp%10;
			sum+=(Math.pow(last, digits));
			temp=temp/10;
		}
		
		if(n==sum)
			return true;
		else
			return false;
	
		
	}
	
}

class PerfectNumber{
	static long isPerfect(long num) {
		long sum=0;
		
		for(int i=1;i<=num/2;i++) {
			if(num%i==0) {
				sum+=i;
			}
		}
		return sum;
	}
}

class Palindrome{
	static void PalindromeCheck(int n) {
	
	
	int r,sum=0,temp;
	
	
	temp=n;
	while(n>0) {
	r=n%10;
	sum=(sum*10)+r;
	n=n/10;
	}
	if(temp==sum)
		System.out.println("Palindrome Number");
	else
		System.out.println("Not A Palindrome.");
	}
}