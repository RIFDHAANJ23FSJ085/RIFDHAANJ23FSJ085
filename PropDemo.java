package zoho;

import java.util.Enumeration;
import java.util.Properties;

public class PropDemo {

	public static void main(String[] args) {
		Properties prop=new Properties();
		prop.put("a2", "How");
		prop.put("a1", "Welcome");
		prop.put("a3", "Bye");
		prop.put("a5", "Hai");
		prop.put("a4", "Good ");
		System.out.println(prop); // this will automatically get order by ascending..
		System.out.println();
//		System.out.println(prop);
		
		Enumeration en=prop.elements();
		
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
		
	}
}
