package closeLabBook;

public class Program6 {

// note : array are homogeneous 
	// array size cant be changed..
	// array structure is predefined.
	
	//Use System's arraycopy( ) method to efficiently copy data from one array into another.
//	The arraycopy( ) method requires five arguments:
	
	// to overcome this go with collections.
	public static void main(String[] args) {
		int[] arr=new int[5];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		System.out.println();
		arr=new int[6];
		arr[5]=6;
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		System.out.println(arr[5]);
	}
}
