package zoho;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class CollectionsDemo {

	public static void main(String[] args) {
		
//		HashMap<Integer, String> hm=new HashMap<Integer,String>(); // this will not get sort
//		TreeMap<Integer, String> hm=new TreeMap<Integer,String>(); // this will by default sort by number in ascending order
		TreeMap<Integer, String> hm=new TreeMap<Integer,String>((s1,s2)->{return s2.compareTo(s1);}); // this will by default sort by number in descending order
	
	hm.put(100, "Rifdhan"); // map using Key value You can get Values using Key.
	hm.put(500, "Sam");
	hm.put(10, "Fuzail");
	hm.put(1000, "Baquer");
	hm.put(70, "Bulma");
	hm.put(110, "Fuzail");
	
	System.out.println(hm);
	
	System.out.println(hm.get(70));
	
	Set<Map.Entry<Integer, String>>st=hm.entrySet();
	
	Iterator<Map.Entry<Integer, String>>iter=st.iterator();
	
	while(iter.hasNext()) {
		Map.Entry<Integer, String> me=iter.next();
		System.out.println(me.getValue()+" : "+me.getKey());
	}
	
	}
}
