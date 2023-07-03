package openlabbook1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StrDemo {

	public static void main(String[] args) {
		
		// Instead of using scanner we can use BufferReader
		try {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter name");
		String o=bf.readLine();
		
		System.out.println(o);
		System.out.println(o.hashCode());
		String s=new String("Hello"); // this will create two object one in stack another one in heap..
		
		// what is stack ? Stack is the place where values are stored in memory.
		
		// what is Heap ? Heap is the place where object are stored in memory.
		
		String st="Hello"; // this will create one object in stack
		
		// coming to string It looks like a primitive but acts like a complex.
		
		String k=new String("Kalyan");
		
		String m="jj";
		
		System.out.println(k.hashCode());
		System.out.println(m.hashCode());
//		for example
		
		int i=10; // this is primitive type
		
		Integer j=20;
		
		System.out.println(i);
		System.out.println(j.hashCode());
		
		System.out.println(st.hashCode());
		
		System.out.println(s.hashCode());
		
		System.out.println(o.charAt(4));
		System.out.println(o.codePointAt(2));
		System.out.println(o.codePointCount(2, 6));
		System.out.println(o.compareToIgnoreCase(s));
		System.out.println(o.formatted(args));
		System.out.println(o.intern());
		System.out.println(o.replaceFirst(o, st));
		System.out.println(o);
		System.out.println(k);
		String n=s.intern();
		String nn=st.intern();
		System.out.println(n==nn);
		System.out.println(nn);
		System.out.println(n);
	}catch (Exception e) {
		e.printStackTrace();
	}
}
}