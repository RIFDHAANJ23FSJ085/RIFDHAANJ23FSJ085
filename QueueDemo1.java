package zoho;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueDemo1 {

	public static void main(String[] args) {
		
		PriorityQueue<String> queue=new PriorityQueue<String>();//(s1,s2)->{return s2.compareTo(s1);});
		
		queue.add("Haaris");
		queue.add("infoTech");
		queue.add("Golden");
		queue.add("Touch");
		queue.add("Aspire");
		
		System.out.println("Head: "+queue.element());
		System.out.println();
		
		System.out.println("Head"+queue.peek());
		System.out.println();
		System.out.println("Iterating the queue Elements");
		
		Iterator<String> itr=queue.iterator();
		while(itr.hasNext()) {
			System.err.println(itr.next());
		}
		
		System.out.println();
		System.out.println(queue.remove());
		
		System.out.println();
		Iterator<String> itr2=queue.iterator();
		while(itr2.hasNext()) {
			System.err.println(itr2.next());
		}
		
		System.out.println();
		System.out.println(queue.poll());
		
		System.out.println("after Removing two elements..");
		
		Iterator<String> itr21=queue.iterator();
		while(itr21.hasNext()) {
			System.err.println(itr21.next());
		}
		
		
		
		
	}
}
