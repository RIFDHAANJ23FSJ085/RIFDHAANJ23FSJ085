package zoho;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
//		int arr[]= {10,20,30,40};
//		int arr2[]=new int[4];
//		
//		arr2[0]=1;
//		arr2[1]=2;
//		arr2[2]=3;
//		arr2[3]=4;
//		
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(i);
//			
//		}
//		System.out.println(arr.length);
//		for(int j=0;j<arr2.length;j++) {
//			System.err.println(j);
//			
//		}
//		System.out.println(arr2.length);
//		
		List<Integer> arr3=new ArrayList<Integer>();
		
		arr3.add(23);
		arr3.add(33);
		arr3.add(43);
		arr3.add(53);
		
		System.out.println(arr3.size());
		
		for(int k=0;k<=arr3.size();k++) {
			System.out.println(k);
		}
		System.out.println(arr3.remove(1));
//		
//		System.out.println(arr3.size());
	
	}
}
