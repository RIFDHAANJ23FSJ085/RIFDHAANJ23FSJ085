package zoho;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ColDemo4 {
	// set automatically skip duplicate one
	// treeSet AutoMatically Sort bit hashSet Does not sort by default
	
	public static void main(String[] args) {
		Set<String> myset=new TreeSet<String>((s1,s2)->{return s2.compareTo(s1);});
		myset.add("ball");
		myset.add("cat");
		myset.add("apple");
		myset.add("bike");
		myset.add("ball");
		
		System.out.println(myset);
		
		Iterator<String> iter=myset.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
	}
	
}
