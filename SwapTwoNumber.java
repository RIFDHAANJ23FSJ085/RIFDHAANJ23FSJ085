package openlabbook1;

public class SwapTwoNumber {
public static void main(String[] args) {
	
	float first=2.50f,second =4.50f;
	
	System.out.println("--Before Swap--");
	System.out.println("First Number :"+first);
	System.out.println("Second Number :"+second);

	float temp=first;
	first=second;
	second=temp;
	System.out.println();
	System.out.println("After swap");
	System.out.println("First "+first);
	System.out.println("second "+second);

}
}
