package zoho;

import java.util.Stack;

public class StackOverFlowUnderFlowDemo {

	public static void main(String[] args) {
		
		Stack<Integer> s=new Stack<>();
		s.push(5);
		s.push(4);
		s.push(17);
		s.push(10);
		System.out.println(s);
		
		if (s.size()<2) {
			System.out.println("Stack UnderFlow");
		}
		else {
			s.push(15);
			
		}
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
			if(s.isEmpty()) {
				System.out.println("Stack underflow");
				
			}else {
				System.out.println (s.pop());
			}
	}
}
