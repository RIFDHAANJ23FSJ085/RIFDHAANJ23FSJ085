package zoho;

import java.util.ArrayDeque;
import java.util.Deque;

public class DQueueStackDemo {
public static void main(String[] args) {
	
	Deque<String> deque=new ArrayDeque<String>();
	
	deque.offer("Ramesh");
	deque.offer("Rifdhan");
	deque.add("Fuzail");
	deque.offer("Sahil");
	
	System.out.println(deque);
	
	deque.offerFirst("Zaquer");
	System.out.println();
	System.out.println(deque);
	
	System.out.println();

	System.err.println(deque.poll());
	System.out.println();
	System.err.println(deque.pollFirst());
	System.out.println();
	System.err.println(deque.pollLast());
	System.out.println();
	for(String s:deque) {
		System.out.println(s);
	}

}

}
