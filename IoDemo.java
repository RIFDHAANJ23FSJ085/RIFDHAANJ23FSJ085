package zoho;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IoDemo {

	public static void main(String[] args) {
		try {
		FileInputStream fis=new FileInputStream("abc.txt");
//		FileOutputStream fos=new FileOutputStream("copy.text",true); // append.
		FileOutputStream fos=new FileOutputStream("copy.txt"); // override.
	int r=0;
	while((r=fis.read())!=-1) {
//		System.out.println((char)r);
		fos.write(r);
	}
		
		}catch (Exception e) {
		e.printStackTrace();	
		}
}}
