package openlabbook1;

import java.util.Scanner;

public class EnteredByUser {
public static void main(String[] args) {
	
	// creates a reader instance which takes input from standard input - keyword
	Scanner reader=new Scanner(System.in);
	System.out.println("Enter a Number: ");
	
	//nextInt() reads the next integer from the keyword
	
	int number=reader.nextInt();
	
	//println() prints the following line to the output screen
	
	System.out.println("You Entered "+number);
 
}
}
