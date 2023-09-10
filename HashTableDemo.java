package zoho;

import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {

	public static void main(String[] args) {
		
		Hashtable<Integer, String> ht=new Hashtable<>();
		
		ht.put(100, "Rifdhan");
		ht.put(104, "Fuzail");
		ht.put(102, "Haris");
		ht.put(103, "Dulquer");
		ht.put(101, "Bingo");
		
		System.out.println(ht); // return descending order by key
 	
	for(Map.Entry m:ht.entrySet()) {
		System.out.println(m.getKey()+":"+m.getValue());
	}
	}
}
