package zoho;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Set;
import java.util.Vector;

public class ColDemo1 {

	public static void main(String[] args) {
		
		// Duplicate Value are Allowed. list and vector but set reverse
		
//		ArrayList<String> alist=new ArrayList<String>();
//		LinkedList<String> alist=new LinkedList<String>();
		Vector<String> alist=new Vector<>();
//		Set<String> alist=new HashSet<String>();
		
		System.out.println("Before Adding "+alist.size());
		
		alist.add("Rifdhan");
		alist.add("Lithaf");
		alist.add("Abu");
		
		System.out.println("After Adding "+alist.size());
	
		alist.remove(1);
		
		System.out.println("After Remove "+alist.size());
		
		for(String a:alist) {
			System.out.println(a);
		}
		System.out.println();
		
		Iterator<String> iter=alist.iterator(); // cursor sensitive move only forward
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		ListIterator<String> liter=alist.listIterator();
		System.out.println();
		while(liter.hasNext()) {
			System.out.println(liter.next());
		}
		System.out.println();
		while(liter.hasPrevious()) {
			System.out.println(liter.previous());
		}
		
	// Enumerator only for vectors
		System.out.println();
		Enumeration<String> en=alist.elements();
		alist.add("Banana");
		
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
		System.out.println();
		System.out.println(alist.contains("Rifdhan")); // this will return boolean
		
		
		Collections.sort(alist);
		System.out.println(alist);
	}
}
