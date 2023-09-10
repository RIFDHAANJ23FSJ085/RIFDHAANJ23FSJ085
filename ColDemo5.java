package zoho;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class ColDemo5 {

	public static void main(String[] args) {
		
		Random r=new Random();
		Set<Integer> myset=new TreeSet<>();
		
		while(true) {
			myset.add(r.nextInt(80,100)); // means ending value , (10,30) means starting and ending n-1
			if(myset.size()==20) {
				break;
			}
		}
		System.out.println(myset);
		System.out.println(myset.size());
	}
}
