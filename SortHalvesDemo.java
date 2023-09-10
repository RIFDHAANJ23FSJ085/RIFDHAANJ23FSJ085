package zoho;

import java.util.Arrays;
import java.util.Scanner;

public class SortHalvesDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        sortHalfAscendingDescending(arr);
        
        for (int num : arr) {
            System.out.print(num + " ");
        }
        scanner.close();
    }
    
    public static void sortHalfAscendingDescending(int[] arr) {
        int length = arr.length;
        int mid = length / 2;
        
        // Sort the entire array
        Arrays.sort(arr);
        
        // Sort the first half in ascending order
        for (int i = 0; i < mid / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[mid - i - 1];
            arr[mid - i - 1] = temp;
        }
        
        // Sort the second half in descending order
        for (int i = mid; i < (mid + length) / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[length - i + mid - 1];
            arr[length - i + mid - 1] = temp;
		}
	}
}
