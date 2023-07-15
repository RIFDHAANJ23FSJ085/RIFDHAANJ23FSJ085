package closeLabBook;

import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		Average.met();
	}
}

class Average{
	public static void met() {
		   int n, count = 1;   
		      float  xF, averageF, sumF = 0;   
		      Scanner sc = new Scanner(System.in);     
		      System.out.println("Enter the value of n");  
		      n = sc.nextInt();  
		      while (count <= n)   
		             {   
		                  System.out.println("Enter the "+count+" number?");  
		                  xF = sc.nextInt();  
		                  sumF += xF;   
		                  ++count;   
		             }   
		                  averageF = sumF/n;   
		        System.out.println("The Average is : "+averageF);  
		    }    
}
