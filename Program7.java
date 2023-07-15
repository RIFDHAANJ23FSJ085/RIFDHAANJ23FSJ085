package closeLabBook;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Program7 {

	public static void main(String[] args) {
		
		Integer[] arr= {20,10,30,40,50};
       
		Arrays.sort(arr);
		
		System.out.println("Ascending order");
		for(int asc:arr) {
			System.out.print(asc+" ");
		}
		System.out.println();
		
		Arrays.sort(arr,Collections.reverseOrder());
		System.out.println();
		System.out.println("Descending Order");
		for(int des:arr) {
			System.out.print(des+" ");
		}
		
	}
}
