package openlabbook1;

public class LargestNumber3Among {
public static void main(String[] args) {
LargestNumber3Among.largest();
LargestNumber3Among.low();
}


public static void largest() {
	double n1=-5.5,n2=4.5,n3=3.5;
	if (n1>=n2 && n1>=n3) 
		System.out.println(n1+" is the largest number..");
	
	else if(n2>=n1 && n2>=n3) 
		System.out.println(n2+ "is the largest Number");
	
	else 
		System.out.println(n3 +" is the Largest Number..");
}
public static void low() {
	double n1=-5.5,n2=4.5,n3=3.5;
	if (n1<=n2 && n1<=n3) 
		System.out.println(n1+" is the lowest number..");
	
	else if(n2<=n1 && n2<=n3) 
		System.out.println(n2+ "is the lowest Number");
	
	else 
		System.out.println(n3 +" is the lowest Number..");
}

}
