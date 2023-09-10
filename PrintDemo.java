package zoho;

import java.util.Scanner;

public class PrintDemo {
	public static void main(String[] args) {
		
	
	  Scanner scanner = new Scanner(System.in);
	  System.out.println("Enter a Number");
      int n = scanner.nextInt();
      
      printPattern(n);
  }
  
  public static void printPattern(int n) {
      int count = 1;
      
      for (int i = 1; i <= n; i++) {
          for (int j = 1; j <= i; j++) {
              System.out.print(count);
              if (j < i) {
                  System.out.print("*");
              }
              count++;
          }
          System.out.println();
      }
      
      count = count - n;
      
      for (int i = n - 1; i >= 1; i--) {
          for (int j = 1; j <= i; j++) {
              System.out.print(count);
              if (j < i) {
                  System.out.print("*");
              }
              count++;
          }
          System.out.println();
      }
  }}