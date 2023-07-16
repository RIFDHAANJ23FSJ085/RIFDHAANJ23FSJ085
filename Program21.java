package closeLabBook;

import java.util.Scanner;

public class Program21 {
public static void main(String[] args) {
	
	LeapYear.Leapmet();
}
}

class LeapYear{
	
	static void Leapmet() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter 2 to check Febrauray  ");
	        int month = scanner.nextInt();
	        System.out.print("Enter the year: ");
	        int year = scanner.nextInt();

	        int daysInMonth = 0;

	        switch (month) {
	         
	            case 2: System.out.println("February"); 
	                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
	                    daysInMonth = 29; 
	                    System.out.println("Leap year");
	                   
	                } else {
	                    daysInMonth = 28;
	                    System.out.println("Non-leap year");
	                }
	                break;
	            default:
	                System.out.println("Invalid month!");
	                return;
	        }

	        System.out.println("Number of days in the month: " + daysInMonth);
	    }
	}
