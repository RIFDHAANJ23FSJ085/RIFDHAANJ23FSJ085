package zohoString;

import java.util.Stack;

public class ValidBracketsDemo {

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter brakets");
//		String r=sc.next();
//		sc.close();
		ValidBracketsDemo.isValid("[]() ");
	}
	 public static boolean isValid(String s) {
	        Stack<Character> stack = new Stack<>();
	        for (char c : s.toCharArray()) {
	            if (c == '(' || c == '{' || c == '[') {
	                stack.push(c);
	            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
	                stack.pop();
	            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
	                stack.pop();
	            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
	                stack.pop();
	            } else {
	                return false;
	            }
	        }
	        return stack.isEmpty();
	    }
	
}

