package zoho;

import java.util.Scanner;

import zoho.Rectange.DRectange;

public class ZohoOops {

	public static void main(String[] args) {
		Rectange rc=new Rectange();
		rc.display();
		
		
	}
}

class Rectange{
	static int h;
	static int w;
	
	
	public void display() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Value For height");
		h=sc.nextInt();
		System.out.println("Enter a Vaule For Width");
		w=sc.nextInt();
		this.h=h;
		this.w=w;
		sc.close();
		System.out.println(h+"  "+w);
		System.out.println(this.h+"  "+this.w);
	}
	
	static class DRectange{
		public void display1() {
			int result=h*w;
			System.out.println(result);
			
		}
	}
}