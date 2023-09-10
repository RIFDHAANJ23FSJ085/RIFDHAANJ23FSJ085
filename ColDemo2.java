package zoho;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ColDemo2 {

	public static void main(String[] args) {
		List<Integer> li=new ArrayList<>();
		li.add(10);
		li.add(100);
		li.add(1000);
		li.add(10000);
		li.add(100000);
		li.add(1000000);
		
		System.out.println(li.size());
		System.out.println();
		System.out.println(li);
		Collections.sort(li);
		System.out.println();
		System.out.println(li);
		
		Collections.sort(li,new MyComparator());
		System.out.println(li);
			
	}
}

class MyComparator implements Comparator<Integer>{
	@Override
	public int compare(Integer o1, Integer o2) {
		
		return o2.compareTo(o1); // descending order
	}
}
