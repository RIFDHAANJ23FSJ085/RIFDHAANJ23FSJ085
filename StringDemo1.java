package zohoString;

import java.util.Scanner;

public class StringDemo1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String nc=sc.nextLine();
		String st=StringDemo1.longestPalindrome(nc);
		System.out.println(st);
		sc.close();
	}


public static String longestPalindrome(String s) {
    int n = s.length();
    String res = null;
    boolean[][] dp = new boolean[n][n];
    
    for (int i = n - 1; i >= 0; i--) {
        for (int j = i; j < n; j++) {
            dp[i][j] = s.charAt(i) == s.charAt(j) && (j - i < 3 || dp[i + 1][j - 1]);
            
            if (dp[i][j] && (res == null || j - i + 1 > res.length())) {
                res = s.substring(i, j + 1);
            }
        }
    }
    
    return res;
}
}