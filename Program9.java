package closeLabBook;

import java.util.Arrays;
import java.util.Collections;

public class Program9 {
public static void main(String[] args) {
	
	Integer[] i= {10,20,30,44,54};
	
	Arrays.sort(i,Collections.reverseOrder());
	System.out.println();
	System.out.println("Reverse a Number.");
	for(int rev:i) {
		System.out.print(rev+" ");
	}
}
}
