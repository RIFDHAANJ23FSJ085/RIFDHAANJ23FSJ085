package zoho;

import java.util.Stack;

public class StackDemo {
public static void main(String[] args) {
	
	Stack<Integer> s=new Stack<>();
	s.add(5);
	s.add(10);
	s.add(15);
	
	System.out.println("Top Element:"+s.peek());
	System.out.println("popped : "+s.pop());
	System.out.println(s);
	System.out.println("popped : "+s.pop());
	System.out.println(s);
	System.out.println(" is Empty :"+s.isEmpty());
}
}
